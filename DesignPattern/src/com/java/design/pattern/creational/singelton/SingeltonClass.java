package com.java.design.pattern.creational.singelton;

public class SingeltonClass {

	private static SingeltonClass instance = null;

	private SingeltonClass() {

	}

	public synchronized static SingeltonClass getInstance() {

		if (instance == null) {

			instance = new SingeltonClass();
			return instance;

		} else {
			return instance;
		}
	}
}
