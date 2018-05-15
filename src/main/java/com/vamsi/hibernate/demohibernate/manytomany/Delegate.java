package com.vamsi.hibernate.demohibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Delegate {

	@Id
	@GeneratedValue
	private int delegateId;

	private String delegateName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "JOIN_DELEGATE_EVENT", joinColumns = { @JoinColumn(name = "delegateId") }, inverseJoinColumns = {
			@JoinColumn(name = "eventid") })
	private List<Event> delegates = new ArrayList<Event>();

	public int getDelegateId() {
		return delegateId;
	}

	public void setDelegateId(int delegateId) {
		this.delegateId = delegateId;
	}

	public String getDelegateName() {
		return delegateName;
	}

	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}

	public List<Event> getDelegates() {
		return delegates;
	}

	public void setDelegates(List<Event> delegates) {
		this.delegates = delegates;
	}

}
