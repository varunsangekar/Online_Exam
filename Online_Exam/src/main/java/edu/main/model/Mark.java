package edu.main.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mark {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String itQ;
	private String csQ;
	private int itMark;
	private int csMark;

	@jakarta.persistence.ElementCollection
	private List<Integer> marks;

	// Getters and setters omitted for brevity

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItQ() {
		return itQ;
	}

	public void setItQ(String itQ) {
		this.itQ = itQ;
	}

	public String getCsQ() {
		return csQ;
	}

	public void setCsQ(String csQ) {
		this.csQ = csQ;
	}

	public int getItMark() {
		return itMark;
	}

	public void setItMark(int itMark) {
		this.itMark = itMark;
	}

	public int getCsMark() {
		return csMark;
	}

	public void setCsMark(int csMark) {
		this.csMark = csMark;
	}

}
