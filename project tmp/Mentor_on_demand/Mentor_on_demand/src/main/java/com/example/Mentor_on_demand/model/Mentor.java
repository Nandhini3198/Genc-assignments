package com.example.Mentor_on_demand.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mentor")
public class Mentor {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	

	@Column(name="linkedin_url")
	private String linkedin_url;
	
	@Column(name="reg_datetime")
	private Date reg_datetime;
	
	

	@Column(name="reg_code")
	private String reg_code;
	
	@Column(name="years_of_experience")
	private String years_of_experience;
	
	@Column(name="active")
	private boolean active;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLinkedin_url() {
		return linkedin_url;
	}

	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}

	public Date getReg_datetime() {
		return reg_datetime;
	}

	public void setReg_datetime(Date reg_datetime) {
		this.reg_datetime = reg_datetime;
	}

	public String getReg_code() {
		return reg_code;
	}

	public void setReg_code(String reg_code) {
		this.reg_code = reg_code;
	}

	public String getYears_of_experience() {
		return years_of_experience;
	}

	public void setYears_of_experience(String years_of_experience) {
		this.years_of_experience = years_of_experience;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	} 

	public Mentor() {
		super();
	}

	
	@Override
	public String toString() {
		return "Mentor [id=" + id + ", username=" + username + ", linkedin_url=" + linkedin_url + ", reg_datetime="
				+ reg_datetime + ", reg_code=" + reg_code + ", years_of_experience=" + years_of_experience + ", active="
				+ active + "]";
	}

}
