package com.java.design.pattern.creational.builder;

public class Coke extends ColdDrink{

	@Override
	   public float price() {
	      return 30.0f;
	   }

	   @Override
	   public String name() {
	      return "Coke";
	   }
}