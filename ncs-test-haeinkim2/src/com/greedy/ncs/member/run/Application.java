package com.greedy.ncs.member.run;

import com.greedy.ncs.member.model.dto.MemberDTO;


public class Application {

	public static void main(String[] args) {
		
		MemberDTO member = new MemberDTO("memberid", 1234, "myname", java.util.Calendar.DATE, 170.1, 60.3, false, 38892);
	}


}
