package com.java.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.BoardMapper;
import com.java.dto.BoardDto;

@Service
public class BServiceImpl implements boardss {
	
	@Autowired BoardMapper boardMapper;
		
	@Override
	public ArrayList blist() {
		System.out.println("BServiceImpl : 정상" );
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		list = boardMapper.blist();
		return list;
		
	}

}
