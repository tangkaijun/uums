package com.kjtang.uums.core.entity;

import com.kjtang.uums.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by kjtang on 2018/3/17.
 */
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
