package com.javafxx.models;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class EmployeRepresentation extends Employe {
	
	private double chiffreAffaires;

	public EmployeRepresentation(int id,String nom, String prenom, int age, int dateEntree, double chiffreAffaires) {
		super(id, nom, prenom, age, dateEntree);
		// TODO Auto-generated constructor stub
		this.chiffreAffaires = chiffreAffaires;
	}

	public EmployeRepresentation(String nom, String prenom, int age, int dateEntree, double chiffreAffaires) {
		super(nom, prenom, age, dateEntree);
		// TODO Auto-generated constructor stub
		this.chiffreAffaires = chiffreAffaires;
	}
	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return ( this.chiffreAffaires * 20/100 ) + 2500;
	}

	public double getChiffreAffaires() {
		return chiffreAffaires;
	}

	public void setChiffreAffaires(double chiffreAffaires) {
		this.chiffreAffaires = chiffreAffaires;
	}

	@Override
	public String toString() {
		return "EmployeRepresentation [chiffreAffaires=" + chiffreAffaires + "]";
	}
	
	
}
