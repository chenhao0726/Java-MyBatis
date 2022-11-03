package com.chen.dao;

import com.chen.domain.Product;

import java.util.List;

public interface IProductDao {
    /**
     * 根据id查一个
     */
    Product selectById(Long id);
    /**
     * 查询全部
     */
    List<Product> selectAll();
    /**
     * 删除
     */
    int deleteId(Long id);
    /**
     * 更新
     */
    int update(Product p);

    /**
     * 新增
     */
    int save(Product p);

    /**
     * 部分字段
     * @param p
     */
    int savePart(Product p);
}
