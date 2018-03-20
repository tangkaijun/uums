package com.kjtang.uums.core.entity;

import com.kjtang.uums.common.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
/**
 * Created by kaijun on 2018/3/17.
 */
@Data
@ApiModel("权限实体")
public class Permission extends BaseEntity<Long>{

    @ApiModelProperty("权限名称")
    private String name;

    @ApiModelProperty("权限类型:1-代表目录,2-代表菜单,3-代表操作")
    private Integer type;

    @ApiModelProperty("菜单图标")
    private String icon;

    @ApiModelProperty("权限URL")
    private String url;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("最后修改时间")
    private Date modifyTime;

    /**
     * 权限类型常量定义
     */
    public static final Integer PERMISSION_TYPE_DIR = 1;//目录
    public static final Integer PERMISSION_TYPE_MENU = 2;//菜单
    public static final Integer PERMISSION_TYPE_OPERATOR = 3;//操作

    /*
        ---------------------getter and setter-------------------------
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
