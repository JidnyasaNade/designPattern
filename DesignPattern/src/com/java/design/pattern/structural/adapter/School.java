package com.java.design.pattern.structural.adapter;

public class School {

	public static void main(String[] args) {
		
		Pen p = new PenAdapter();
		Assignment assignment =  new Assignment();
		assignment.setP(p);
		assignment.writeAssignments("i am a bit tired to write an assignment");
	}

}
