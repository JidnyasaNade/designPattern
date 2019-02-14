package com.java.design.pattern.creational.builder;

public class Pepsi extends ColdDrink{

	@Override
	   public float price() {
	      return 35.0f;
	   }

	   @Override
	   public String name() {
	      return "Pepsi";
	   }
}