/**
 * 
 */
package com.example.demo.entitiy;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "QUEUE_ID")
	private long queueId;
	
	@Column(name = "QUEUE_NAME")
	private String queueName;
	
	@Column(name = "QUEUE_MAX_LIMIT")
	private String queueMaxLimit;
	
	@Column(name = "ADDED_TIME")
	private Timestamp addedTime;

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
	public Timestamp getAddedTime() {
		return addedTime;
	}

	/**
	 * @param addedTime the addedTime to set
	 */
	public void setAddedTime(Timestamp addedTime) {
		this.addedTime = addedTime;
	}


	
	

}
