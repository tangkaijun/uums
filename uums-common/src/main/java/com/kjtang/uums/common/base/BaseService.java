package com.kjtang.uums.common.base;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kaijun on 2018/3/17.
 */
public interface BaseService<T,ID extends Serializable> {

    /**
     * 新增实体
     * @param entity
     */
    public void add(T entity);

    /**
     * 更新实体
     * @param entity
     */
    public void update(T entity);

    /**
     * 删除实体
     * @param entity
     */
    public void delete(T entity);

    /**
     * 通过id查询实体详细信息
     * @param id
     * @return
     */
    public T getById(ID id);

    public List<? extends T> getList();

}
