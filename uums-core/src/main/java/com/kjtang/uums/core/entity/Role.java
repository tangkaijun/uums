package com.kjtang.uums.core.entity;

import com.kjtang.uums.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by kaijun on 2018/3/17.
 */
@ApiModel("角色实体")
public class Role extends BaseEntity<Long>{

    @ApiModelProperty("角色名称")
    private String name;



}
