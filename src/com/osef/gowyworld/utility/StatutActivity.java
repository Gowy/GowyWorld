package com.osef.gowyworld.utility;

import java.util.ArrayList;

import android.widget.TextView;

public class StatutActivity {

	private static ArrayList<String> ListStatut = new ArrayList<String>(); 
		
	public StatutActivity() {
		System.out.println("Creation de la classe StatutActivity\n");
	}
	
	public StatutActivity getStatut() {
		return this;
	}
	
	
	public void AddInfo(String Activity, String Operation ) {
		String texte = Activity+" - "+Operation;
		ListStatut.add(texte);
	}
	
	public void cleanInfo() {
		ListStatut.clear();
	}
	
	public void ShowInfo(TextView tv) {
		int Limit = ListStatut.size();
		int i=0;
		String texte = "";
		for (i=Limit-1;i>=0;i--) {
			texte += i+" : "+ListStatut.get(i)+"\n";
		}
		tv.setText(texte);
	}
	
	
}
