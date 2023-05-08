package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private int code;
	private String name;
	private String descr;
	private float price;
	private float iva;
	
	public Prodotto ( String name, String descr,float price,float iva) {
		Random rd = new Random();
		int nrandom = rd.nextInt(100000);
		this.code = nrandom;
		setName(name);
		setDescr(descr);
		setPrice(price);
		setIva(iva);
		
	}
	public int getCode() {
		
		return code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float totalPrice (float price, float iva) {
		float totprice = (price * iva / 100) + price;
		return totprice;
	}
	public String codeName (int code, String name) {
		String cod_e = "" + code;
		return cod_e + name;
	}
	
	@Override
	public String toString() {
		return "Code: " + code + "\nName: " + name + "\nDescr: " + descr + 
				"\nPrice: " + price + "\nIva: " + iva + "%";
	}
	
	
	
}
