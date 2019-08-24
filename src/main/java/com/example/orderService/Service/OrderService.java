package com.example.orderService.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.orderService.Model.Cart;
import com.example.orderService.Model.Customer;
import com.example.orderService.Model.MenuItem;
import com.example.orderService.Model.Order;

@Service
public class OrderService {
		Set<Customer> availableCust;
		
	/*
	 * public void addToCustomer(Customer customer) { if(availableCust == null)
	 * availableCust = new HashSet<>(); availableCust.add(customer); }
	 */
		
		public Order createOrderFromCart(String userId) {
			Customer findCustomer = getCustomers(userId);
			Cart cartDetails = new Cart();
			
			int totalAmount = computeCartCharge(cartDetails);
			
			if(totalAmount < 200)
				totalAmount +=30;
			
			 String paymentAPI = "user/{userId}/payment/";
			 
			
			return null;
		}
		
		
		private int computeCartCharge(Cart cartDetails) {
		
				
			Map<String, Integer> itemsInCart =cartDetails.getItemsInCart();
			
			for(int i=0;i<itemsInCart.size();i++) {
				 
			}
		return 0;
	}


		public Customer getCustomers(String userId) {
			//Customer customer1= new Customer("abc", "4th Main Road", 91737892);
			//Customer customer2= new Customer("abc", "4th Main Road", 91737892);
				
			Set<Customer> customer = availableCust.stream().filter(customerId -> customerId.equals(userId)).collect(Collectors.toSet());
			
			return ((List<Customer>) customer).get(0);
		}


		public void makePayment(String userId, long amount) {
			
			
		}
}
