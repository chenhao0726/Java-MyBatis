package cn.ronghuanet._01mybatis._01demo.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.ronghuanet._01mybatis._01demo.dao.IProductDao;
import cn.ronghuanet._01mybatis._01demo.dao.impl.ProductDaoImpl;
import cn.ronghuanet._01mybatis._01demo.domain.Product;

public class MybatisTest {
	private IProductDao dao = new ProductDaoImpl();
	
	@Test
	public void test1() throws Exception {
		/*
		 * 想要启动框架 -- 就要获取核心对象
		 * sqlSession - sqlSessionFactory - sqlSessionFactoryBuilder - mybatis-config.xml
		 */
		// 读取文件
		String resource = "mybatis-config.xml";
		// 读取配置文件
		InputStream in = Resources.getResourceAsStream(resource);
		// 通过建造者 建造SqlSessionFactory工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
		// 通过SqlSessionFactory工厂获取 SqlSession 对象
		SqlSession sqlSession = factory.openSession();
		System.out.println(sqlSession);
	}


	@Test
	public void testSelectById() throws Exception {
		System.out.println(dao.selectById(1L));
	}
	
	@Test
	public void testSelectAll() throws Exception {
		dao.selectALL().forEach(System.out::println);
	}
	
	@Test
	public void testDelete() throws Exception {
		dao.delete(1L);
	}
	
	@Test
	public void testUpdate() throws Exception {
		Product selectById = dao.selectById(2L);
		selectById.setSalePrice(9999.0);
		dao.update(selectById);
	}
	@Test
	public void testSave() throws Exception {
		Product selectById = dao.selectById(2L);
		selectById.setSalePrice(888.0);
		selectById.setId(null);
		dao.save(selectById);
	}
}
