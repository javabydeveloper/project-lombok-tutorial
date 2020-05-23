package com.javabydeveloper.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.javabydeveloper.dto.MessageDto;
import com.javabydeveloper.service.MessageService;

/* 
 * Lombok Spring boot Example Test
 * JUnit 5 Test for Spring component
 * */
@SpringBootTest
public class Spring_boot_Junit5_service_test {

	@Autowired
	private MessageService messageService;
	
	 @Test
	 @DisplayName("Subscription message service test ")
	 void testSubscriptionMessage() {
		 
		String user = "Peter";
		 
	    MessageDto message = messageService.getSubscriptionMessage(user);
	    assertEquals("Hello "+user+", Thanks for the subscription!", message.getMessage());
	 }
}
