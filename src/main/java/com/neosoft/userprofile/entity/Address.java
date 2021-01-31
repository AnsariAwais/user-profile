package com.neosoft.userprofile.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {
	@Id
    @GeneratedValue(generator = "adr_seq_generator")
    @SequenceGenerator(
            name = "adr_seq_generator",
            sequenceName = "adr_sequence",
            initialValue = 1000
    )
	private int id;
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
	private User user;
	private String city;
	private String Country;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	
}