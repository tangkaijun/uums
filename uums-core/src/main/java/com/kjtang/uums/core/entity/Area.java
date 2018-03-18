package com.kjtang.uums.core.entity;

/**
 * Created by kaijun on 2018/3/17.
 */

import com.kjtang.uums.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel("区域实体，该实体表示地区，是一个树状结构")
public class Area extends BaseEntity<Long>{

    @ApiModelProperty("区域名称")
    private String name;

    @ApiModelProperty("区域编码，唯一")
    private String code;

    @ApiModelProperty("父区域Id")
    private Long pid;



}
