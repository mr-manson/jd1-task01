package by.htp.les01.main;

public class BranchTask {

	public static void task01() {
		// 01. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран цифру 7, в противном случае – цифру 8.
		int a = 2;
		int b = 3;
		if (a < b) {
			System.out.println(7);
		}else {
			System.out.println(8);
		}
	}
	
	public static void task02() {
		// 02. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран слово «yes»,
		// в противном случае – слово «no»
		int a = 4;
		int b = 3;
		if (a < b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

	public static void task03() {
		// 03. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3;
		// если больше, то вывести слово «no».
		int a = 1;
		if (a < 3) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
	public static void task04() {
		// 04. Составить программу: равны ли два числа а и b?
		int a = 1;
		int b = 1;
		if (a == b) {
			System.out.println("Числа a и b равны");
		}else {
			System.out.println("Числа a и b не равны");
		}
	}
	
	public static void task05() {
		// 05. Составить программу: определения наименьшего из двух чисел а и b.
		int a = 5;
		int b = 2;
		if (a < b) {
			System.out.println("Из чисел " + a + " и " + b + " наименьшее " + a);
		}else {
			System.out.println("Из чисел " + a + " и " + b + " наименьшее " + b);
		}
	}
	
	public static void task06() {
		// 06. Составить программу: определения наибольшего из двух чисел а и b.
		int a = 5;
		int b = 9;
		if (a > b) {
			System.out.println("Из чисел " + a + " и " + b + " наибольшее " + a);
		}else {
			System.out.println("Из чисел " + a + " и " + b + " наибольшее " + b);
		}
	}
		
	public static void task07() {
		// 07. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
		//
	}
	
	public static void task08() {
		// 08. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		int a = 5;
		int b = 7;
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		if (a2 < b2) {
			System.out.println("Из квадратов чисел " + a + " (" + (int) a2 + ") и " + b + " (" + (int) b2 + ") наименьший " + (int) a2);
		}else {
			System.out.println("Из квадратов чисел " + a + " (" + (int) a2 + ") и " + b + " (" + (int) b2 + ") наименьший " + (int) b2);
		}
	}
	
	public static void task09() {
		// 09. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
		int a = 5;
		int b = 5;
		int c = 5;
		if (a == b && b == c && a == c) {
			System.out.println("Треугольник равносторонний");
		}else {
			System.out.println("Треугольник не равносторонний");
		}
	}
	
	public static void task10() {
		// 10. Составить программу, которая определит площадь какого круга меньше.
		int roundA = 20;
		int roundB = 15;
		if (roundA < roundB) {
			System.out.println("Из двух кругов меньшая площадь у круга А");
		} else {
			System.out.println("Из двух кругов меньшая площадь у круга B");
		}
	}
	
	
	
	//
	//
	//
	//
	//
	//
	//
	//
	//
	public static void task18() {
		int a = -1;
		int b = -1;
		int c = 6;
		int count=0;
		if (a < 0) {
			count ++;
		}
		if (b < 0) {
			count ++;
		}
		if (c < 0) {
			count ++;
		}
		System.out.println(count);
	}
	
	public static void task19() {
		//
	}

}
