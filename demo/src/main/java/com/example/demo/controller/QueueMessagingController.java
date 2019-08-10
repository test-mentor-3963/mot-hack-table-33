/**
 * 
 */
package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.RequestBody;

/**
 * @author user
 *
 */
@RestController
public class QueueMessagingController {
	
	@PostMapping("/api/addqueue")
	public @ResponseBody Map<String,Object> addMessageQueue(RequestBody request){
		return null;
	}

}
