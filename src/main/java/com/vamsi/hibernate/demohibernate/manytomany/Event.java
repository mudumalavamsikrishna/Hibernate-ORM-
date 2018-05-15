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
public class Event {

	@Id
	@GeneratedValue
	private int eventid;

	private String eventName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "JOIN_DELEGATE_EVENT", joinColumns = { @JoinColumn(name = "eventid") }, inverseJoinColumns = {
			@JoinColumn(name = "delegateId") })
	private List<Delegate> delegates = new ArrayList<Delegate>();

	public int getEventid() {
		return eventid;
	}

	public void setEventid(int eventid) {
		this.eventid = eventid;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public List<Delegate> getDelegates() {
		return delegates;
	}

	public void setDelegates(List<Delegate> delegates) {
		this.delegates = delegates;
	}

}
