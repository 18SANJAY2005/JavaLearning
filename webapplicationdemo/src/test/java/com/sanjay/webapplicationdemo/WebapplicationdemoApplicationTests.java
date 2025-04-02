package com.sanjay.webapplicationdemo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebapplicationdemoApplicationTests {
	@Autowired
	private WebapplicationdemoApplication app1;

	@Test
	void contextLoads() {
	}
	
	@Test 
	void testHelloWorld() {
		String result = app1.hello("World");
		assertThat(result).isEqualTo("<h1>Hello World!</h1>");
	}
	
	@Test 
	void testHelloSanjay() {
		String result = app1.hello("Sanjay");
		assertThat(result).isEqualTo("<h1>Hello Sanjay!</h1>");
	}
	@Test 
	void testPalinMomPositive() {
		String result = app1.checkPalin("mom");
		assertThat(result).isEqualTo("<h1>mom! is Palindrome </h1>");
	}
	@Test 
	void testPalinSanjaynegative() {
		String result = app1.checkPalin("Sanjay");
		assertThat(result).isEqualTo("<h1>Sanjay! is Not Palindrome </h1>");
	}
	@Test 
	void testPalinMalayalampositive() {
		Palindrome result = app1.checkPalinRest("malayalam");
		assertThat(result.toString()).isEqualTo("Palindrome[inputString=malayalam, isPalindrome=true]");
	}
	@Test 
	void testPalinCarNegative() {
		Palindrome result = app1.checkPalinRest("car");
		assertThat(result.toString()).isEqualTo("Palindrome[inputString=car, isPalindrome=false]");
	}
	

}
