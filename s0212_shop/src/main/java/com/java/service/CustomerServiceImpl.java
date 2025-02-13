package com.java.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.CustomerMapper;
import com.java.dto.BoardDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired CustomerMapper customerMapper;
	
	@Override
	public ArrayList<BoardDto> notice() {
		ArrayList<BoardDto> list = customerMapper.selectAll();
		return list;
	}

	@Override
	public Map<String, Object> nview(int bno) {
		Map<String, Object> map = new HashMap<>();
		BoardDto boardDto = customerMapper.selectOne(bno);
		BoardDto prevDto = customerMapper.selectOnePrev(bno);
		BoardDto nextDto = customerMapper.selectOneNext(bno);
		
		return map;
	}

}
