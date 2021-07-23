package com.iu.c6;

public class Guest {
	
	private int money;
	private int point;
	
	//매개변수는 1개만 선언 가능
	public void buy(Electric electric) {
		
		this.money = this.money -electric.getPrice();
		this.point = this.point + electric.getPoint();
		
	}
	//여러개를 샀을때 계산하는 메서드
	//매개변수는 1개만 선언 가능
	public void buy(Electric [] electrics) {
		for(int i=0;i<electrics.length;i++) {
			this.money = this.money - electrics[i].getPrice();
			this.point = this.point + electrics[i].getPoint();
		}
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	
	

}
