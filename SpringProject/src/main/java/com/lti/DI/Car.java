package com.lti.DI;

public class Car {
	private Wheel w;
	
	
	public Wheel getW() {
		return w;
	}

	public void setW(Wheel w) {
		this.w = w;
	}

	public void move()
	{
		w.rotate();
	}
	
	
	}
