package by.htp.les01.main;

public class LinearTask {

	public static void task01() {
		// 01. Даны два действительных числа х и у. Вычислить их сумму, разность,
		// произведение и частное.
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
	}

	public static void task02() {
		// 02. Найдите значение функции: с = 3 + а
		double a = 5;
		double c = 3 + a;
		System.out.println("Значение функции с - " + c);
	}

	public static void task03() {
		// 03. Найдите значение функции: z = 2 * x + ( y – 2 ) * 5
		double x = 1;
		double y = 2;
		double z = 2 * x + (y - 2) * 5;
		System.out.println("Значение функции z - " + z);
	}

	public static void task04() {
		// 04. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
		double a = 1;
		double b = 2;
		double c = 3;
		double z = ((a - 3) * b / 2) + c;
		System.out.println("Значение функции z - " + z);
	}

	public static void task05() {
		// 05. Составить алгоритм нахождения среднего арифметического двух чисел
		double a = 5;
		double b = 6;
		double average = (a + b) / 2;
		System.out.println("Среднее арифметическое чисел " + a + " и " + b + " = " + average);
	}

	public static void task06() {
		// 06. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько
		// литров молока в m больших бидонах,
		// если в каждом большом бидоне на 12 л. больше, чем в малом?
		int bidon1, volum1, litr1;
		int bidon2, volum2, litr2;
		bidon1 = 10; // количество маленьких бидонов
		litr1 = 80; // тотал литров маленьких бидонов
		volum1 = litr1 / bidon1; // объем маленького бидона

		volum2 = volum1 + 12; // объем большого бидона
		bidon2 = 15; // количество больших бидонов
		litr2 = volum2 * bidon2; // тотал литров больших бидонов

		System.out.println("В " + bidon2 + " больших бидонах " + litr2 + " литров молока");
	}

	public static void task07() {
		// 07. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь
		// прямоугольника
		double length = 6;
		double width = length / 2;
		double area = length * width;
		System.out.println("Площадь прямоугольника - " + area);
	}

	public static void task08() {
		// 08. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения)
		double a = 2;
		double b = 3;
		double c = 4;
		double rez;
		rez = Math.pow(b, 2);
		rez = rez + 4 * a * c;
		rez = Math.sqrt(rez);
		rez = rez + b;
		rez = rez / (2 * a);
		rez = rez - (Math.pow(a, 3) * c);
		rez = rez + Math.pow(b, -2);
		System.out.println("Значение выражения - " + rez);
	}

	public static void task09() {
		// 09. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения)
		double a = 2;
		double b = 3;
		double c = 4;
		double d = 5;
		double rez = a / c * b / d;
		rez = rez - ((a * b - c) / (c * d));
		System.out.println("Значение выражения - " + rez);
	}

	public static void task10() {
		// 10. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения)
		double x = 15;
		double y = 25;
		double rez;
		x = Math.toRadians(x);
		y = Math.toRadians(y);
		rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
		rez = rez * Math.tan(x * y);
		System.out.println("Значение выражения - " + rez);
	}

	public static void task11() {
		// 11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
		// двух катетов
		double a = 5;
		double b = 7;
		double c = Math.pow(a, 2) + Math.pow(b, 2);
		c = Math.sqrt(c);
		double area = a * b / 2;
		double perimeter = a + b + c;
		System.out.println("Площадь треугольника - " + area + " см2");
		System.out.println("Периметр треугольника - " + perimeter + " см");
	}

	public static void task12() {
		// 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
		// (x2, у2)
		double x1 = 2, y1 = 3;
		double x2 = -2, y2 = 1;
		double AC = x1 - x2; // первый катет
		double BC = y1 - y2; // второй катет
		double AB = Math.sqrt(Math.pow(AC, 2) + Math.pow(BC, 2)); // гипотенуза - расстояние между точками
		System.out.println("Расстояние между точками -" + AB);
	}

	public static void task13() {
		// 13. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).
		// Найти его периметр и площадь
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
		System.out.println(
				"Периметр треугольника - " + perimeter2 + " см" + "\n" + "Площадь треугольника - " + area2 + " см2");
	}

	public static void task14() {
		// 14. Вычислить длину окружности и площадь круга одного и того же заданного
		// радиуса R
		double R = 5;
		double C = 2 * Math.PI * R;
		double S = Math.PI * Math.pow(R, 2);
		System.out.println("Длина окружности - " + C + " см");
		System.out.println("Площадь круга - " + S + " см.кв.");
	}

	public static void task15() {
		// 15. Написать программу, которая выводит на экран первые четыре степени числа
		// π
		double pow2 = Math.pow(Math.PI, 2);
		double pow3 = Math.pow(Math.PI, 3);
		double pow4 = Math.pow(Math.PI, 4);
		double pow5 = Math.pow(Math.PI, 5);
		System.out.println("Число Пи во второй степени - " + pow2);
		System.out.println("Число Пи в третьей степени - " + pow3);
		System.out.println("Число Пи в четвертой степени - " + pow4);
		System.out.println("Число Пи в пятой степени - " + pow5);
	}

	public static void task16() {
		// 16. Найти произведение цифр заданного четырехзначного числа
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
	}

	public static void task17() {
		// 17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
		// геометрическое модулей этих чисел
		double a = -9;
		double b = 15;
		double average = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double geometric = Math.sqrt(Math.abs(a) * Math.abs(b));
		System.out.println("Среднее арифметическое кубов - " + average);
		System.out.println("Среднее геометрическое модулей - " + geometric);
	}

	public static void task18() {
		// 18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
		// объем этого куба
		int rebro = 3;
		int areaOne = rebro * rebro;
		int areaFull = areaOne * 6;
		int volum = rebro * rebro * rebro;
		System.out.println("Площадь грани куба - " + areaOne + " см2");
		System.out.println("Площадь полной поверхности куба - " + areaFull + " см2");
		System.out.println("Объем куба куба - " + volum + " см3");
	}

	public static void task19() {
		// 19. Дана сторона равностороннего треугольника. Найти площадь этого
		// треугольника, его высоту, радиусы вписанной и описанной окружностей.
		double a = 3;
		double height;
		height = Math.sqrt(a) / 2 * a;
		double area = a / 2 * height;
		double radiusIn = a / (2 * Math.sqrt(3));
		double radiusOut = a / Math.sqrt(3);
		System.out.println("Высота треугольника - " + height + " см");
		System.out.println("Площадь треугольника - " + area + " см2");
		System.out.println("Радиус вписанной окружности - " + radiusIn + " см");
		System.out.println("Радиус описанной окружности - " + radiusOut + " см");
	}

	public static void task20() {
		// 20. Известна длина окружности. Найти площадь круга, ограниченного этой
		// окружностью
		double length = 30;
		double radius = length / (2 * Math.PI);
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("Площадь круга - " + area + " см2");
	}

	public static void task21() {
		// 21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной
		// и целой частях).
		// Поменять местами дробную и целую части числа и вывести полученное значение
		// числа
		double R = 333.444;
		int j = (int) R;
		int k = (int) ((R % j) * 1000);
		System.out.println(R + " -> " + k + "." + j);
	}

	public static void task22() {
		// 22. Дано натуральное число Т, которое представляет длительность прошедшего
		// времени в секундах.
		// Вывести данное значение длительности в часах, минутах и секундах в следующей
		// форме: ННч ММмин SSc
		double totalSec = 10000;
		int hour = (int) totalSec / 3600;
		int min = (int) (totalSec - hour * 3600) / 60;
		int sec = (int) (totalSec - (hour * 3600) - (min * 60));

		String zeroH = "", zeroM = "", zeroS = "";
		if (hour < 10) {
			zeroH += "0";
		}
		if (min < 10) {
			zeroM += "0";
		}
		if (sec < 10) {
			zeroS += "0";
		}
		System.out.println(zeroH + hour + " ч " + zeroM + min + " м " + zeroS + sec + " с");
	}

	public static void task23() {
		// 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R
		// (R> r)
		double rIn = 10;
		double rOut = 20;
		double areaIn = Math.PI * Math.pow(rIn, 2);
		double areaOut = Math.PI * Math.pow(rOut, 2);
		double areaRing = areaOut - areaIn;
		System.out.println("Площадь кольца - " + areaRing + " см2");
	}

	public static void task24() {
		// 24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при
		// большем основании а
		double a = 17;
		double b = 11;
		double degrees = 40;
		double radians = Math.toRadians(degrees);
		double tgAngle = Math.tan(radians);
		double areaTrapeze = (Math.pow(a, 2) - Math.pow(b, 2)) / 4;
		areaTrapeze = areaTrapeze * tgAngle;
		System.out.println("Площадь трапеции - " + areaTrapeze + " см2");
	}

	public static void task25() {
		// 25. Вычислить корни квадратного уравнения ах 2 + bх + с = 0 с заданными
		// коэффициентами a, b и с
		// (предполагается, что а≠0 и что дискриминант уравнения неотрицателен)
		double a = 3;
		double b = -14;
		double c = -5;
		double D;
		double x;
		double x1;
		double x2;

		D = Math.pow(b, 2) - 4 * a * c;
		if (D > 0) {
			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("Уравнение имеет 2 корня: x1 = " + x1 + ", x2 = " + x2);
		} else if (D == 0) {
			x = -b / (2 * a);
			System.out.println("Уравнение имеет 1 корень: x = " + x);
		} else if (D < 0) {
			System.out.println("Уравнение не имеет корней");
		}
	}

	public static void task26() {
		// 26. Найти площадь треугольника, две стороны которого равны а и b, а угол
		// между этими сторонами у
		double a = 15; // сторона a
		double b = 25; // сторона b
		double y = 35; // угол в градусах
		y = Math.toRadians(y); // угол в радианах
		y = Math.sin(y); // синус угла
		double area = (a * b * y) / 2; // площадь
		System.out.println("Площадь треугольника - " + area + " см2");
	}

	public static void task27() {
		// 27. Дано значение a. Не используя никаких функций и никаких операций, кроме
		// умножения,
		// получить значение а 8 за три операции и а 10 за четыре операции
		int u = 2;
		int u2 = u * u;
		int u4 = u2 * u2;
		System.out.println("Число " + u + " в восьмой степени = " + u4 * u4);

		int uu = 2;
		int uu2 = uu * uu;
		int uu4 = uu2 * uu2;
		System.out.println("Число " + uu + " в десятой степени = " + uu4 * uu4 * uu2);
	}

	public static void task28() {
		// 28. Составить программу перевода радианной меры угла в градусы, минуты и
		// секунды
		double r = 0.996960;
		double gr;
		double m;
		double s;

		gr = (180 / Math.PI) * r;
		m = (gr - (int) gr) * 60;
		s = (m - (int) m) * 60;

		System.out.println(r + " радиан равны " + (int) gr + "°" + (int) m + "'" + (int) s + "\"");
	}

	public static void task29() {
		// 29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с
		int a = 5;
		int b = 6;
		int c = 7;

		double angleA, radA, grA;
		double angleB, radB, grB;
		double angleC, radC, grC;

		angleA = (Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c);
		radA = Math.acos(angleA);
		grA = (double) (Math.round((radA * 180 / Math.PI) * 100)) / 100;

		angleB = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
		radB = Math.acos(angleB);
		grB = (double) (Math.round((radB * 180 / Math.PI) * 100)) / 100;

		angleC = (Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c);
		radC = Math.acos(angleC);
		grC = (double) (Math.round((radC * 180 / Math.PI) * 100)) / 100;

		System.out.println("Угол А равен " + grA + "° или " + (double) (Math.round(radA * 100000)) / 100000 + " рад");
		System.out.println("Угол B равен " + grB + "° или " + (double) (Math.round(radB * 100000)) / 100000 + " рад");
		System.out.println("Угол C равен " + grC + "° или " + (double) (Math.round(radC * 100000)) / 100000 + " рад");
	}

	public static void task30() {
		// 30. Три сопротивления R 1 R 2 , и R 3 соединены параллельно. Найдите
		// сопротивление соединения
		double R1 = 10;
		double R2 = 12;
		double R3 = 14;
		double RR;
		RR = 1 / R1 + 1 / R2 + 1 / R3; // 1
		RR = 1 / RR; // 2
		System.out.printf("Сопротивление параллельного соединения - %.3f%n", RR, " Ом"); // ????
	}

	public static void task31() {
		// 31. Составить программу для вычисления пути, пройденного лодкой, если ее
		// скорость в стоячей воде v км/ч,
		// скорость течения реки v 1 км/ч, время движения по озеру t 1 ч, а против
		// течения реки — t 2 ч
		double vLace = 10;
		double vOfRiver = 7;
		double tLace = 20;
		double tRiver = 30;
		double sLace;
		double sRiver;

		sLace = vLace * tLace;
		sRiver = (vLace - vOfRiver) * tRiver;

		System.out.println("Расстояние пройденное по озеру - " + sLace);
		System.out.println("Расстояние пройденное по озеру - " + sRiver);
	}

	public static void task32() {
		// 32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к
		// с (0 ≤к ≤59).
		// Какое время будут показывать часы через р ч q мин r с
		int m = 12;
		int n = 36;
		int k = 55;
		String zero = "0";

		System.out.println("Текущее время " + m + ":" + n + ":" + k);

		int p = 12;
		int q = 25;
		int r = 6;

		System.out.print("Через " + p + " ч " + q + " м " + r + " c будет ");

		m += p;
		n += q;
		k += r;

		if (k > 59) {
			k = k % 60;
			n++;
		}

		if (n > 59) {
			n = n % 60;
			m++;
		}
		if (m > 23) {
			m = m % 24;
		}

		if (m < 10) {
			System.out.print(zero + m + ":");
		} else {
			System.out.print(m + ":");
		}

		if (n < 10) {
			System.out.print(zero + n + ":");
		} else {
			System.out.print(n + ":");
		}
		if (k < 10) {
			System.out.print(zero + k);
		} else {
			System.out.print(k);
		}
	}

	public static void task33() {
		// 33. Ввести любой символ и определить его порядковый номер, а также указать
		// предыдущий и последующий символы
		char a = 'i';
		int b = (int) a;
		char before = (char) (b - 1);
		char after = (char) (b + 1);
		System.out.println("Порядковый номер символа - " + b);
		System.out.println("Символ до - " + before);
		System.out.println("Символ после " + after);
	}

	public static void task34() {
		// 34. Дана величина А, выражающая объем информации в байтах. Перевести А в
		// более крупные единицы измерения информации
		double A = 200000;
		double kA;
		double mA;
		double gA;
		int x = 1024;

		kA = A / x;
		mA = kA / x;
		gA = mA / x;

		System.out.println(A + " Б это " + kA + " КБ, " + mA + " МБ, " + gA + " ГБ");
	}

	public static void task35() {
		// 35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и
		// младшую цифру целой части числа M/N
		double m = 226;
		double n = 17;
		double div = m / n;
		int div2 = (int) div;
		int cel = (int) div % 10;
		int drob = (int) ((div % div2) * 10);

		System.out.println("m / n = " + div);
		System.out.println("Старшая цифра дробной части - " + drob);
		System.out.println("Младшая цифра целой части - " + cel);
	}

	public static void task36() {
		// 36. Найти частное произведений четных и нечетных цифр четырехзначного числа
		int x = 1234;
		int n1, n2, n3, n4;
		double rez;
		double even = 0;
		double odd = 0;

		n4 = x % 10;
		n3 = (x % 100) / 10;
		n2 = (x % 1000) / 100;
		n1 = (x / 1000);

		if (n1 % 2 == 0) {
			even += n1;
		} else {
			odd += n1;
		}

		if (n2 % 2 == 0) {
			even += n2;
		} else {
			odd += n2;
		}

		if (n3 % 2 == 0) {
			even += n3;
		} else {
			odd += n3;
		}

		if (n4 % 2 == 0) {
			even += n4;
		} else {
			odd += n4;
		}

		rez = even / odd;
		if (odd != 0) {
			System.out.println(rez);
		} else {
			System.out.println("Деление на ноль!!!");
		}
	}

	public static void task37_1() {
		// 37.1. Целое число N является четным двузначным числом.
		int n = 111;

		if (n % 2 == 00 && n > 9 && n < 100) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task37_2() {
		// 37.2. Сумма двух первых цифр заданного четырехзначного числа равна сумме двух
		// его последних цифр
		int n = 6271;
		int n1, n2, n3, n4;

		n1 = n % 10;
		n2 = (n / 10) % 10;
		n3 = (n / 100) % 10;
		n4 = n / 1000;
		;

		if ((n1 + n2) == (n3 + n4)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task37_3() {
		// 37.3. Сумма цифр данного трехзначного числа N является четным числом.
		int n = 671;
		int n1, n2, n3;

		n1 = n % 10;
		n2 = (n / 10) % 10;
		n3 = n / 100;

		if ((n1 + n2 + n3) % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task37_4() {
		// 37.4. Точка с координатами (х, у) принадлежит части плоскости, лежащей между
		// прямыми х= т, х= п (т<п).
		int x = 2;

		int m = -10;
		int n = 10;

		if (x > m && x < n) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task37_5() {
		// 37.5. Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа
		int n = 671;
		int n1, n2, n3;

		n1 = n % 10;
		n2 = (n / 10) % 10;
		n3 = n / 100;

		if (Math.pow(n, 2) == Math.pow((n1 + n2 + n3), 3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task37_6() {
		// 37.6. Треугольник со сторонами а,b,с является равнобедренным.
		int a = 5;
		int b = 5;
		int c = 6;

		if (a == b || a == c || b == c) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task37_7() {
		// 37.7. Сумма каких-либо двух цифр заданного трехзначного натурального числа N
		// равна третьей цифре.
		int n = 671;
		int n1, n2, n3;

		n1 = n % 10;
		n2 = (n / 10) % 10;
		n3 = n / 100;

		if (n1 + n2 == n3 || n1 + n3 == n2 || n2 + n3 == n1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task37_8() {
		// 37.8. Заданное число N является степенью числа а (показатель степени может
		// находиться в диапазоне от 0 до 4).
		int a = 2;
		int n = 16;
		double n1, n2, n3, n4, n5;

		n1 = Math.pow(a, 0);
		n2 = Math.pow(a, 1);
		n3 = Math.pow(a, 2);
		n4 = Math.pow(a, 3);
		n5 = Math.pow(a, 4);

		if (n == n1 || n == n2 || n == n3 || n == n4 || n == n5) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task37_9() {
		// 37.9. График функции у = ах2 + bх+ с проходит через заданную точку с
		// координатами (m, п).
		int a = 2;
		int b = 3;
		int c = 4;
		int z;

		int x = 3;
		int y = 5;

		z = a * x * x + b * x + c;

		if (y == z) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task38_1() {
		// 38. Для данных областей составить линейную программу, которая печатает true,
		// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае
		int x = -4;
		int y = 0;
		
		if (y >= 0 && ((x + y == 4) || (x - y == -4))) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static void task38_2() {
		// 38. Для данных областей составить линейную программу, которая печатает true,
		// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае
		int x = 3;
		int y = -1;
		
		if (y <= 0 && y >= -3 && x <= 4 && x >= -4) {
			System.out.println("true");
		} else if (y >= 0 && y <= 4 && x <= 2 && x >= -2){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static void task38_3() {
		// 38. Для данных областей составить линейную программу, которая печатает true,
		// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае
		int x = 3;
		int y = -1;

		if (x >= 0 && y >= 0 && (x * x + y * y) <= 16) {
			System.out.println("true");
		} else if (x >= 0 && y <= 0 && (x * x + y * y) <= 25) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void task39() {
		// 39. Дано действительное число х. Не пользуясь никакими другими
		// арифметическими операциями, кроме умножения,
		// сложения и вычитания, вычислите за минимальное число операций: 2x 4 - 3х 3 +
		// 4х 2 - 5х + 6.
		int x = 2;
		int y;
		int x2;

		x2 = x * x;
		y = (x2 * (2 * x2 - 3 * x + 4)) - 5 * x + 6;

		System.out.println(y);
	}

	public static void task40() {
		// 40. Дано значение х. Получить значения -2х + 3х 2 - 4х 3 и 1 + 2х + 3х 2 +
		// 4х3. Позаботьтесь об экономии операций
		int x = 2;
		int y1, y2;
		int x2;

		x2 = x * x;
		y1 = -2 * x + (x2 * (3 - 4 * x));
		y2 = 1 + 2 * x + (x2 * (3 + 4 * x));

		System.out.println("y1 = " + y1 + ", y2 = " + y2);
	}
}