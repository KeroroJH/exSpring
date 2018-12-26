package org.kro.web;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kro.domain.MemberVO;
import org.kro.persistence.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/root-context.xml"})
public class MemberDAOTest {
	
	@Autowired
	private MemberDAO dao;

	@Test
	public void testTime() {
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertMember() throws Exception {
		MemberVO vo = new MemberVO("idid", "pwpw", "namename", "email@email.com");
		dao.insertMember(vo);
	}

}
