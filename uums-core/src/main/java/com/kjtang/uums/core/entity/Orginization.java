package com.kjtang.uums.core.entity;

import com.kjtang.uums.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by kaijun on 2018/3/17.
 */
@ApiModel("部门实体")
public class Orginization extends BaseEntity<Long>{

    @ApiModelProperty("部门名称")
    private String name;

    @ApiModelProperty("部门描述")
    private String description;
}
