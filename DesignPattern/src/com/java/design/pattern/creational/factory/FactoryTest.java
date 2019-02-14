package com.java.design.pattern.creational.factory;

public class FactoryTest {

	public static void main(String[] args) {
		
		String country = new String("India");
		
		Currency currency = CurrencyFactory.createCurrency(country);
        System.out.println(currency.getSymbol());
	}
}
