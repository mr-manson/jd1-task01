package by.htp.les01.main;

public class Second {

	public static void main(String[] args) {
	// 01
		double x = 2.2;
		double y = 3.2;
		double summ = x + y;
		double sub = x - y;
		double mult = x * y;
		double div = x / y;
		System.out.println(x + " + " + y + " = " + summ);
		System.out.println(x + " - " + y + " = " + sub);
		System.out.println(x + " * " + y + " = " + mult);
		System.out.println(x + " / " + y + " = " + div);
		
	//02
		double a = 5;
		double с = 3 + a;
		
	//03
		double x1 = 1;
		double y1 = 2;
		double z = 2 * x1 + (y1 - 2) * 5;
		
	//04
		double a1 = 1;
		double b1 = 2;
		double c1 = 3;
		double z1 = ((a1 - 3) * b1 / 2) + c1;
		
	//05
		double a2 = 5;
		double b2 = 6;
		double average = (a2 + b2)/2;
		
	//06
		int bidon1, volum1, litr1;
		int bidon2, volum2, litr2;
		bidon1 = 10; //количество маленьких бидонов
		litr1 = 80; //тотал литров маленьких бидонов
		volum1 = litr1 / bidon1; //объем маленького бидона
		
		volum2 = volum1 + 12; //объем большого бидона
		bidon2 = 15; // количество больших бидонов
		litr2 = volum2 * bidon2; // тотал литров больших бидонов
		
		System.out.println("В " + bidon2 + " больших бидонах " + litr2 + " литров молока");
		
	//07
		double length = 6;
		double width = length / 2;
		double area = length * width;
		
	//08
		double a3 = 2;
		double b3 = 3;
		double c3 = 4;
		double rez;
		rez = Math.pow(b3, 2);
		rez = rez + 4 * a3 * c3;
		rez = Math.sqrt(rez);
		rez = rez + b3;
		rez = rez / (2 * a3);
		rez = rez - (Math.pow(a3, 3) * c3);
		rez = rez + Math.pow(b3, -2);
		System.out.println(rez);
		
	//09
		double a4 = 2;
		double b4 = 3;
		double c4 = 4;
		double d4 = 5;
		double rez4 = a4 / c4 * b4 / d4;
		rez4 = rez4 - ((a4 * b4 - c4) / (c4 * d4));
		System.out.println(rez4);
		
	//10
		double x2 = 15;
		double y2 = 25;
		double rez2;
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);
		rez2 = (Math.sin(x2) + Math.cos(y2)) / (Math.cos(x2) - Math.sin(y2));
		rez2 = rez2 * Math.tan(x2 * y2);
		System.out.println("Значение выражения - " + rez2);
		
		
		
			
		
		
	
		
	}

}
