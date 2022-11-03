package cn.ronghuanet._01mybatis._01demo.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.ronghuanet._01mybatis._01demo.dao.IProductDao;
import cn.ronghuanet._01mybatis._01demo.domain.Product;
import cn.ronghuanet._01mybatis._01util.MybatisUtil;

public class ProductDaoImpl implements IProductDao{
	private Logger log = LoggerFactory.getLogger(ProductDaoImpl.class);
	@Override
	public Product selectById(Long id) throws Exception {
		log.info("进入了方法查一个的方法.....");
		// 读取配置文件
//		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//		// 创建工厂
//		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
//		// 获取sqlsession
//		SqlSession session = build.openSession();
		SqlSession session = MybatisUtil.getSession();
		// 通过session 执行sql
		/*
		 * 第一个参数是: sql的路径
		 * 第二个参数是: id
		 */
		String sql = "cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.selectById";
		Product pro = session.selectOne(sql, id);
		session.close();
		return pro;
	}

	@Override
	public List<Product> selectALL() throws Exception {
		// 读取配置文件
//		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//		// 创建工厂
//		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
//		// 获取sqlsession
//		SqlSession session = build.openSession();
		SqlSession session = MybatisUtil.getSession();
		// 通过session 执行sql
		String sql = "cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.selectAll";
		List<Product> pro = session.selectList(sql);
		return pro;
	}

	@Override
	public void delete(Long id) throws Exception {
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession openSession = build.openSession();
		SqlSession session = MybatisUtil.getSession();
		String sql = "cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.delete";
		session.delete(sql,id);
		session.close();
	}

	@Override
	public void update(Product p) throws Exception {
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession openSession = build.openSession();
		SqlSession session = MybatisUtil.getSession();
		String sql = "cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.update";
		session.update(sql, p);
		session.close();
	}

	@Override
	public void save(Product p) throws Exception {
//		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession openSession = build.openSession();
		SqlSession session = MybatisUtil.getSession();
		String sql = "cn.ronghuanet._01mybatis._01demo.mapper.ProductMapper.save";
		session.insert(sql, p);
		session.close();
	}



}
