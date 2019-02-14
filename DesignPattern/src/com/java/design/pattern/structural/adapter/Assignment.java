package com.java.design.pattern.structural.adapter;

public class Assignment {

	private Pen p;
	
	private PilotPen pilotPen ;
	
	public void writeAssignments(String str) {
		p.write(str);
	}

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public PilotPen getPilotPen() {
		return pilotPen;
	}

	public void setPilotPen(PilotPen pilotPen) {
		this.pilotPen = pilotPen;
	}
}
