package com.mapping.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Students {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fName;
	
	private String lName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Documents documents;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Documents getDocuments() {
		return documents;
	}

	public void setDocuments(Documents documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", fName=" + fName + ", lName=" + lName + ", documents=" + documents + "]";
	}
	
	
	
	
	
}
