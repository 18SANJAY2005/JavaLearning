package com.sanjay.webapplicationdemo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebapplicationdemoApplication {
	private static final String template = "Hello, %s!";
	private static Object name;
	private final AtomicLong counter = new AtomicLong();

	public static void main(String[] args) {
		SpringApplication.run(WebapplicationdemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		System.out.println("hello method executed");
		return String.format("<h1>Hello %s!</h1>", name);
	}

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/checkPalindrome")
	public String checkPalin(@RequestParam(value = "name", defaultValue = "World") String name) {
		StringUtil sU = new StringUtil(name);
		return sU.toString();

	}



	@GetMapping("/checkPalindromeRestService")
	public Palindrome checkPalinRest(@RequestParam(value = "name", defaultValue = "World") String name) {
		StringUtil sU = new StringUtil(name);
		return new Palindrome(name, sU.checkifPalindrome());
	}

}
