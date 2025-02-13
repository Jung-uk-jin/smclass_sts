package com.java.Dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.java.Dto.BoardDto;

@Mapper
public interface BoardMapper {
	ArrayList<BoardDto> blist();
}
