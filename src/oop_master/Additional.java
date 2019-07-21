package oop_master;

public class Additional {
	private String Name;
	private double price;
	
	
	public Additional(String Name) {
		
		if(Name.equals("lettuce")) {
			price=0.2;
			this.Name="lettuce";
		}else if(Name.equals("Tomato")) {
			price = 0.4;
			this.Name = "Tomato";
		}else if(Name.equals("Onion")) {
			price = 0.6;
			this.Name = "Onion";
		}else if(Name.equals("Carrot")) {
			price = 0.3;
			this.Name = "Carrot";
		}else if(Name.equals("Chips")) {
			price = 1.0;
			this.Name="Chips";
		}else if(Name.equals("Drinks")) {
			price = 2.0;
			this.Name="Drinks";
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return Name;
	}

}
