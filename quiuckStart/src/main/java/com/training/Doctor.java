package com.training;

public class Doctor {
	private long doctorId;
	private String doctorName;
	private long phoneNumber;
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(long doctorId, String doctorName, long phoneNumber) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.phoneNumber = phoneNumber;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
//	@Override
//	public String toString() {
//		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", phoneNumber=" + phoneNumber + "]";
//	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}

}
