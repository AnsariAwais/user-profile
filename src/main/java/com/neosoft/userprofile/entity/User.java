package com.neosoft.userprofile.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_profile")
public class User {
	@Id
    @GeneratedValue(generator = "user_seq_generator")
    @SequenceGenerator(
            name = "user_seq_generator",
            sequenceName = "user_sequence",
            initialValue = 1000
    )
	private Long id;

	@Column(name="first_name")
	private String firstName;
	

	@Column(name="last_name")
	private String lastName;
	

	@Column(name="mobile_no")
	private String mobileNumber;
	

	@Column(name="email_id")
	private String emailId;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	private Set<Address> address;
	
	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private UserImage userImage;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Address> getAddress() {
		return address;
	}
	
	
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	
	//@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	public UserImage getUserImage() {
		return userImage;
	}
	
	
	public void setUserImage(UserImage userImage) {
		this.userImage = userImage;
	}
	
	
	
}