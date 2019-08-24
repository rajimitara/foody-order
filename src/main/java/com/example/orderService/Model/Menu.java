package com.example.orderService.Model;

import java.util.Set;

public class Menu {
		
	private Set<MenuItem> items;

	
	public Menu(Set<MenuItem> items) {
		//super();
		this.items = items;
	}

	public Set<MenuItem> getItems() {
		return items;
	}

	public void setItems(Set<MenuItem> items) {
		this.items = items;
	}
	
	
}
