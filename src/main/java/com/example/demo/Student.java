package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Student {
@Id
private int roll;
private String name;
@Transient
private int rankss;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int roll, String name,int ra) {
	super();
	this.roll = roll;
	this.name = name;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
