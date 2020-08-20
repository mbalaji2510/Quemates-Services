package com.quemates.consumer.dto;

public class UserDto {
	
	private Long userid;

	private String name;

	private String email;
	private String mobileNo;

	private String password;
	
	public UserDto() {
		
	}

	public UserDto(Long userid, String name, String email, String mobileNo, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
