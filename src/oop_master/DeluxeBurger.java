package oop_master;

public class DeluxeBurger extends Hamburger{

	public DeluxeBurger(String rollType, String meat) {
		super(rollType, meat);
		System.out.println("This is Deluxe Burger");
		this.add("chips");
		this.add("drinks");
		// TODO Auto-generated constructor stub
	}
	
	public void add(String Name) {
		if(additions.size()>=2) {
			System.out.println("Deluxe burger can have at most 2 additionals");
			return;
		}else {
			addAdditional(Name);
		}
	}
	

}
