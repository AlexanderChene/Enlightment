package oop_master;

public class HealthyBurger extends Hamburger{
	
	

	public HealthyBurger(String meat) {
		
		super("brown rye" ,meat);
		// TODO Auto-generated constructor stub
		System.out.println("This is Healthy Burger");
	}
	
	public void add(String Name) {
		if(additions.size()>=6) {
			System.out.println("Healthy Base burger can have at most 6 additionals");
			return;
		}else {
			addAdditional(Name);
		}
	}
	
	

}
