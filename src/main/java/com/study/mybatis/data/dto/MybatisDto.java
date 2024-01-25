package com.study.mybatis.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MybatisDto {
	private int id;
	private String title;
	private String content;
	private String name;
	private int hit;
	private String reg_date; 
	private String chg_date;
}
