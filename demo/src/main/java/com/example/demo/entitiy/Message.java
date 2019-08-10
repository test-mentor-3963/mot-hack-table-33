package com.example.demo.entitiy;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MESSAGE")
public class Message {

	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "MESSAGE_ID")
	private long messageId;
	
	@Column(name = "QUEUE_ID")
	private long queueId;
	
	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public long getQueueId() {
		return queueId;
	}

	public void setQueueId(long queueId) {
		this.queueId = queueId;
	}

	

	@Column(name = "MESSAGE")
	private String message;
	
	@Column(name = "MESSAGE_TIME")
	private Timestamp messageTime;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the messageTime
	 */
	public Timestamp getMessageTime() {
		return messageTime;
	}

	/**
	 * @param messageTime the messageTime to set
	 */
	public void setMessageTime(Timestamp messageTime) {
		this.messageTime = messageTime;
	}

	
}
