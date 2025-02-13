package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data //get,set
@NoArgsConstructor // 기본생성자
@AllArgsConstructor // 전체생성자

public class MemberDto {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String gender;
	private String hobby;
	private String kor;
	private String eng;
	
	
}
