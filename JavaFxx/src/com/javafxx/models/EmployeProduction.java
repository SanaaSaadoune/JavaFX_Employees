package com.javafxx.models;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class EmployeProduction  extends Employe {
	
	int nombreUnites;
	private boolean risque;

	public int getNombreUnites() {
		return nombreUnites;
	}

	public void setNombreUnites(int nombreUnites) {
		this.nombreUnites = nombreUnites;
	}

	public boolean isRisque() {
		return risque;
	}

	public void setRisque(boolean risque) {
		this.risque = risque;
	}

	public EmployeProduction(int id,String nom, String prenom, int age, int dateEntree, int nombreUnites,boolean risque) {
		super(id, nom, prenom, age, dateEntree);
		// TODO Auto-generated constructor stub
		
		this.nombreUnites = nombreUnites ;
		this.risque = risque;
	}
	
	public EmployeProduction(String nom, String prenom, int age, int dateEntree, int nombreUnites,boolean risque) {
		super(nom, prenom, age, dateEntree);
		// TODO Auto-generated constructor stub
		
		this.nombreUnites = nombreUnites ;
		this.risque = risque;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		if(this.risque) {
			EmployeProductionRisque EmplyeRisque = new EmployeProductionRisque();
			return this.nombreUnites * 5 + EmplyeRisque.prime();
		}else {
			return this.nombreUnites * 5;
		}
		
	}
	

	@Override
	public String toString() {
		return "EmployeProduction [nombreUnites=" + nombreUnites + "]";
	}

}
