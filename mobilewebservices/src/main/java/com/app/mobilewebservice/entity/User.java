package com.app.mobilewebservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2335790839279922622L;
	
	@Id
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id")
	@ApiModelProperty(notes = "The database generated user ID")
	Long id;
	
	@Column(name="uid")
	@ApiModelProperty(notes = "The organisation specific user UID",required=true)
	String uid;
	
	@Column(name="firstname")
	@ApiModelProperty(notes = "The organisation specific user First Name",required=true)
	String firstName;
	
	@Column(name="lastname")
	@ApiModelProperty(notes = "The organisation specific user last Name",required=true)
	String lastName;
	
	@Column(name="gcmid")
	@ApiModelProperty(notes = "The applicaion specific user GCM ID",required=false)
	String gcmId;
	
	@Column(name="status")
	@ApiModelProperty(notes = "The organisation specific user UID",required=false)
	boolean status;
	
	@Version
    @ApiModelProperty(notes = "The auto-generated version of the product")
    private Integer version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
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
	public String getGcmId() {
		return gcmId;
	}
	public void setGcmId(String gcmId) {
		this.gcmId = gcmId;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}	
	
}