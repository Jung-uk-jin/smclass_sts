package com.java.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.BMapper;
import com.java.dto.BoardDto;

@Service
public class BServiceImpl implements boardss {

	@Autowired BMapper bMapper;
	
	@Override
	public ArrayList<BoardDto> blist() {
		ArrayList<BoardDto> list = bMapper.blist();
		System.out.println("BserviceImpl 개수: " +list.size());
		return null;
	}

	
}
