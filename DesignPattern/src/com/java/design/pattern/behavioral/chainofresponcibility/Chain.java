package com.java.design.pattern.behavioral.chainofresponcibility;

interface Chain 
{ 
    public abstract void setNext(Chain nextInChain); 
    public abstract void process(Number request); 
} 
