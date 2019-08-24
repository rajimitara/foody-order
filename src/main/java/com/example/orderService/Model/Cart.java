package com.example.orderService.Model;

import java.util.Map;

public class Cart {
		
	private long restaurantId;
	private Map<String, Integer> itemsInCart;
	
	public Cart() {
		
	}
	
	public Cart(long restaurantId, Map<String, Integer> itemsInCart) {
		//super();
		this.restaurantId = restaurantId;
		this.itemsInCart = itemsInCart;
	}
	public long getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(long restaurantId) {
		this.restaurantId = restaurantId;
	}
	public Map<String, Integer> getItemsInCart() {
		return itemsInCart;
	}
	public void setItemsInCart(Map<String, Integer> itemsInCart) {
		this.itemsInCart = itemsInCart;
	}
	
	
	
}
