package com.vamsi.hibernate.demohibernate.onetoonemapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PersonDetail {

	@Id
	@GeneratedValue
	@Column(name = "detailsId_PK")
	private int personDetailId;
	private String zipcode;
	private String job;
	private double income;

	@OneToOne(mappedBy = "personDetail", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getPersonDetailId() {
		return personDetailId;
	}

	public void setPersonDetailId(int personDetailId) {
		this.personDetailId = personDetailId;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

}
