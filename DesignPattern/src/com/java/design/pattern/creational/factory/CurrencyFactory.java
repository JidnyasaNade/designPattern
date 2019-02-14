package com.java.design.pattern.creational.factory;

public class CurrencyFactory {

	public static Currency createCurrency (String country) {
	       if (country. equalsIgnoreCase ("India")){
	              return new Rupee();
	       }else if(country. equalsIgnoreCase ("US")){
	              return new USDoller();
	        }
	       throw new IllegalArgumentException("No such currency");
	       }
}
