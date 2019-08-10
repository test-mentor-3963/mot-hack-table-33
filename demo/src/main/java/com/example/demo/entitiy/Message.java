package com.example.demo.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MESSAGE")
public class Message {

	
	
	
	@Id
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

	public long getMessage() {
		return message;
	}

	public void setMessage(long message) {
		this.message = message;
	}

	public long getMessageTime() {
		return messageTime;
	}

	public void setMessageTime(long messageTime) {
		this.messageTime = messageTime;
	}

	@Column(name = "MESSAGE")
	private long message;
	
	@Column(name = "MESSAGE_TIME")
	private long messageTime;
	
}
