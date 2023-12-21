package com.jdbc.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jdbc.dao.고객DAO;
import com.jdbc.datasource.DataSource;
import com.jdbc.dto.고객VO;



public class Test고객DAO {
	
	private DataSource dataSource;
	private 고객DAO dao = new 고객DAO();
	
	@Before
	public void init() {
		dataSource = MockDataSource.getInstance();
		dao.setDataSource(dataSource);
	}
	
	
	@Test
	public void test1()throws Exception {
		List<고객VO> 고객리스트 = dao.selectList();
		
		Assert.assertEquals(7, 고객리스트.size());
	}
	
	@Test
	public void test2() {}
	
	@Test
	public void test3() {}
}






