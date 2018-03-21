package com.kjtang.uums.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kaijun on 2018/3/17.
 * 此类中的方法一般都要进行重新才符合实际的需求
 */
public abstract  class AbstractService<T extends BaseEntity,ID extends Serializable> implements BaseService<T,ID>{

    protected Logger LOGGER = LoggerFactory.getLogger(AbstractService.class);

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
        LOGGER.trace("更新方法默认实现");
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

    @Override
    public List<? extends T> getList() {
        return null;
    }
}
