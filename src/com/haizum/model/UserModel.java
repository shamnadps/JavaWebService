/**
 * 
 */
package com.haizum.model;

import org.springframework.stereotype.Component;

/**
 * @author A-5324
 *
 */
@Component
public class UserModel {

	private String username;
	private String userEmail;
	private String age;
	private String sex;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
