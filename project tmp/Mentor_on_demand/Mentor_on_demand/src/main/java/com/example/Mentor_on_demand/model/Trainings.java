package com.example.Mentor_on_demand.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainings")
public class Trainings {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private String user_id;
	
	@Column(name="mentor_id")
	private String mentor_id;
	
	@Column(name="skill_id")
	private String skill_id;
	
	@Column(name="status")
	private String status;
	
	@Column(name="progress")
	private String progress;
	
	@Column(name="rating")
	private float rating;
	
	@Column(name="start_date")
	private Date start_date;
	
	@Column(name="end_date")
	private Date end_date;
	
	@Column(name="start_time")
	private String start_time;
	
	@Column(name="end_time")
	private String end_time;
	
	@Column(name="amount_received")
	private float amount_received;

	public Trainings() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(String mentor_id) {
		this.mentor_id = mentor_id;
	}

	public String getSkill_id() {
		return skill_id;
	}

	public void setSkill_id(String skill_id) {
		this.skill_id = skill_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProgress() {
		return progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public float getAmount_received() {
		return amount_received;
	}

	public void setAmount_received(float amount_received) {
		this.amount_received = amount_received;
	}

	@Override
	public String toString() {
		return "Trainings [id=" + id + ", user_id=" + user_id + ", mentor_id=" + mentor_id + ", skill_id=" + skill_id
				+ ", status=" + status + ", progress=" + progress + ", rating=" + rating + ", start_date=" + start_date
				+ ", end_date=" + end_date + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", amount_received=" + amount_received + "]";
	}
}
