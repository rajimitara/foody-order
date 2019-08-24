package com.example.orderService.Model;

public class Order {
		
	private Cart ordersInCart;
	private long orderId;
	
	
	public Order(Cart ordersInCart, long orderId) {
		//super();
		this.ordersInCart = ordersInCart;
		this.orderId = orderId;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Cart getOrdersInCart() {
		return ordersInCart;
	}

	public void setOrdersInCart(Cart ordersInCart) {
		this.ordersInCart = ordersInCart;
	}
	
	
}
