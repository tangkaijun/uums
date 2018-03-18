package com.kjtang.uums.common.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * Created by kaijun on 2018/3/17.
 */
public abstract  class AbstractService<T extends BaseEntity,ID extends Serializable> implements BaseService<T,ID>{


    private BaseMapper<T,ID> baseMapper;

    public void setBaseMapper(BaseMapper<T, ID> baseMapper) {
        this.baseMapper = baseMapper;
    }

    @Override
    public void add(T entity) {
      //  baseMapper.insert(entity);
    }

    @Override
    public void update(T entity) {
        baseMapper.update(entity);
    }

    @Override
    public void delete(T entity) {
        baseMapper.delete(entity);
    }

    @Override
    public T getById(ID id) {
        return baseMapper.getById(id);
    }

}
