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
public class Teachers {
private String name;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@OneToOne
@JoinColumn(name = "subid")
private Subject subject;
public Teachers(String name, Subject subject) {
	super();
	this.name = name;
	this.subject = subject;
}
@Override
public String toString() {
	return "Teachers [name=" + name + ", id=" + id + ", subject=" + subject + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Subject getSubject() {
	return subject;
}
public void setSubject(Subject subject) {
	this.subject = subject;
}

}
