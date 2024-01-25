package com.study.mybatis.data.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.study.mybatis.data.dto.MybatisDto;

@Mapper
public interface MybatisDao {
	@Select("SELECT * FROM BOARD")
	public List<MybatisDto> getList();
}
