/**
 * 
 */
package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping("/api/addmessage")
	public @ResponseBody Map<String,Object> addMessage(@RequestBody RequestBodyModel request){
		return queueMessagingService.addQueueMessage(request);
	}
	
	@GetMapping("/api/getAllMessages")
	public @ResponseBody List<Message> getAllMessages(){
		List<Message> messageList=queueMessagingService.getAllMessages();
		return messageList;
	}
	@GetMapping("/api/getAllQueuesMessages")
	public @ResponseBody Map<String,List> getAllQueuesMessages(){
		Map messageList=queueMessagingService.getAllQueueMessages();
		return messageList;
	}
	
	@GetMapping("/api/findMessages")
	public @ResponseBody List<Message> findMessages(@RequestParam(name="message") String message){
		List<Message> messageList=queueMessagingService.findMessages(message);
		return messageList;
	}
	
	@PostMapping("/api/addqueue")
	public @ResponseBody Map<String,Object> addQueue(@RequestBody RequestBodyModel request){
		return queueMessagingService.addQueue(request);
	}
	

}
