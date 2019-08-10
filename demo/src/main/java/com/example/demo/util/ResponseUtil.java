/**
 * 
 */
package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * @author user
 *
 */
@Component
public class ResponseUtil {
	
	public Map<String,Object> generateSuccessMessage(String message,Object data){
		Map<String,Object> response = new HashMap<>();
		response.put("status", true);
		response.put("data", data);
		response.put("message", message);
	return response;	
	}
	
	public Map<String,Object> generateFailureMessage(String message){
		Map<String,Object> response = new HashMap<>();
		response.put("status", false);
		response.put("message", message);
	return response;	
	}

}
