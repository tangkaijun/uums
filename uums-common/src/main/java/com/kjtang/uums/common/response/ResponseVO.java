package com.kjtang.uums.common.response;

import com.kjtang.uums.common.base.BaseEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by kaijun on 2018/3/17.
 */
@ApiModel("响应实体")
public class ResponseVO<T> {

    @ApiModelProperty("响应数据")
    private T data;

    @ApiModelProperty("状态")
    private Integer status;

    @ApiModelProperty("状态描述信息")
    private String msg;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
