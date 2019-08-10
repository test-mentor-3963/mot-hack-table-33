/**
 * 
 */
package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitiy.Message;
import com.example.demo.model.RequestBodyModel;
import com.example.demo.service.QueueMessagingService;

/**
 * @author user
 *
 */
@RestController
public class QueueMessagingController {
	
	@Autowired
	public QueueMessagingService queueMessagingService;
	
	@PostMapping("/api/addqueue")
	public @ResponseBody Map<String,Object> addMessageQueue(@RequestBody RequestBodyModel request){
		
		return null;
	}
	
	@PostMapping("/api/getAllMessages")
	public @ResponseBody List<Message> getAllMessages(){
		List<Message> messageList=queueMessagingService.getAllMessages();
		return messageList;
	}

}
