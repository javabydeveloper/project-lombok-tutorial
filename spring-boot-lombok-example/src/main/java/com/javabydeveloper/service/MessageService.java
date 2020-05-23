package com.javabydeveloper.service;

import org.springframework.stereotype.Component;

import com.javabydeveloper.dto.MessageDto;

import lombok.NonNull;

@Component
public class MessageService {
	
	public MessageDto getSubscriptionMessage(@NonNull String user) {
		
		MessageDto message = new MessageDto();
		message.setId(Long.valueOf(1));
		message.setMessage("Hello "+user+", Thanks for the subscription!");
	
		return message;
	}
}
