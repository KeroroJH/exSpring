package org.kro.persistence;

import org.apache.ibatis.session.SqlSession;
import org.kro.domain.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public String getTime() {
		return sqlsession.selectOne("member.getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlsession.insert("member.insertMember", vo);
		
	}

}
