/**
 * 
 */
package com.example.demo.service;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitiy.Message;
import com.example.demo.entitiy.Queue;
import com.example.demo.model.RequestBodyModel;
import com.example.demo.repository.MessageRepository;
import com.example.demo.repository.QueueRepository;
import com.example.demo.util.ResponseUtil;

/**
 * @author user
 *
 */
@Service
public class QueueMessagingService {
	@Autowired
	public MessageRepository messageRepository;

	@Autowired
	public QueueRepository queueRepository;

	public Map<String,Object> addQueueMessage(RequestBodyModel request){
		try{
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			Message message = new Message();
			message.setMessage(request.getMessage());
			message.setQueueId(Long.parseLong(request.getQueueId()));
			message.setMessageTime(currentTime);
			Message mesSaved =messageRepository.save(message);
			return ResponseUtil.generateSuccessMessage("Successfully Added",mesSaved);
		}catch(Exception e){
			return ResponseUtil.generateFailureMessage(e.getMessage());

		}

	}
	
	public Map<String,Object> addQueue(RequestBodyModel request){
		try{
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			Queue queue = new Queue();
			queue.setQueueName(request.getQueueName());
			queue.setQueueMaxLimit(request.getQueueLimit());
			queue.setAddedTime(currentTime);
			Queue queSaved = queueRepository.save(queue);
			
			return ResponseUtil.generateSuccessMessage("Successfully Added",queSaved);
		}catch(Exception e){
			return ResponseUtil.generateFailureMessage(e.getMessage());

		}

	}

	
	public List<Message> getAllMessages(Long queueId){
		List<Message>  allMessages=messageRepository.getAllMessages(queueId);
		 return allMessages;
	}
	
	public List<Message> getAllMessages(){
		List<Message>  allMessages=messageRepository.findAll();
		 return allMessages;
	}
	
	public List<Queue> getAllQueues(){
		List<Queue>  allQueues=queueRepository.findAll();
		 return allQueues;
	}

	public Map getAllQueueMessages() {
		List<Queue>  allQueues=	getAllQueues();
		List<Message> allMessages=getAllMessages();
		Map<String,List> allDataMap= new HashMap<String,List>();
		allDataMap.put("queues", allQueues);
		allDataMap.put("messages", allMessages);
		return allDataMap;
	}

	public List<Message> findMessages(String message) {
		
		return messageRepository.findMessages(message);
	}

}