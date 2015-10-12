package com.sapient.models;

public class Social{
	private String social_id;
	private int id;
	
	public Social(String s){
		social_id = s;
	}

	public String getSocial_id() {
		return social_id;
	}

	public void setSocial_id(String social_id) {
		this.social_id = social_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
