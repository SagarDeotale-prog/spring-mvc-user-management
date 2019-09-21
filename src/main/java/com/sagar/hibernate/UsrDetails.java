package com.sagar.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UsrDetails {
	@Id
	private int uid;
	private String uname;

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public UsrDetails(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}
	
}
