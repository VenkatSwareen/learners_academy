package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Class {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classid;
	private String classname;
	@OneToOne
	@JoinColumn(name = "subid")
	private Subject subject;
	public Class(String classname, Subject subject) {
		super();
		this.classname = classname;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Class [classid=" + classid + ", classname=" + classname + ", subject=" + subject + "]";
	}

	public Class(String classname) {
		super();
		this.classname = classname;
	}

	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	}