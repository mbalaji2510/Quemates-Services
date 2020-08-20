package com.quematesuserprofleapi.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long userid;
	
	private String name;
	
	private String email;
	private String mobileNo;
	
	private String password;
	
	/*
	 * // @OneToOne(fetch = FetchType.LAZY, // cascade = CascadeType.ALL, //
	 * mappedBy = "user") // private UserProfile userProfile;
	 */	
	public User() {
		
	}
	
	public User(Long userid, String name, String email, String mobileNo, String password) {
		super();
		this.userid = userid;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.password = password;
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

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	/*
	 * public UserProfile getUserProfile() { return userProfile; }
	 * 
	 * public void setUserProfile(UserProfile userProfile) { this.userProfile =
	 * userProfile; }
	 */

	
	
	
	
	

}
