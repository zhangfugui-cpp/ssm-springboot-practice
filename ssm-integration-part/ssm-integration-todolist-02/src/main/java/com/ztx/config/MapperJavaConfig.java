package com.ztx.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.AutoMappingBehavior;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@MapperScan("com.ztx.mapper")
public class MapperJavaConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        //指定mybatis配置文件功能，使用代码形式
        org.apache.ibatis.session.Configuration configuration
                = new org.apache.ibatis.session.Configuration();

        configuration.setMapUnderscoreToCamelCase(true);//驼峰映射
        configuration.setLogImpl(Slf4jImpl.class);
        configuration.setAutoMappingBehavior(AutoMappingBehavior.FULL);

        sqlSessionFactoryBean.setConfiguration(configuration);

        sqlSessionFactoryBean.setTypeAliasesPackage("com.ztx.pojo");

        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", "mysql");
        pageInterceptor.setProperties(properties);
        sqlSessionFactoryBean.addPlugins(pageInterceptor);

        /*
        * Resource resource=new ClassPathResource("mybatis-config.xml");
        * sqlSessionFactoryBean.setSonfigLocation(resource);
        * */

        return sqlSessionFactoryBean;
    }
}
