package com.kjtang.uums.common.base;

import java.io.Serializable;

/**
 * Created by kaijun on 2018/3/17.
 */
public interface BaseService<T,ID extends Serializable> {

    public void add(T entity);

    public void update(T entity);

    public void delete(T entity);

    public T getById(ID id);

}
