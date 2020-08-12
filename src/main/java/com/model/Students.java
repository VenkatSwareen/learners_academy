package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Students {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
@ManyToOne
private Class clas;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Class getClas() {
	return clas;
}
public void setClas(Class clas) {
	this.clas = clas;
}
@Override
public String toString() {
	return "Students [id=" + id + ", name=" + name + ", clas=" + clas + "]";
}
public Students(String name, Class clas) {
	super();
	this.name = name;
	this.clas = clas;
}
public Students(String name) {
	super();
	this.name = name;
}



}

