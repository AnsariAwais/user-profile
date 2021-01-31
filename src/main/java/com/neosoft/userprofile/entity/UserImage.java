package com.neosoft.userprofile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_image")
public class UserImage {
	
	@Id
    @GeneratedValue(generator = "image_seq_generator")
    @SequenceGenerator(
            name = "image_seq_generator",
            sequenceName = "image_sequence",
            initialValue = 1000
    )
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Lob
	@Column(name="image")
	private byte[] image;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}

	
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
