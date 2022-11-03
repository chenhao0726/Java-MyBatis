package com.chen.test;

import com.chen.dao.IProductDao;
import com.chen.dao.impl.ProductDaoImpl;
import com.chen.domain.Product;
import org.junit.Test;

import java.util.List;

public class ProductTest {
    private IProductDao productDao = new ProductDaoImpl();

    @Test
    public void selectByIdTest() {
        Product product = productDao.selectById(1L);
        System.out.println(product);
    }

    @Test
    public void selectAllTest() {
        List<Product> products = productDao.selectAll();
        products.forEach(System.out::println);
    }

    @Test
    public void deleteIdTest() {
        int i = productDao.deleteId(22L);
        System.out.println(i);
    }

    @Test
    public void updateTest() {
        Product product = new Product(23L,"罗技M200",2L,357d,"罗技","罗技",0.6,150d);
        int update = productDao.update(product);
        System.out.println(update);
    }

    @Test
    public void saveTest() {
        // 1	罗技M90	3	90.00	罗技	罗技	0.50	35.00
        Product product = new Product("罗技M199",3L,278d,"罗技","罗技",0.8,105d);
        int save = productDao.save(product);
        // 输出并获取key id
        System.out.println(save + "===id：" + product.getId());
    }

    @Test
    public void savePartTest() {
        Product product = new Product("罗技M210",3L,278d,null,null,null,null);
        productDao.savePart(product);
    }
}
