package com.java.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.Dao.BoardMapper;
import com.java.Dto.BoardDto;

@Service
public class BServiceImpl implements boardss {

	@Autowired BoardMapper boardMapper;
	
	@Override
	public ArrayList<BoardDto> blist() {
		// TODO Auto-generated method stub
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		list = boardMapper.blist();
		System.out.println(list.size());
		return list;
	}

}
