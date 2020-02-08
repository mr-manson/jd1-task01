package by.htp.les01.main;

import java.util.Scanner;

public class CyrcleTask {

	public static void task01() {
		// 1. Необходимо вывести на экран числа от 1 до 5.
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
	}

	public static void task02() {
		// 2. Необходимо вывести на экран числа от 5 до 1.
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
	}

	public static void task03() {
		// 3. Необходимо вывести на экран таблицу умножения на 3:
		int a;

		for (int i = 1; i <= 9; i++) {
			a = i * 3;
			System.out.print(i + " * 3 = " + a);
		}
	}

	public static void task04() {
		// 4. С помощью оператора while напишите программу вывода всех четных чисел в
		// диапазоне от 2 до 100 включительно.
		int a = 0;

		while (a <= 100) {
			a++;
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}
	}

	public static void task05() {
		// 5. С помощью оператора while напишите программу определения суммы всех
		// нечетных чисел в диапазоне от 1 до 99 включительно.
		int a = 0;
		int sum = 0;

		while (a < 100) {
			a++;
			if (a % 2 != 0) {
				sum += a;
			}
		}
		System.out.println(sum);
	}

	public static void task06() {
		// 6. Напишите программу, где пользователь вводит любое целое положительное
		// число. А программа суммирует все числа от 1 до введенного пользователем
		// числа.
		int a;
		int b = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Введите любое положительное число");
		a = s.nextInt();
		s.close();
		int sum = 0;
		while (b < a) {
			b++;
			sum += b;
		}
		System.out.println("Сумма всех чисел от нуля до " + a + " равна " + sum);
	}

	public static void task07() {
		// 7. Вычислить значения функции на отрезке [а,b] c шагом h:
		int a = -3;
		int b = 3;
		int h = 2;
		int y;

		for (int x = a; x <= b; x += h) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.print(y + " ");
		}
	}

	public static void task08() {
		// 8. Вычислить значения функции на отрезке [а,b] c шагом h:
		int a = -15;
		int b = 15;
		int c = 5;
		int h = 2;
		int y;

		for (int x = a; x <= b; x += h) {
			if (x == 15) {
				y = (x + c) * 2;
			} else {
				y = (x - c) + 6;
			}
			System.out.print(y + " ");
		}
	}

	public static void task09() {
		// 9. Найти сумму квадратов первых ста чисел.
		int a = 100;
		int sum = 0;

		for (int i = 0; i <= a; i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println("Сумма квадратов первых " + a + " чисел равна " + sum);
	}

	public static void task10() {
		// 10. Составить программу нахождения произведения квадратов первых двухсот
		// чисел.
		long a = 200L;
		long sum = 0L;

		for (int i = 0; i <= a; i++) {
			sum *= Math.pow(i, 2);
		}
		if (sum <= 0) {
			System.out.println("Переполнение!!!");
		} else {
			System.out.println("Произведение квадратов первых " + a + " чисел равна " + sum);
		}
	}

	public static void task11() {
		// 11. Составить программу нахождения разности кубов первых двухсот чисел
		int sub = 1;

		for (int i = 2; i <= 200; i++) {
			sub -= Math.pow(i, 3);
		}
		System.out.println(sub);
	}

	public static void task12() {
		// 12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n
		// >1 Составьте программу
		// нахождения произведения первых 10 членов этой последовательности.
		int a = 1;
		long y = 1L;

		for (int i = 2; i <= 10; i++) {
			a += 6;
			y *= a;
		}
		System.out.println(y);
	}

	public static void task13() {
		// 13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с
		// шагом 0.5.
		double a = -5;
		double b = 5;
		double y = 0;

		System.out.println("  x  ->  y");

		for (double x = a; x <= b; x += 0.5) {
			y = 5 - x * x / 2;
			System.out.println(x + "  ->  " + y);
		}
	}

	public static void task14() {
		// 14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
		double n = 10;
		double sum = 0;

		for (double i = 1; i <= n; i++) {
			sum += 1 / i;
		}
		System.out.println("Сумма равна " + sum);
	}

	public static void task15() {
		// 15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += Math.pow(2, i);
		}
		System.out.println("Сумма равна " + sum);
	}

	public static void task16() {
		// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
		int sum = 1;
		long mult = 1;

		for (int i = 2; i <= 10; i++) {
			sum += i;
			mult *= sum;
		}
		System.out.println(mult);
	}

	public static void task17() {
		// 17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
		double a = 1;
		int n = 5;

		for (int i = 1; i < n; i++) {
			a *= (a + i);
		}
		System.out.println(a);
	}

	public static void task18() {
		// 18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		// модуль которых больше или
		// равен заданному е.
		double a = 0;
		double e = 0.1;
		double n = 7;
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			a = (Math.pow(-1, i - 1)) / i;
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		System.out.println("Сумма модулей равна " + sum);
	}

	public static void task19() {
		// 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		// модуль которых больше или
		// равен заданному е.
		double a = 0;
		double e = 0.1;
		double n = 7;
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		System.out.println("Сумма модулей равна " + sum);
	}

	public static void task20() {
		// 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
		// модуль которых больше или
		// равен заданному е.
		double a = 0;
		double e = 0.1;
		double n = 7;
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			a = 1 / ((3 * i - 2) * (3 * i + 1));
			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		System.out.println("Сумма модулей равна " + sum);
	}

	public static void task21() {
		// 21. Составить программу для вычисления значений функции F(x) на отрезке [а,
		// b] с шагом h. Результат представить
		// в виде таблицы, первый столбец которой – значения аргумента, второй -
		// соответствующие значения функции:
		int a = -3;
		int b = 3;
		double h = 1;
		double f;

		System.out.println(" x  ->  f");

		for (int x = a; x <= b; x += h) {
			f = x - Math.sin(x);
			System.out.println(x + "  ->  " + f);
		}
	}

	public static void task22() {
		// 22. Составить программу для вычисления значений функции F(x) на отрезке [а,
		// b] с шагом h. Результат представить
		// в виде таблицы, первый столбец которой – значения аргумента, второй -
		// соответствующие значения функции:
		int a = -3;
		int b = 3;
		double h = 1;
		double f;

		System.out.println(" x  ->  f");

		for (int x = a; x <= b; x += h) {
			f = Math.pow(Math.sin(x), 2);
			System.out.println(x + "  ->  " + f);
		}
	}

	public static void task23() {
		// 23. Составить программу для вычисления значений функции F(x) на отрезке [а,
		// b] с шагом h. Результат представить
		// в виде таблицы, первый столбец которой – значения аргумента, второй -
		// соответствующие значения функции:
		int a = -3;
		int b = 3;
		double h = 1;
		double f;

		System.out.println(" x  ->  f");

		for (int x = a; x <= b; x += h) {
			f = 1 / Math.tan(x / 3) + Math.sin(x) / 2;
			System.out.println(x + "  ->  " + f);
		}
	}

	public static void task24() {
		// 24. Вводится натуральное число. Найти сумму четных цифр, входящих в его
		// состав. Преобразовать его в другое число, цифры которого будут следовать
		// в обратном порядке по сравнению с введенным числом.

	}

	public static void task25() {
		// 25. Требуется определить факториал числа, которое ввел пользователь.
		int a = 10;
		int b = 1;
		int c = 1;
		for (int i = 1; i <= a; i++) {
			b *= c;
			c++;
		}
		System.out.println("Факториал числа " + a + " равен " + b);
	}

	public static void task26() {
		// 26. Вывести на экран соответствий между символами и их численными
		// обозначениями в памяти компьютера (Таблицу ASCII).
		char symb;
		int a = 40;
		int b = 45;
		int i;

		for (i = a; i <= b; i++) {
			symb = (char) i;
			System.out.println(i + "  ->  " + symb);
		}
	}

	public static void task27() {
		// 27. Для каждого натурального числа в промежутке от m до n вывести все
		// делители, кроме единицы и
		// самого числа. m и n вводятся с клавиатуры.
		int m = 10;
		int n = 15;
		// int count = 0;

		for (int i = m; i <= n; i++) {
			System.out.print("Делители числа " + i + " - ");
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					System.out.print(j + "  ");
				}
			}
			if (count == 0) {
				System.out.print("делителей нет");
			}
			System.out.println("");
		}
	}

	public static void task28() {
		// 282. Написать программу, в которой вводятся два операнда Х и Y и знак
		// операции (+, –, /, *). Вычислить
		// результат Z в зависимости от знака. Предусмотреть реакции на возможный
		// неверный знак операции, а
		// также на ввод Y=0 при делении. Организовать возможность многократных
		// вычислений без
		// перезагрузки программа (т.е. построить цикл). В качестве символа прекращения
		// вычислений принять ‘0’.
		int a;
		int b;
		int rez = 0;
		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите первое число");
			a = sc.nextInt();
			System.out.println("Введите второе число");
			b = sc.nextInt();
			System.out.println("Введите знак операции (+ - / *)");
			char c = sc.next().charAt(0);
			// sc.close();
			if (c == '*') {
				rez = a * b;
			} else if (c == '/') {
				if (b == 0) {
					System.out.println("Деление на ноль!");
				} else {
					rez = a / b;
				}
			} else if (c == '+') {
				rez = a + b;
			} else if (c == '-') {
				rez = a - b;
			}
			System.out.println(a + " " + c + " " + b + " = " + rez);
		} while (rez != 0);
	}

	public static void task29() {
		// 29. Даны два числа. Определить цифры, входящие в запись как первого так и
		// второго числа.

	}

	public static void task39() {
		// 39. В трехзначном числе зачеркнули старшую цифру. Когда полученное число
		// умножили на 7, то
		// получили исходное число. Найти это число.
		int a;
		for (int i = 100; i <= 999; i++) {
			a = i % 100;
			if (a * 7 == i) {
				System.out.println(i);
			}
		}
	}
	//
	//
	//
	//
	//
	//

}
