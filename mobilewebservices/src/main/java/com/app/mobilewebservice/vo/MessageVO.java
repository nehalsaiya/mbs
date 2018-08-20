package com.app.mobilewebservice.vo;

import java.io.Serializable;

public class MessageVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1487386769425924458L;
	private String title;
	private String message;
	private String uid;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
