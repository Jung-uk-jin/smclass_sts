package com.java.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.BoardMapper;
import com.java.dto.BoardDto;

@Service
public class BoardSeriveceImpl implements BoardService {

	@Autowired BoardMapper boardMapper;
	
	@Override //전체리스트
	public ArrayList<BoardDto> blist() {
		ArrayList<BoardDto> list = boardMapper.selecta();
		return list;
	}

	@Override
	public void bwrite(BoardDto bdto) {
		// TODO Auto-generated method stub
		boardMapper.insertBoard(bdto);
	}

}
