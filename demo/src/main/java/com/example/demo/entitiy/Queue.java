/**
 * 
 */
package com.example.demo.entitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author user
 *
 */
@Entity
@Table(name="QUEUE")
public class Queue {
	@Id
	@Column(name = "QUEUE_ID")
	private long queueId;
	
	@Column(name = "QUEUE_NAME")
	private String queueName;
	
	@Column(name = "QUEUE_MAX_LIMIT")
	private String queueMaxLimit;
	
	@Column(name = "ADDED_TIME")
	private String addedTime;

	/**
	 * @return the queueId
	 */
	public long getQueueId() {
		return queueId;
	}

	/**
	 * @param queueId the queueId to set
	 */
	public void setQueueId(long queueId) {
		this.queueId = queueId;
	}

	/**
	 * @return the queueName
	 */
	public String getQueueName() {
		return queueName;
	}

	/**
	 * @param queueName the queueName to set
	 */
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	/**
	 * @return the queueMaxLimit
	 */
	public String getQueueMaxLimit() {
		return queueMaxLimit;
	}

	/**
	 * @param queueMaxLimit the queueMaxLimit to set
	 */
	public void setQueueMaxLimit(String queueMaxLimit) {
		this.queueMaxLimit = queueMaxLimit;
	}

	/**
	 * @return the addedTime
	 */
	public String getAddedTime() {
		return addedTime;
	}

	/**
	 * @param addedTime the addedTime to set
	 */
	public void setAddedTime(String addedTime) {
		this.addedTime = addedTime;
	}
	
	

}
