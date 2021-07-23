package com.iu.c6;

public class C6Main {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.setBrand("Samsung");
		tv.setColor("Black");
		tv.setPrice(3000000);
		tv.setPoint(300);
		tv.setSize(100);
		
		Computer computer = new Computer();
		computer.setBrand("LG");
		computer.setColor("Pink");
		computer.setPrice(1700000);
		computer.setPoint(17);
		computer.setSsd(512);
		
		Aircon aircon = new Aircon();
		aircon.setBrand("Carrier");
		aircon.setColor("Green");
		aircon.setPrice(1500000);
		aircon.setPoint(10);
		aircon.setPyung(6);
		
		tv.info();
		computer.info();
		aircon.info();
		
		Guest iu = new Guest();
		iu.setMoney(5000000);
		iu.setPoint(10);
		//buy
		//iu.buy(aircon); 한제품을 샀을때
		
		Electric [] electrics = new Electric[2];
		electrics[0]=tv;
		electrics[1]= aircon;
		
		iu.buy(electrics);
		//게스트의 돈, 포인트 출력
		System.out.println(iu.getMoney());
		System.out.println(iu.getPoint());
		
	}

}
