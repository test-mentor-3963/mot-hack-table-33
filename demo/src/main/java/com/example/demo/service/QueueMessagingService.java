/**
 * 
 */
package com.example.demo.service;

import java.sql.Timestamp;
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
			Queue queue = new Queue();
			queue.setQueueName(request.getQueueName());
			queue.setQueueMaxLimit(request.getQueueLimit());
			queue.setAddedTime(currentTime);
			Queue queSaved = queueRepository.save(queue);
			Message message = new Message();
			message.setMessage(request.getMessage());
			message.setQueueId(queSaved.getQueueId());
			message.setMessageTime(currentTime);
			messageRepository.save(message);
			return ResponseUtil.generateSuccessMessage("Successfully Added");
		}catch(Exception e){
			
		}

		return null;
	}

}