package com.example.Mentor_on_demand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payments")
public class Payments {
	
	@Id
	@Column(name="id")
	private int id;

	@Column(name="mentor_id")
	private int mentor_id;
	
	@Column(name="training_id")
	private int training_id;
	
	@Column(name="txn_type")
	private String txn_type;
	
	@Column(name="amount")
	private float amount;
	
	@Column(name="datetime")
	private String datetime;
	
	@Column(name="remarks")
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMentor_id() {
		return mentor_id;
	}

	public void setMentor_id(int mentor_id) {
		this.mentor_id = mentor_id;
	}

	public int getTraining_id() {
		return training_id;
	}

	public void setTraining_id(int training_id) {
		this.training_id = training_id;
	}

	public String getTxn_type() {
		return txn_type;
	}

	public void setTxn_type(String txn_type) {
		this.txn_type = txn_type;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Payments() {
		super();
	}

	@Override
	public String toString() {
		return "Payments [id=" + id + ", mentor_id=" + mentor_id + ", training_id=" + training_id + ", txn_type="
				+ txn_type + ", amount=" + amount + ", datetime=" + datetime + ", remarks=" + remarks + "]";
	}
	
	

}
