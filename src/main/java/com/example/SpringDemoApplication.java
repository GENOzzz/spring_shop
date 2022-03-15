package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller @ResponseBody
@SpringBootApplication//@ComponentScan + @EnableAutoConfiguration
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@GetMapping(value="/")
	public String HelloWorld(){
		return "<table border='1'>" +
				"<tr>" +
				"<td>Hello</td>"+
				"<td>World</td>"+
				"</tr>"+
				"<tr>" +
				"<td>Bye</td>"+
				"<td>World</td>"+
				"</tr>"+
				"</table>";
	}

}



