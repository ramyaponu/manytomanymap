package com.example.demo.entity1;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity2.Items;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table
public class Customer {
	@Id
@GeneratedValue
int custId;
String custName;

public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}

@Autowired
//@OneToOne(cascade=CascadeType.ALL)
//@JoinColumn(name="itemId")
@ManyToMany(cascade=CascadeType.ALL)
@JoinTable(name="customer_Item",
joinColumns= {@JoinColumn(name="customer_fk")},
inverseJoinColumns= {@JoinColumn(name="item_fk")})
private Set<Items> set=new HashSet<>();



public Set<Items> getSet() {
	return set;
}
public void setSet(Set<Items> set) {
	this.set = set;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", set=" + set + "]";
}



}