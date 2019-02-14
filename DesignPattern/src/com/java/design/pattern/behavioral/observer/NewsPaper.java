package com.java.design.pattern.behavioral.observer;

public class NewsPaper implements Observer {

	@Override
    public void update(float interest) {
           System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                        + interest);
    }

}