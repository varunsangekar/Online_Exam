package edu.main.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", branch=" + branch + ", college="
				+ college + ", poy=" + poy + ", mobile=" + mobile + ", marks=" + marks + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String email;
	private String branch;
	private String college;
	private String poy;
	private String mobile;

	@jakarta.persistence.OneToOne(cascade = CascadeType.ALL, fetch = jakarta.persistence.FetchType.EAGER)
	private Mark marks;

	// Getters and setters omitted for brevity

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getPoy() {
		return poy;
	}

	public void setPoy(String poy) {
		this.poy = poy;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Mark getMarks() {
		return marks;
	}

	public void setMarks(Mark marks) {
		this.marks = marks;
	}

}
