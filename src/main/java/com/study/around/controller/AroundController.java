package com.study.around.controller;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.around.dto.AroundDTO;

@RestController
@RequestMapping("/around")
public class AroundController {

	@GetMapping("/test1")
	public String test1() {
		// http://localhost:8081/around/test1
		// 파라메터가 없는 경우
		return "hell world";
	}

	// default는 @RequestParam으로 작동함
	@GetMapping("/test2")
	public String test2(@RequestParam String name) {
		// http://localhost:8081/around/test2
		// - 파라메터가 없어도 에러가 안남
		// - name말고 다른 파라메터로 넘어가도 에러 안남
		// System.out.println("name = " + name);
		return name;
	}

	// ///////////////////////////////////////////////////////////////////////////
	// @RequestParam test
	// ///////////////////////////////////////////////////////////////////////////
	@GetMapping("/test3")
	public String test3(@RequestParam(defaultValue = "default") String name) {
		// http://localhost:8081/around/test3?name=value
		// - 파라메터가 없어도 에러 발생하지 않고 디폴트값 출력
		// - name말고 다른 파라메터로 넘겨도 에러나지 않고 디폴트값 출력
		return name;
	}

	// required는 동일명의 파라메터가 있는지만 체크
	// required로 에로 조건이라도 defaultValue값이 있으면 에러는 발생 안함
	@GetMapping("/test4")
	public String test4(@RequestParam(required = false, defaultValue = "default") String name) {
		// http://localhost:8081/around/test4?name=value
		return name;
	}

	@GetMapping("/test5")
	public String test5(@RequestParam(required = true, defaultValue = "default") String name) {
		// http://localhost:8081/around/test5?name=value
		return name;
	}

	@GetMapping("/test6")
	public String test6(@RequestParam(value = "name", defaultValue = "default") String value) {
		// http://localhost:8081/around/test5?name=value
		// - value = "name"과 uri의 동일값으로 value에 적용됨
		return value;
	}

	@GetMapping("/test7")
	public String test7(String value1, String value2) {
		// http://localhost:8081/around/test7?value1=aaa&value2=bbb
		// - value = "name"과 uri의 동일값으로 value에 적용됨
		return value1 + value2;
	}

	// @RequestParam, map파라메터 예제
	// - URL은 동일하고 변수가 키가 된다.
	@GetMapping("/test71")
	public String test71(@RequestParam Map<String, String> map) {
		// http://localhost:8081/around/test71?value1=aaa&value2=bbb
		// System.out.println(map.toString());

		String result = "";
		for (Entry<String, String> entry : map.entrySet()) {
			result += entry.getKey() + entry.getValue();
		}

		return result;
	}

	// ///////////////////////////////////////////////////////////////////////////
	// @PathVariable test
	// ///////////////////////////////////////////////////////////////////////////
	@GetMapping("/test8/{name}")
	public String test8(@PathVariable String name) {
		// http://localhost:8081/around/test8/value
		return name;
	}

	// @PathVariable도 value = "name" 옵션은 사용 가능함
	@GetMapping("/test9/{name}")
	public String test9(@PathVariable(value = "name") String value) {
		// http://localhost:8081/around/test9/value
		return value;
	}

	// @PathVariable, 여러개도 가능
	@GetMapping("/test10/{value1}/{value2}")
	public String test10(@PathVariable String value1, @PathVariable String value2) {
		// http://localhost:8081/around/test10/aaa/bbb
		return value1 + value2;
	}

	// @PathVariable, 여러개도 가능
	@GetMapping("/test101/1/{value1}/2/{value2}")
	public String test101(@PathVariable String value1, @PathVariable String value2) {
		// http://localhost:8081/around/test101/1/abb/2/bcc
		return value1 + value2;
	}

	// ///////////////////////////////////////////////////////////////////////////
	// DTO로 받는 방법
	// - @RequestParam, @PathVariable, @RequestBody 사용하지 않는다.
	// ///////////////////////////////////////////////////////////////////////////
	@GetMapping("/test11")
	public String test11(AroundDTO dto) {
		// http://localhost:8081/around/test11?id=a&name=b&age=10
		// System.out.println(dto.toString());
		return dto.toString();
	}

	// @PathVariable :
	// - URL에 값만 담아 보낸다.
	// - mapping url에 {}파라메터명과 변수가 같아야 한다. (value옵션 사용가능)
	// @RequestParam
	// - URL에 ?부터 변수와 값을 담아 보내고 연속된 구분자는 &사용 (key, value와 동일)
	// - mapping url에는 URL만 표기, ?전가지만 표기 (value, required, defaultValue 사용가능)
	// - Map, DTO로 값을 받을 수 있다.
	// @RequestBody
	// - 주로 POST에 사용되고 request body부분에 json형식으로 값을 보낸다.
	// - 주로 DTO로 값을 받는다.
	
	post테스트 할때 @RequestParam, @PathVariable로 값을 처리해 보자.
	
	
	

}
