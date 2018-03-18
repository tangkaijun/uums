package com.kjtang.uums.common.base;

import com.kjtang.uums.common.response.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;


/**
 * Created by kaijun on 2018/3/17.
 */
public abstract class BaseController<T,ID extends Serializable> {

    protected Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    public abstract ResponseVO<T> add(T entity);

    public abstract ResponseVO<T> update(T entity);

    public abstract ResponseVO<T> delete(T entity);

    public abstract T getById(ID id);

}
