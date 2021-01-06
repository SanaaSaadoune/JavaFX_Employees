package com.javafxx.models;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class EmployeManutention extends Employe {
	
	private int heuresTravail;
	public int getHeuresTravail() {
		return heuresTravail;
	}

	public void setHeuresTravail(int heuresTravail) {
		this.heuresTravail = heuresTravail;
	}

	public boolean isRisque() {
		return risque;
	}

	public void setRisque(boolean risque) {
		this.risque = risque;
	}

	private boolean risque;

	public EmployeManutention(int id, String nom, String prenom, int age, int dateEntree, int heuresTravail,boolean risque) {
		super(id, nom, prenom, age, dateEntree);
		// TODO Auto-generated constructor stub
		this.heuresTravail = heuresTravail;
		this.risque = risque;
	}
	
	public EmployeManutention(String nom, String prenom, int age, int dateEntree, int heuresTravail,boolean risque) {
		super(nom, prenom, age, dateEntree);
		// TODO Auto-generated constructor stub
		this.heuresTravail = heuresTravail;
		this.risque = risque;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		
		if(this.risque) {
			EmployeManutentionRisque EmplyeRisque = new EmployeManutentionRisque();
			return heuresTravail * 50 + EmplyeRisque.prime();
		}else {
			return heuresTravail * 50;
		}
	}
	
	/* @Override
	public String getNom() {
		return "L'employé de manutention : " + this.getNom() + this.getPrenom();
	}*/

	@Override
	public String toString() {
		return "EmployeManutention [heuresTravail=" + heuresTravail + "]";
	}
	
	

}
