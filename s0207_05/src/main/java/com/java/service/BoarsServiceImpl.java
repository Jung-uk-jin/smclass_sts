package com.java.service;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.BoardMapper;
import com.java.dto.BoardDto;

@Service
public class BoarsServiceImpl implements BoardService {

	@Autowired BoardMapper boardMapper;
	
	@Override
	public ArrayList<BoardDto> blist() {
		// TODO Auto-generated method stub
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		list = boardMapper.blist();
		return list;
	}

}
