package com.app.mobilewebservice.vo;

import java.io.Serializable;

public class UserVO implements Serializable{

	private static final long serialVersionUID = 8222537696607417017L;

	private String uid;
	private String gcmId;
	private boolean status;
	private String firstName;
	private String lastName;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getGcmId() {
		return gcmId;
	}
	public void setGcmId(String gcmId) {
		this.gcmId = gcmId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "UserVO [uid=" + uid + ", gcmId=" + gcmId + ", status=" + status + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}
}