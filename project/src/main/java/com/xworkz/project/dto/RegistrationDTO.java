package com.xworkz.project.dto;

public class RegistrationDTO {

	private String fullName;
	private String emailId;
	private String dob;
	private long contact;
	private String address;
	private String gender;
	private String password;

	public RegistrationDTO() {
		super();

	}

	public RegistrationDTO(String fullName, String emailId, String dob, long contact, String address, String gender,
			String password) {
		super();
		this.fullName = fullName;
		this.emailId = emailId;
		this.dob = dob;
		this.contact = contact;
		this.address = address;
		this.gender = gender;
		this.password = password;
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

	@Override
	public String toString() {
		return "RegistrationDTO [fullName=" + fullName + ", emailId=" + emailId + ", dob=" + dob + ", contact="
				+ contact + ", address=" + address + ", gender=" + gender + ", password=" + password + "]";
	}

}
