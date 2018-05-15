package com.vamsi.hibernate.demohibernate.twoclassonetable;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetails {

	private String schoolAddress;
	private boolean isPublicSchool;
	private int schoolCount;

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public boolean isPublicSchool() {
		return isPublicSchool;
	}

	public void setPublicSchool(boolean isPublicSchool) {
		this.isPublicSchool = isPublicSchool;
	}

	public int getSchoolCount() {
		return schoolCount;
	}

	public void setSchoolCount(int schoolCount) {
		this.schoolCount = schoolCount;
	}

}
