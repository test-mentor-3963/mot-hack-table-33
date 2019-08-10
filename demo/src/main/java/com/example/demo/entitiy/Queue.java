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

}
