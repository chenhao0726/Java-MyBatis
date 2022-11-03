package com.chen.dao.impl;

import com.chen.dao.IProductDao;
import com.chen.domain.Product;
import com.chen.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ProductDaoImpl implements IProductDao {
    private Logger log = LoggerFactory.getLogger(ProductDaoImpl.class);

    @Override
    public Product selectById(Long id) {
        SqlSession session = MybatisUtil.getSession();
        log.info("进入了方法........");
        String statement = "com.chen.mapper.ProductMapper.selectById";
        Product product = session.selectOne(statement, id);
        return product;
    }

    @Override
    public List<Product> selectAll() {
        SqlSession session = MybatisUtil.getSession();
        String statement = "com.chen.mapper.ProductMapper.selectAll";
        List<Product> list = session.selectList(statement);
        return list;
    }

    @Override
    public int deleteId(Long id) {
        SqlSession session = MybatisUtil.getSession();
        String statement = "com.chen.mapper.ProductMapper.deleteId";
        int delete = session.delete(statement, id);
        session.commit();
        return delete;
    }

    @Override
    public int update(Product p) {
        SqlSession session = MybatisUtil.getSession();
        String statement = "com.chen.mapper.ProductMapper.update";
        int update = session.update(statement, p);
        session.commit();
        return update;
    }

    @Override
    public int save(Product p) {
        SqlSession session = MybatisUtil.getSession();
        String statement = "com.chen.mapper.ProductMapper.save";
        int insert = session.insert(statement, p);
        session.commit();
        return insert;
    }

    @Override
    public int savePart(Product p) {
        SqlSession session = MybatisUtil.getSession();
        String statement = "com.chen.mapper.ProductMapper.savePart";
        int insert = session.insert(statement, p);
        session.commit();
        return insert;
    }

}
