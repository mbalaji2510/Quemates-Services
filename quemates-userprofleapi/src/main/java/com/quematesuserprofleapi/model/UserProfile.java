package com.quematesuserprofleapi.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userprofile1")
public class UserProfile {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private Long id;
	private Date createdAt;
	private Date updatedAt;
	private String about;
	private String geneder;
	private String interests;
	private String lanuages;
	private String profilePicUlr;
	// usr mapping need to here
	//private Long usrId;
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "userid", nullable = false)
    private User user;
	
	public UserProfile() {
		
	}
	
	
	public UserProfile(Long id, Date createdAt, Date updatedAt, String about, String geneder, String interests,
			String lanuages, String profilePicUlr, User user) {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	

}
