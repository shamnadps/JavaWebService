/**
 * 
 */
package com.haizum.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.haizum.model.UserModel;  

/**
 * @author A-5324
 *
 */
@RestController  
public class SpringRestController {
	
	
	@RequestMapping(value = "/getUser", method = RequestMethod.GET)  
	 public @ResponseBody List<UserModel> getUser() {  

	  return getUserDetails();  
	 }
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)  
	 public @ResponseBody String registerUser() {  
		System.out.println("Successfuly registered user");
	  return "User Registered";  
	 }
	
	public List<UserModel> getUserDetails() {
		List<UserModel> userModels = new ArrayList<UserModel>();
		UserModel userModel = new UserModel();
		userModel.setUsername("shamnadps");
		userModel.setUserEmail("shamnad.p.s@gmail.com");
		userModel.setAge("28");
		userModel.setSex("Male");
		userModels.add(userModel);
		return userModels;
	}
}
