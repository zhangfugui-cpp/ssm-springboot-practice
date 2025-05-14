package com.ztx.pojo;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;

/**
 * projectName: com.atguigu.pojo
 *
 * description: 任务实体类
 */
@Data
public class Schedule {

    private Integer id;
    @NotBlank
    private String title;
    @NonNull
    private Boolean completed;
}
