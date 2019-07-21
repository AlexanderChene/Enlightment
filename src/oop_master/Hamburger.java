package oop_master;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
	private String rollType;
	private String meat;
	private double price = 8;

	
	//set of Additions
	List<Additional> additions = new ArrayList<Additional>();
	//additional options
	private String LETTUCE = "lettuce";
	private String TOMATO = "Tomato";
	private String CARROT = "Carrot";
	private String ONION = "Onion";
	private String CHIPS = "Chips";
	private String DRINK = "Drinks";
	
	public Hamburger(String rollType, String meat) {
		this.rollType = rollType;
		this.meat = meat;
	}
	
	public void add(String Name) {
		if(additions.size()>=4) {
			System.out.println("Base burger can have at most 4 additionals");
			return;
		}else {
			addAdditional(Name);
		}
	}
	

	protected void addAdditional(String Name) {
		if(LETTUCE.equalsIgnoreCase(Name)) {
			Additional newAdditional = new Additional(LETTUCE);
			additions.add(newAdditional);
			price+=newAdditional.getPrice();
		}else if(TOMATO.equalsIgnoreCase(Name)) {
			Additional newAdditional = new Additional(TOMATO);
			additions.add(newAdditional);
			price+=newAdditional.getPrice();
		}else if(CARROT.equalsIgnoreCase(Name)) {
			Additional newAdditional = new Additional(CARROT);
			additions.add(newAdditional);
			price+=newAdditional.getPrice();
		}else if(ONION.equalsIgnoreCase(Name)) {
			Additional newAdditional = new Additional(ONION);
			additions.add(newAdditional);
			price+=newAdditional.getPrice();
		}else if(CHIPS.equalsIgnoreCase(Name)) {
			Additional newAdditional = new Additional(CHIPS);
			additions.add(newAdditional);
			price+=newAdditional.getPrice();
		}else if(DRINK.equalsIgnoreCase(Name)) {
			Additional newAdditional = new Additional(DRINK);
			additions.add(newAdditional);
			price+=newAdditional.getPrice();
		}else {
			System.out.println("Invalid additionals: "+Name);
			return;
		}
		
	}

	
	public void printReceipt() {

		System.out.println(this.meat + " and " + this.rollType);
		System.out.println("base price is $ 8");
		if(additions.size()>0) {
		System.out.println("The additions are: ");
		for(int i=0; i<additions.size(); i++) {
			System.out.println(additions.get(i).getName() + " ..........   " + "$ "+additions.get(i).getPrice());
		}
		}
		System.out.println("Total Price is "+ price);
	}
}
