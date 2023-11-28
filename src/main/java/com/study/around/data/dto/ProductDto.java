package com.study.around.data.dto;

import com.study.around.data.entity.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	private String id;
	private String name;
	private int price;
	private int stock;
	
	public ProductEntity toEntity() {
		ProductEntity productEntity = new ProductEntity(id, name, price, stock);
		
		return productEntity;
	}
}
