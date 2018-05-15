package com.vamsi.hibernate.demohibernate.twoclassonetable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class School {

	private SchoolDetails SchoolDetails;

	@Embedded
	public SchoolDetails getSchoolDetails() {
		return SchoolDetails;
	}

	public void setSchoolDetails(SchoolDetails schoolDetails) {
		SchoolDetails = schoolDetails;
	}

	@Id
	@GeneratedValue
	private int schoolId;
	private String schoolName;

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
