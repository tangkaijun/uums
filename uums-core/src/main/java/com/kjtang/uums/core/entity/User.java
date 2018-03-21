package com.kjtang.uums.core.entity;

import com.kjtang.uums.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Created by kjtang on 2018/3/17.
 */
@Data
@ApiModel("用户实体")
public class User extends BaseEntity<Long>{

    @ApiModelProperty("登陆账号")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("性别：1-代表男,0-代表女 ")
   private Integer gender;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("联系电话")
    private String phone;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    private Date modifyTime;

}
