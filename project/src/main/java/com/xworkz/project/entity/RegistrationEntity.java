package com.xworkz.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Endgame21v02")
@NamedQueries({@NamedQuery (name= "getByEmailId",query="from RegistrationEntity as ed where ed.emailId=:email")})

public class RegistrationEntity {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "FULL_NAME")
	private String fullName;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "DOB")
	private String dob;
	@Column(name = "CONTACT")
	private long contact;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "REGISTEREDBY")
	private String registeredBy;
	@Column(name = "REGISTERED_DATE")
	private String registeredDate;
	public RegistrationEntity() {
		super();
		
	}
	public RegistrationEntity(int id, String fullName, String emailId, String dob, long contact, String address,
			String gender, String password, String registeredBy, String registeredDate) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.emailId = emailId;
		this.dob = dob;
		this.contact = contact;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.registeredBy = registeredBy;
		this.registeredDate = registeredDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisteredBy() {
		return registeredBy;
	}
	public void setRegisteredBy(String registeredBy) {
		this.registeredBy = registeredBy;
	}
	public String getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
	@Override
	public String toString() {
		return "RegistrationEntity [id=" + id + ", fullName=" + fullName + ", emailId=" + emailId + ", dob=" + dob
				+ ", contact=" + contact + ", address=" + address + ", gender=" + gender + ", password=" + password
				+ ", registeredBy=" + registeredBy + ", registeredDate=" + registeredDate + "]";
	}
	
		
	
	
	

}
