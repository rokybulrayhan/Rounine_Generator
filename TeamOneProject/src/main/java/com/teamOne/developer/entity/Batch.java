package com.teamOne.developer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tm1_batch")
public class Batch {

private int id;
private String names;
private String total;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNames() {
	return names;
}
public void setNames(String names) {
	this.names = names;
}
public String getTotal() {
	return total;
}
public void setTotal(String total) {
	this.total = total;
}
public Batch(int id, String names, String total) {
	this.id = id;
	this.names = names;
	this.total = total;
}
public Batch() {
}

}
