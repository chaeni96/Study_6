package com.iu.c6;

public class Aircon extends Electric {
	
	private int pyung; //사용면적

	public int getPyung() {
		return pyung;
	}

	public void setPyung(int pyung) {
		this.pyung = pyung;
	}
	
	public void info() {
		super.info();
		System.out.println("Pyung : "+pyung);
	}

}
