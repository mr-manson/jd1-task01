package by.htp.les01.main;

public class Third {

	public static void main(String[] args) {
	// 11
		double a = 5;
		double b = 7;
		double c = Math.pow(a, 2) + Math.pow(b, 2);
		c = Math.sqrt(c);
		double area = a * b / 2;
		double perimeter = a + b + c;
		System.out.println("Площадь треугольника - " + area + " см2");
		System.out.println("Периметр треугольника - " + perimeter + " см");
		
	//12
		double x1 = 2, y1 = 3;
		double x2 = -2, y2 = 1;
		double AC = x1 - x2; // первый катет
		double BC = y1 - y2; // второй катет
		double AB = Math.sqrt(Math.pow(AC, 2) + Math.pow(BC, 2)); // гипотенуза - расстояние между точками
		System.out.println(AB);
		
	//13
		double x11 = -2, y11 = -1;
		double x22 = 2, y22 = 3;
		double x33 = 4, y33 = -2;
		// сторона AB
		double one1 = x11 - x22; // первый катет 1
		double two1 = y11 - y22; // второй катет 1
		double AB2 = Math.sqrt(Math.pow(one1, 2) + Math.pow(two1, 2)); // гипотенуза 1 !!!!
		
		// сторона ВС
		double one2 = x22 - x33; // первый катет 2
		double two2 = y22 - y33; // второй катет 2
		double BC2 = Math.sqrt(Math.pow(one2, 2) + Math.pow(two2, 2)); // гипотенуза 2 !!!!
		
		// сторона AС
		double one3 = x11 - x33; // первый катет 3
		double two3 = y11 - y33; // второй катет 3
		double AC2 = Math.sqrt(Math.pow(one3, 2) + Math.pow(two3, 2)); // гипотенуза 3 !!!!
		
		// периметр
		double perimeter2 = AB2 + BC2 + AC2;
		
		// площадь
		double halfPer = perimeter2 / 2; // полупериметр
		double area2 = (halfPer - AB2) * (halfPer - BC2) * (halfPer - AC2);
		area2 = Math.sqrt(halfPer * area2);
		System.out.println("Периметр треугольника - " + perimeter2 + " см" + "\n"
				+ "Площадь треугольника - " + area2 + " см2");
	
	//14
		double R = 5;
		double CC = 2 * Math.PI * R;
		double SS = Math.PI * Math.pow(R, 2);
		System.out.println("Длина окружности - " + CC + " см");
		System.out.println("Площадь круга - " + SS + " см.кв.");
		
	//15
		double pow2 = Math.pow(Math.PI, 2);
		double pow3 = Math.pow(Math.PI, 3);
		double pow4 = Math.pow(Math.PI, 4);
		double pow5 = Math.pow(Math.PI, 5);
		System.out.println("Число Пи во второй степени - " + pow2);
		System.out.println("Число Пи в третьей степени - " + pow3);
		System.out.println("Число Пи в четвертой степени - " + pow4);
		System.out.println("Число Пи в пятой степени - " + pow5);
		
	//16
		int x = 9513;
		int n1;
		int n2;
		int n3;
		int n4;
		int rez;
		n4 = x % 10;
		n3 = (x % 100) / 10;
		n2 = (x % 1000) / 100;
		n1 = (x / 1000);
		rez = (n1 * n2 * n3 * n4);
		System.out.println("Произведение цифр заданного числа - " + rez);
		
	//17
		double a2 = -9;
		double b2 = 15;
		double average = (Math.pow(a2, 3) + Math.pow(b2, 3)) / 2;
		double geometric = Math.sqrt(Math.abs(a2) * Math.abs(b2));
		System.out.println("Среднее арифметическое кубов - " + average);
		System.out.println("Среднее геометрическое модулей - " + geometric);
		
	//18
		int rebro = 3;
		int areaOne = rebro*rebro;
		int areaFull = areaOne * 6;
		int volum = rebro * rebro* rebro;
		System.out.println("Площадь грани куба - " + areaOne + " см2");
		System.out.println("Площадь полной поверхности куба - " + areaFull + " см2");
		System.out.println("Объем куба куба - " + volum + " см3");
		
	//19
		double a3 = 3;
		double height;
		height = Math.sqrt(a3) / 2 * a3;
		double area3 = a3 / 2 * height;
		double radiusIn = a3 / (2 * Math.sqrt(3));
		double radiusOut = a3 / Math.sqrt(3);
		System.out.println("Высота треугольника - " + height + " см");
		System.out.println("Площадь треугольника - " + area3 + " см2");
		System.out.println("Радиус вписанной окружности - " + radiusIn + " см");
		System.out.println("Радиус описанной окружности - " + radiusOut + " см");
		
	//20
		double length = 30;
		double radius = length / (2 * Math.PI);
		double area4 = Math.PI * Math.pow(radius, 2);
		System.out.println("Площадь круга - " + area4 + " см2");
		

	}

}
