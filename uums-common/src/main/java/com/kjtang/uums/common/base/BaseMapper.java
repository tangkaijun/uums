package com.kjtang.uums.common.base;

import java.util.List;

/**
 * Created by kaijun on 2018/3/17.
 */

public interface BaseMapper<T,ID> {

    /**
     * 插入实体
     * @param entity
     * @return
     */
    public ID insert(T entity);

    /**
     * 修改实体
     * @param entity
     */
    public void update(T entity);

    /**
     * 删除实体
     * @param entity
     */
    public void delete(T entity);

    /**
     * 查询所有列表信息
     * @return
     */
    public List<T> getAllList();

    /**
     * 通过Id查询实体
     * @param id
     * @return
     */
    public T getById(ID id);

}
