package com.example.orderService.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderService.Model.Cart;
import com.example.orderService.Model.Order;
import com.example.orderService.Service.OrderService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class OrderServiceController {
			
	@Autowired
	OrderService orderService;
	
		@PostMapping(value="/user/{userId}/order")
		public ResponseEntity<Order> createOrder(@RequestParam String userId){
			
			orderService.createOrderFromCart(userId);
		
			return null;
		}
		
		@PostMapping(value="/user/{userId}/payment")
		public ResponseEntity<String>  makePaymentForOrder(@RequestParam String userId,@RequestParam long amount){
			
			orderService.makePayment(userId,amount)	;
		//Cart cartRequest = (Cart)convertJsonStringToJavaObj(body, Cart.class);
		
			return new ResponseEntity<>(HttpStatus.OK);
			
		}
		
		
		
		
		
		public static Object convertJsonStringToJavaObj(String json,
		Class<?> requiredType) {

		ObjectMapper mapper = new ObjectMapper();
		Object obj = null;
		try {
		obj = mapper.readValue(json, requiredType);
		} catch (JsonParseException e) {
		e.printStackTrace();
		} catch (JsonMappingException e) {
		e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		} finally {
		mapper = null;
		}

		return obj;
		}
}
