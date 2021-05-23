package Entities;

import Abstract.Entity;

public class Campaign implements Entity{
	public int id;
	public String name;
	public int discount;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String name, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
}
