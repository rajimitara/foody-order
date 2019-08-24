package com.example.orderService.Model;

import java.util.List;

public class Restaurant {
	
		private long restaurantId;
		private String restaurantName;
		private String location;
		private String contact;
		private int ratings;
		private Menu menus;
		
					
		public Restaurant(long restaurantId, String restaurantName, String location, String contact, int ratings,
				Menu menus) {
			//super();
			this.restaurantId = restaurantId;
			this.restaurantName = restaurantName;
			this.location = location;
			this.contact = contact;
			this.ratings = ratings;
			this.menus = menus;
		}

		public Restaurant() {
			//super();
		}
		public String getRestaurantName() {
			return restaurantName;
		}
		public void setRestaurantName(String restaurantName) {
			this.restaurantName = restaurantName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public int getRatings() {
			return ratings;
		}
		public void setRatings(int ratings) {
			this.ratings = ratings;
		}

		public long getRestaurantId() {
			return restaurantId;
		}

		public void setRestaurantId(long restaurantId) {
			this.restaurantId = restaurantId;
		}

		public Menu getMenus() {
			return menus;
		}

		public void setMenus(Menu menus) {
			this.menus = menus;
		}
		
		
		
		
}
