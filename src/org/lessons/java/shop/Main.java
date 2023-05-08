package org.lessons.java.shop;



public class Main {
	public static void main(String[] args) {
		
		Prodotto product = new Prodotto("name","lava i piatti", 4.50f, 22);
		System.out.println(product);
		float price = product.getPrice();
		float iva = product.getIva();
		System.out.println("Total Price: " + product.totalPrice(price,iva) + " euro");
		//Bonus 
		
		int code = product.getCode();
		System.out.println(String.format("%08d", code));
	}
}
