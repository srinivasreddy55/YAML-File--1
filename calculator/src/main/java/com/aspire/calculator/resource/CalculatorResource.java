package com.aspire.calculator.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorResource {

	@RequestMapping(value = "/add/{x}/{y}", method = RequestMethod.GET)
	public int add(@PathVariable int x, @PathVariable int y) {
		return x + y;
	}
	
	@RequestMapping(value = "/sub/{x}/{y}", method = RequestMethod.GET)
	public int sub(@PathVariable int x, @PathVariable int y) {
		return x - y;
	}
	
	@RequestMapping(value = "/mul/{x}/{y}", method = RequestMethod.GET)
	public int mul(@PathVariable int x, @PathVariable int y) {
		return x * y;
	}
	
	@RequestMapping(value = "/div/{x}/{y}", method = RequestMethod.GET)
	public int div(@PathVariable int x, @PathVariable int y) {
		return x / y;
	}

}
