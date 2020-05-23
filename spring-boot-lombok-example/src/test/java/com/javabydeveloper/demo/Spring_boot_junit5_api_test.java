package com.javabydeveloper.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.javabydeveloper.dto.MessageDto;

/* 
 * JUnit 5 Test Lombok Spring boot Example
 * */
 
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class Spring_boot_junit5_api_test {
	
	@Autowired
	private TestRestTemplate restTemplate;

	 @Test
	 @DisplayName("/hello rest api test ")
	 void testMessage() {
		 
		 String user = "Peter";
		 URI targetUrl= UriComponentsBuilder.fromUriString("/hello")                             
				    .queryParam("user", user)                               
				    .build()                                                
				    .encode()                                               
				    .toUri();
		 
	  MessageDto message = this.restTemplate.getForObject(targetUrl, MessageDto.class);
	  assertEquals("Hello "+user+", Thanks for the subscription!", message.getMessage());
	 }

}
