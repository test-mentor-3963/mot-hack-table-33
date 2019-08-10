/**
 * 
 */
package com.example.demo.model;

/**
 * @author user
 *
 */
public class RequestBodyModel {

	private String queueName;
	private String queueLimit;
	private String message;
	private String queueId;
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
	 * @return the queueLimit
	 */
	public String getQueueLimit() {
		return queueLimit;
	}
	/**
	 * @param queueLimit the queueLimit to set
	 */
	public void setQueueLimit(String queueLimit) {
		this.queueLimit = queueLimit;
	}
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
	 * @return the queueId
	 */
	public String getQueueId() {
		return queueId;
	}
	/**
	 * @param queueId the queueId to set
	 */
	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}
	
	
}
