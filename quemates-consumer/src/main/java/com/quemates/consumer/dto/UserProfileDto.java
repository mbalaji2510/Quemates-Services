package com.quemates.consumer.dto;

import java.util.Date;

public class UserProfileDto {
	
	private Long id;
	private Date createdAt;
	private Date updatedAt;
	private String about;
	private String geneder;
	private String interests;
	private String lanuages;
	private String profilePicUlr;	
    private UserDto user;
    
    public UserProfileDto() {
    	
    }
	public UserProfileDto(Long id, Date createdAt, Date updatedAt, String about, String geneder, String interests,
			String lanuages, String profilePicUlr, UserDto user) {
		super();
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.about = about;
		this.geneder = geneder;
		this.interests = interests;
		this.lanuages = lanuages;
		this.profilePicUlr = profilePicUlr;
		this.user = user;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getGeneder() {
		return geneder;
	}
	public void setGeneder(String geneder) {
		this.geneder = geneder;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public String getLanuages() {
		return lanuages;
	}
	public void setLanuages(String lanuages) {
		this.lanuages = lanuages;
	}
	public String getProfilePicUlr() {
		return profilePicUlr;
	}
	public void setProfilePicUlr(String profilePicUlr) {
		this.profilePicUlr = profilePicUlr;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}

	
}
