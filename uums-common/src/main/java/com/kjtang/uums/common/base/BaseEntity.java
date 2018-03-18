package com.kjtang.uums.common.base;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created by kaijun on 2018/3/17.
 */

public class BaseEntity<ID> implements Serializable {

    @ApiModelProperty("当前页")
    private Integer curPage;

    @ApiModelProperty("每页记录数")
    private Integer pageSize;

    @ApiModelProperty("主键")
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
