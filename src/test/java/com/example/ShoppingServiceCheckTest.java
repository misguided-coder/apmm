package com.example;

import java.util.Collection;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.exception.InvalidProductException;
import com.example.model.Product;

public class ShoppingServiceTest {
	
	@Test
	public void removingItemShouldgiveinvalidexception(){
		Product laptop = new Product(100,"HP Laptop" ,1500.00,1);
		Product watch = new Product(100,"Lenovo" ,891500.00,1);
		Product mobile = new Product(100,"samsung" ,91500.00,1);

		ShoppingService shop = new ShoppingService();
		
		shop.addItem(laptop);
		shop.addItem(watch);
		shop.addItem(mobile);
		assertNotNull(shop.placeOrders());
		assertTrue(shop.placeOrders().length()>10);
		assertTrue(shop.placeOrders().startsWith("O"));
//		try{
//			int beforeExcep = shop.countItems();
//			shop.removeItem(100);
//			shop.removeItem(100);
//			int afterexcep = shop.countItems();
//			assertEquals(beforeExcep, beforeExcep-afterexcep);
//			
//		}
//	catch(InvalidProductException ex){
//		ex.printStackTrace();
//	}
		
		
		

//		shop.addItem(watch);
//		shop.addItem(watch);
//
//		shop.addItem(mobile);
//		shop.addItem(mobile);

//		Collection<Product> products = shop.cartDetails();
//		for(Product product : products){
//			assertEquals(100, product.getId());
//			assertTrue(product.getName().equals("HP Laptop"));
//		}

		//shop.cart
		
		//assertEquals(6, shop.countItems());
	}
	
	
	
	@Test
	public void emptycartzeroItems(){
		//Product laptop = new Product(100,"HP Laptop" ,1500.00,1);
		
		ShoppingService shop = new ShoppingService();
		//shop.addItem(laptop);
		//shop.cart
		
		assertEquals(0, shop.countItems());
	}
	
	@Test
	public void cartDetailsAreNilIfCartIsEmptyCart(){
		//Product laptop = new Product(100,"HP Laptop" ,1500.00,1);
		
		ShoppingService shop = new ShoppingService();
		//shop.addItem(laptop);
		//shop.cart
		assertNotNull(shop.cartDetails());
		assertEquals(3, shop.cartDetails().size());
	}
	
	
	@Test
	public void emptycartzeroItems1(){
		//Product laptop = new Product(100,"HP Laptop" ,1500.00,1);
		
		ShoppingService shop = new ShoppingService();
		//shop.addItem(laptop);
		//shop.cart
		
		assertEquals(0, shop.countItems());
	}
	
//	@Test(timeout=6000)
//	public void placeordershouldtakelessthanfivesecondsonlyForSLA(){
//		Product laptop = new Product(100,"HP Laptop" ,1500.00,1);
//		Product watch = new Product(101,"HP watch" ,345.00,1);
//		Product mobile = new Product(100,"HP mobile" ,7633.00,1);
//		
//		ShoppingService shop = new ShoppingService();
//		//shop.addItem(laptop);
//		//shop.cart
//		shop.addItem(laptop);
//		shop.addItem(watch);
//		shop.addItem(mobile);
//		shop.placeOrders();
////		assertNotNull(shop.cartDetails());
////		assertEquals(0, shop.cartDetails().size());
//	}

}
