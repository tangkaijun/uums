package com.kjtang.uums.core.entity;

import com.kjtang.uums.common.base.BaseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by kaijun on 2018/3/20.
 */
@Data
@ApiModel("应用实体")
public class App extends BaseEntity<Long>{

    @ApiModelProperty("应用名称")
    private String name;

    @ApiModelProperty("应用编码")
    private String appId;

    @ApiModelProperty("密钥")
    private String secret;

    @ApiModelProperty("回调地址")
    private String redirectUri;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    private Date modifyTime;

}
