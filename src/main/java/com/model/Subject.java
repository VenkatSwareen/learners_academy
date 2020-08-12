package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int subid;
private String subname;
public int getSubid() {
	return subid;
}
public Subject(String subname) {
	super();
	this.subname = subname;
}
public void setSubid(int subid) {
	this.subid = subid;
}
public String getSubname() {
	return subname;
}
public void setSubname(String subname) {
	this.subname = subname;
}
@Override
public String toString() {
	return "Subject [subid=" + subid + ", subname=" + subname + "]";
}

}
