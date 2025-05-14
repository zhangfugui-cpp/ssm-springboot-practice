package com.ztx.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringIoCInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    //rootioc容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{MapperJavaConfig.class, ServiceJavaConfig.class, DataSourceJavaConfig.class};
    }

    //webioc容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcJavaConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
