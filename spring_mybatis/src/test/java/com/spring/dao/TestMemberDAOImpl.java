package com.spring.dao;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dto.MemberVO;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/spring/context/root-context.xml")
@Transactional
public class TestMemberDAOImpl {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void testSelectMemberList()throws Exception{
		List<MemberVO> memberList = memberDAO.selectList();
		Assert.assertEquals(7, memberList.size());
	}
	
	@Test
	public void testSelectMemberById()throws Exception{
		String testId = "mimi";
		MemberVO member = memberDAO.selectMemberById(testId);
		Assert.assertEquals(member.getId(), testId);
	}
}






