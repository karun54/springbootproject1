package com.karun.springbootacutatorexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veichle {
@Id @GeneratedValue
private int veichleId;
private String veichleName;
public int getVeichleId() {
	return veichleId;
}
public void setVeichleId(int veichleId) {
	this.veichleId = veichleId;
}
public String getVeichleName() {
	return veichleName;
}
public void setVeichleName(String veichleName) {
	this.veichleName = veichleName;
}

}
