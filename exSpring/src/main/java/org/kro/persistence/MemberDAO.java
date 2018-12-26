package org.kro.persistence;

import org.kro.domain.MemberVO;

public interface MemberDAO {
	
	public String getTime();
	
	public void insertMember(MemberVO vo);

}
