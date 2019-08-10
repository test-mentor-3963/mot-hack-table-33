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
	
	public static Map<String,Object> generateSuccessMessage(Object data){
		Map<String,Object> response = new HashMap<>();
		response.put("status", true);
		response.put("data", data);
	return response;	
	}
	
	public static Map<String,Object> generateFailureMessage(String message){
		Map<String,Object> response = new HashMap<>();
		response.put("status", false);
		response.put("message", message);
	return response;	
	}

}
