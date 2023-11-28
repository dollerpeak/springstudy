package com.study.around.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.around.data.dto.ProductDto;
import com.study.around.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;	
	ProductDto productDto;

	@GetMapping("/get/{productid}")
	public ProductDto getProduct(@PathVariable String productid) {
		productDto = productService.getProduct(productid);
		
		return productDto;
	}

	@PostMapping("/post")
	public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productdto) {
		productDto = productService.saveProduct(productdto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(productDto);
	}

//	// http://localhost:8080/product/{productId}
//	@GetMapping(value = "/{productId}")
//	public ProductDto getProduct(@PathVariable String productId) {
//
//		long startTime = System.currentTimeMillis();
////		LOGGER.info("[getProduct] perform {} of Around Hub API.", "getProduct");
//
////		ProductDto productDto = productService.getProduct(productId);
//
////		LOGGER.info(
////				"[getProduct] Response :: productId = {}, productName = {}, productPrice = {}, productStock = {}, Response Time = {}ms",
////				productDto.getProductId(), productDto.getProductName(), productDto.getProductPrice(),
////				productDto.getProductStock(), (System.currentTimeMillis() - startTime));
//		
//		ProductDto productDto = new ProductDto();
//		
//		return productDto;
//	}
//
//	// http://localhost:8080/api/v1/product-api/product
////	@ApiImplicitParams({
////			@ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 access_token", required = true, dataType = "String", paramType = "header") })
//	@PostMapping(value = "/product")
//	public ResponseEntity<ProductDto> createProduct(@Valid @RequestBody ProductDto productDto) {
////		LOGGER.info("[createProduct] perform {} of Around Hub API.", "createProduct");
//
//		// Validation Code Example
//		if (productDto.getId().equals("") || productDto.getId().isEmpty()) {
////			LOGGER.error("[createProduct] failed Response :: productId is Empty");
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(productDto);
//		}
//
//		String productId = productDto.getId();
//		String productName = productDto.getName();
//		int productPrice = productDto.getPrice();
//		int productStock = productDto.getStock();
//
//		ProductDto response = productService.saveProduct(productId, productName, productPrice, productStock);
//
////		LOGGER.info(
////				"[createProduct] Response >> productId : {}, productName : {}, productPrice : {}, productStock : {}",
////				response.getProductId(), response.getProductName(), response.getProductPrice(),
////				response.getProductStock());
//		
//		return ResponseEntity.status(HttpStatus.OK).body(response);
//	}
//
////	// http://localhost:8080/api/v1/product-api/product/{productId}
//////	@ApiImplicitParams({
//////			@ApiImplicitParam(name = "X-AUTH-TOKEN", value = "로그인 성공 후 access_token", required = true, dataType = "String", paramType = "header") })
////	@DeleteMapping(value = "/product/{productId}")
////	public ProductDto deleteProduct(@PathVariable String productId) {
////		return null;
////	}
////
////	@PostMapping(value = "/product/exception")
////	public void exceptionTest() throws AroundHubException {
////		throw new AroundHubException(ExceptionClass.PRODUCT, HttpStatus.FORBIDDEN, "접근이 금지되었습니다.");
////	}
}
