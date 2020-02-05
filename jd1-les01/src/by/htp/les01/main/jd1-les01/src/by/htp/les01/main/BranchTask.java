package by.htp.les01.main;

import java.util.Scanner;

public class BranchTask {

	public static void task01() {
		// 01. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
		// на экран цифру 7, в противном случае – цифру 8.
		int a = 2;
		int b = 3;

		if (a < b) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}
	}

	public static void task02() {
		// 02. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести
		// на экран слово «yes»,
		// в противном случае – слово «no»
		int a = 4;
		int b = 3;

		if (a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static void task03() {
		// 03. Составить программу сравнения введенного числа а и цифры 3. Вывести на
		// экран слово «yes», если число а меньше 3;
		// если больше, то вывести слово «no».
		int a = 1;

		if (a < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static void task04() {
		// 04. Составить программу: равны ли два числа а и b?
		int a = 1;
		int b = 1;

		if (a == b) {
			System.out.println("Числа a и b равны");
		} else {
			System.out.println("Числа a и b не равны");
		}
	}

	public static void task05() {
		// 05. Составить программу: определения наименьшего из двух чисел а и b.
		int a = 5;
		int b = 2;

		if (a < b) {
			System.out.println("Из чисел " + a + " и " + b + " наименьшее " + a);
		} else {
			System.out.println("Из чисел " + a + " и " + b + " наименьшее " + b);
		}
	}

	public static void task06() {
		// 06. Составить программу: определения наибольшего из двух чисел а и b.
		int a = 5;
		int b = 9;

		if (a > b) {
			System.out.println("Из чисел " + a + " и " + b + " наибольшее " + a);
		} else {
			System.out.println("Из чисел " + a + " и " + b + " наибольшее " + b);
		}
	}

	public static void task07() {
		// 07. Составить программу нахождения модуля выражения a*x*x + b*x + c при
		// заданных значениях a, b, c и х
		int a = 2;
		int b = -6;
		int c = -8;
		int x = 3;
		int y;

		y = a * x * x + b * x + c;

		if (y < 0) {
			System.out.println("Модуль выражения равен " + -y);
		} else if (y > 0) {
			System.out.println("Модуль выражения равен " + y);
		}
	}

	public static void task08() {
		// 08. Составить программу нахождения наименьшего из квадратов двух чисел а и b.
		int a = 5;
		int b = 7;

		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);

		if (a2 < b2) {
			System.out.println("Из квадратов чисел " + a + " (" + (int) a2 + ") и " + b + " (" + (int) b2
					+ ") наименьший " + (int) a2);
		} else {
			System.out.println("Из квадратов чисел " + a + " (" + (int) a2 + ") и " + b + " (" + (int) b2
					+ ") наименьший " + (int) b2);
		}
	}

	public static void task09() {
		// 09. Составить программу, которая определит по трем введенным сторонам,
		// является ли данный треугольник равносторонним.
		int a = 5;
		int b = 5;
		int c = 5;

		if (a == b && b == c && a == c) {
			System.out.println("Треугольник равносторонний");
		} else {
			System.out.println("Треугольник не равносторонний");
		}
	}

	public static void task10() {
		// 10. Составить программу, которая определит площадь какого круга меньше.
		int circleA = 20;
		int circleB = 15;

		if (circleA < circleB) {
			System.out.println("Из двух кругов меньшая площадь у круга А");
		} else {
			System.out.println("Из двух кругов меньшая площадь у круга B");
		}
	}

	public static void task11() {
		// 11. Составить программу, которая определит площадь какого треугольника
		// больше.
		int triangleA = 20;
		int triangleB = 15;

		if (triangleA > triangleB) {
			System.out.println("Из двух треугольников большая площадь у треугольника А");
		} else {
			System.out.println("Из двух треугольников большая площадь у треугольника B");
		}
	}

	public static void task12() {
		// 12. Даны три действительных числа. Возвести в квадрат те из них, значения
		// которых неотрицательны, и в четвертую степень — отрицательные.
		double a = 5;
		double b = -9;
		double c = -4;
		double below = 0;
		double above = 0;

		if (a < 0) {
			below += a;
		} else {
			above += a;
		}

		if (b < 0) {
			below += b;
		} else {
			above += b;
		}

		if (c < 0) {
			below += c;
		} else {
			above += c;
		}

		above = Math.pow(above, 2);
		below = Math.pow(below, 4);

		System.out.println("Квадрат положительных чисел равен " + above + "\n"
				+ "Четвертая степень отрицательных чисел равна " + below);
	}

	public static void task13() {
		// 13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
		// которая из точек находится ближе к началу координат.
		int x1 = -6;
		int y1 = 9;
		int x2 = 2;
		int y2 = -10;

		if ((Math.abs(x1) + Math.abs(y1)) == (Math.abs(x2) + Math.abs(y2))) {// ПО МОДУЛЮ
			System.out.println("Точки равноудалены");
		} else if ((Math.abs(x1) + Math.abs(y1)) < (Math.abs(x2) + Math.abs(y2))) { // ПО МОДУЛЮ
			System.out.println("Точка A ближе к началу координат");
		} else {
			System.out.println("Точка B ближе к началу координат");
		}
	}

	public static void task14() {
		// 14. Даны два угла треугольника (в градусах). Определить, существует ли такой
		// треугольник, и если да, то будет ли он прямоугольным.
		int angleA = 45;
		int angleB = 50;

		if ((180 - angleA - angleB) <= 0) {
			System.out.println("Такого треугольника не существует");
		} else if (angleA == 90 || angleB == 90 || (angleA + angleB) == 90) {
			System.out.println("Такой треугольник существует и он прямоугольный");
		} else {
			System.out.println("Такой треугольник существует");
		}
	}

	public static void task15() {
		// 15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих
		// двух чисел заменить половиной их суммы,
		// а большее — их удвоенным произведением.
		int x = 50;
		int y = 30;

		int halfSum = (x + y) / 2;
		int doubleMult = x * y * 2;

		if (x < y) {
			x = halfSum;
			y = doubleMult;
		} else {
			y = halfSum;
			x = doubleMult;
		}

		System.out.println("x = " + x + "\ny = " + y);
	}

	public static void task16() {
		// 16. На плоскости ХОY задана своими координатами точка А. Указать, где она
		// расположена (на какой оси или в каком координатном угле).
		int x = 1;
		int y = -1;

		if (x == 0 && y == 0) {
			System.out.println("Точка находится в начале координат.");
		} else if (x == 0) {
			System.out.println("Точка расположена на оси Y");
		} else if (y == 0) {
			System.out.println("Точка расположена на оси X");
		} else if (x > 0 && y > 0) {
			System.out.println("Точка расположена в I четверти");
		} else if (x < 0 && y > 0) {
			System.out.println("Точка расположена во II четверти");
		} else if (x < 0 && y < 0) {
			System.out.println("Точка расположена в III четверти");
		} else if (x > 0 && y < 0) {
			System.out.println("Точка расположена в IV четверти");
		}
	}

	public static void task17() {
		// 17. Даны целые числа т, п. Если числа не равны, то заменить каждое из них
		// одним и тем же числом, равным большему из исходных,
		// а если равны, то заменить числа нулями.
		int m = 4;
		int n = 6;

		if (m == n) {
			m = n = 0;
			System.out.println("m равно " + m + ", n равно " + n);
		}
		if (m != n) {
			if (m > n) {
				n = m;
				System.out.println("m и n равны " + m);
			} else if (m < n) {
				m = n;
				System.out.println("m и n равны " + n);
			}
		}
	}

	public static void task18() {
		// 18. Подсчитать количество отрицательных среди чисел а, b, с.
		int a = -1;
		int b = -1;
		int c = -6;
		int count = 0;

		if (a < 0) {
			count++;
		}
		if (b < 0) {
			count++;
		}
		if (c < 0) {
			count++;
			if (count == 0) {
				System.out.println("Отрицатнльных чисел нет");
			} else {

				System.out.println("Отрицательных чисел " + count);
			}
		}
	}

	public static void task19() {
		// 19. Подсчитать количество положительных среди чисел а, b, с.
		int a = 1;
		int b = 1;
		int c = -6;
		int count = 0;

		if (a > 0) {
			count++;
		}
		if (b > 0) {
			count++;
		}
		if (c > 0) {
			count++;
		}
		if (count == 0) {
			System.out.println("Положительных чисел нет");
		} else {
			System.out.println("Положительных чисел " + count);
		}
	}

	public static void task20() {
		// 20. Определить, делителем каких чисел а, b, с является число k.
		int a = 10;
		int b = 15;
		int c = 21;
		int k = 5;

		String s = "";

		if (a % k == 0) {
			String aa = String.valueOf(a);
			s += aa;
		}
		if (b % k == 0) {
			String bb = String.valueOf(b);
			s += " " + bb;
		}
		if (c % k == 0) {
			String cc = String.valueOf(c);
			s += " " + cc;
		}
		System.out.println("Число " + k + " является делителем чисел - " + s);
	}

	public static void task21() {
		// 21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
		// девочка? Введи Д или М».
		// В зависимости от ответа на экране должен появиться текст «Мне нравятся
		// девочки!» или «Мне нравятся мальчики!».
		System.out.println("Кто ты: мальчик или девочка? Введи М или Д");
		Scanner s = new Scanner(System.in);
		String gender = s.nextLine();
		s.close();

		if (gender.equals("М")) {
			System.out.println("Мне нравятся мальчики!");
		} else if (gender.equals("Д")) {
			System.out.println("Мне нравятся девочки!");
		}
	}

	public static void task22() {
		// 22. Перераспределить значения переменных х и у так, чтобы в х оказалось
		// большее из этих значений, а в y - меньшее.
		int x = 2;
		int y = 4;
		int temp;

		System.out.println("Было x = " + x + ", y = " + y);
		if (x < y) {
			temp = x;
			x = y;
			y = temp;
		}
		System.out.println("Стало x = " + x + ", y = " + y);
	}

	public static void task23() {
		// 23. Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
		// месяц — от 1 до 12). Если введены
		// некорректные данные, то сообщить об этом.
		Scanner s = new Scanner(System.in);
		System.out.println("Введите день");
		int d = s.nextInt();

		if (d <= 0 || d > 31) {
			System.out.println("неверный день");
			s.close();
			return;
		}
		System.out.println("Введите месяц");
		int m = s.nextInt();

		if (m < 1 || m > 12) {
			System.out.println("неверный месяц");
			s.close();
			return;
		}

		if (m == 2) {
			if (d > 28) {
				System.out.println("неверная дата");
				s.close();
			} else {
				System.out.println("вы ввели правильную дату");
				s.close();
			}
		}

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			if (d > 31) {
				System.out.println("неверная дата");
				s.close();
			} else {
				System.out.println("вы ввели правильную дату");
				s.close();
			}
		}
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			if (d > 30) {
				System.out.println("неверная дата");
				s.close();
			} else {
				System.out.println("вы ввели правильную дату");
				s.close();

			}
		}
	}

	public static void task24() {
		// 24. Составить программу, определяющую результат гадания на ромашке —
		// «любит—не любит», взяв за исходное данное количество лепестков п.
		int quantity = 16;

		if (quantity % 2 == 1) {
			System.out.println("Любит");
		} else {
			System.out.println("Не любит");
		}
	}

	public static void task25() {
		// 25. Написать программу — модель анализа пожарного датчика в помещении,
		// которая выводит сообщение «Пожароопасная ситуация »,
		// если температура в комнате превысила 60° С.
		int temp = 61;
		if (temp > 60) {
			System.out.println("Пожароопасная ситуация");
		}
	}

	public static void task26() {
		// 26. Написать программу нахождения суммы большего и меньшего из трех чисел.
		int a = 10;
		int b = 15;
		int c = 13;
		int min = 0;
		int max = 0;
		int sum;

		if (a < b) {
			max = b;
			min = a;
		} else {
			max = a;
			min = b;
		}
		if (max < c) {
			max = c;
		}
		if (min > c) {
			min = c;
		}
		sum = min + max;
		System.out.println(
				"Даны числа - " + a + ", " + b + ", " + c + ". Сумма минимального и максимального равна " + sum);
	}

	public static void task27() {
		// 27. Найти max{min(a, b), min(c, d)}.
		int a = 2;
		int b = 4;
		int c = 6;
		int d = 8;
		int min1;
		int min2;
		int max;

		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}
		if (min1 > min2) {
			max = min1;
		} else {
			max = min2;
		}
		System.out.println("Максимальное число равно " + max);
	}

	public static void task28() {
		// 28. Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
		// равно d, то найти max(d — a, d — b, d — c).
		int a = 5;
		int b = 15;
		int c = 20;
		int d = 10;

		if (a == d) {
			System.out.println("a = d = " + d);
		}
		if (b == d) {
			System.out.println("b = d = " + d);
		}
		if (c == d) {
			System.out.println("c = d = " + d);
		}

		int max = d - a;
		if (max < (d - b)) {
			max = d - b;
		}
		if (max < (d - c)) {
			max = d - c;
		}

		if (a != d && b != d && c != d) {
			System.out.println("Максимальное значение разностей " + max);
		}

	}

	public static void task29() {
		// 29. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
		// расположены на одной прямой.
		int x1 = 2;
		int y1 = 4;
		int x2 = 1;
		int y2 = 4;
		int x3 = 1;
		int y3 = -4;

		if (((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) == 0) {
			System.out.println("29) Точки лежат на одной прямой");
		} else {
			System.out.println("29) Точки не лежат на одной прямой");
		}
	}

	public static void task30() {
		// 30. Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и
		// заменить их абсолютными значениями, если это не так.
		int a = 6;
		int b = 4;
		int c = 2;

		if (a > b && b > c) {
			a *= 2;
			b *= 2;
			c *= 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}
		System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
	}

	public static void task31() {
		// 31. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		// Определить, пройдет ли кирпич через отверстие.
		int a = 5;
		int b = 6;

		int x = 3;
		int y = 6;
		int z = 2;

		if (a >= x && b >= y || a >= y && b >= x) {
			System.out.println("Кирпич пройдет");
		} else if (a >= x && b >= z || a >= z && b >= x) {
			System.out.println("Кирпич пройдет");
		} else if (a >= y && b >= z || a >= z && b >= y) {
			System.out.println("Кирпич пройдет");
		} else {
			System.out.println("Кирпич НЕ пройдет");
		}
	}

	public static void task32() {
		// 32. Написать программу, которая по заданным трем числам определяет, является
		// ли сумма каких-либо двух из них положительной.
		int a = -5;
		int b = -4;
		int c = -8;

		if ((a + b) > 0) {
			System.out.println("Сумма чисел a и b положительная");
		}
		if ((a + c) > 0) {
			System.out.println("Сумма чисел a и c положительная");
		}
		if ((b + c) > 0) {
			System.out.println("Сумма чисел b и c положительная");
		} else {
			System.out.println("Сумма любых двух чисел отрицательная");
		}
	}

	public static void task33() {
		// 33. Написать программу, которая по паролю будет определять уровень доступа
		// сотрудника к секретной информации в
		// базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы
		// по степени доступа. Они имеют
		// следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 —
		// доступны модули баз В, С; 9455, 8997 —
		// доступен модуль базы С.

		int pas = 9583;

		if (pas == 9583 || pas == 1747) {
			System.out.println("Доступны модули баз А, В, С");
		} else if (pas == 3331 || pas == 7922) {
			System.out.println("Доступны модули баз В, С");
		} else if (pas == 9455 || pas == 8997) {
			System.out.println("Доступны модуль базы С");
		}
	}

	public static void task34() {
		// 34. Составить программу, реализующую эпизод применения компьютера в книжном
		// магазине. Компьютер
		// запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не
		// требуется, печатает на экране
		// «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите
		// сдачу» и указывает сумму сдачи; если
		// денег недостаточно, то печатает сообщение об этом и указывает размер
		// недостающей суммы.
		int price = 50;
		int pay = 40;
		int change;

		change = Math.abs(pay - price);

		if (change == 0) {
			System.out.println("Спасибо");
		} else if (change > 0) {
			System.out.println("Возьмите сдачу " + change + " руб.");
		} else if (change < 0) {
			System.out.println("Недостаточно денег, доплатите " + change + " руб.");
		}
	}

	public static void task35() {
		// 35. Вычислить число и месяц в невисокосном году по номеру дня.
		int a = 360;

		System.out.print(a + "-й день в високосном году - это ");
		if (a <= 31) {
			System.out.println(a + " января");
		} else if (a <= 59) {
			a -= 31;
			System.out.println(a + " февраля");
		} else if (a <= 90) {
			a -= 59;
			System.out.println(a + " марта");
		} else if (a <= 120) {
			a -= 90;
			System.out.println(a + " апреля");
		} else if (a <= 151) {
			a -= 120;
			System.out.println(a + " мая");
		} else if (a <= 181) {
			a -= 151;
			System.out.println(a + " июня");
		} else if (a <= 212) {
			a -= 181;
			System.out.println(a + " июля");
		} else if (a <= 243) {
			a -= 212;
			System.out.println(a + " августа");
		} else if (a <= 273) {
			a -= 243;
			System.out.println(a + " сентября");
		} else if (a <= 304) {
			a -= 273;
			System.out.println(a + " октября");
		} else if (a <= 334) {
			a -= 304;
			System.out.println(a + " ноября");
		} else if (a <= 365) {
			a -= 334;
			System.out.println(a + " декабря");
		} else {
			System.out.println("А год-то високосный");
		}
	}

	public static void task36() {
		// 36. Вычислить значение функции
		double x = 4;
		double f;

		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
			System.out.printf("При х <= 3 значение функции равно %.3f%n", f);
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
			System.out.printf("При х > 3 значение функции равно %.3f%n", f);
		}
	}

	public static void task37() {
		// 37. Вычислить значение функции
		double x = 4;
		double f;

		if (x >= 3) {
			f = Math.pow(-x, 2) + 3 * x + 9;
			System.out.printf("При х >= 3 значение функции равно %.3f%n", f);
		} else {
			f = 1 / (Math.pow(x, 3) - 6);
			System.out.printf("При х < 3 значение функции равно %.3f%n", f);
		}
	}

	public static void task38() {
		// 38. Вычислить значение функции
		double x = 6;
		double f;

		if (x >= 0 && x <= 3) {
			f = Math.pow(x, 2);
			System.out.printf("При 0 <= х <= 3 значение функции равно %.3f%n", f);
		} else {
			f = 4;
			System.out.printf("При х > 3 или x < 0 значение функции равно %.3f%n", f);
		}
	}

	public static void task39() {
		// 38. Вычислить значение функции
		double x = 6;
		double f;

		if (x >= 8) {
			f = Math.pow(-x, 2) + x - 9;
			System.out.printf("При х >= 8 значение функции равно %.3f%n", f);
		} else {
			f = 1 / (Math.pow(x, 4) - 6);
			System.out.printf("При х < 8 значение функции равно %.3f%n", f);
		}
	}

	public static void task40() {
		// 38. Вычислить значение функции
		double x = 6;
		double f;

		if (x <= 13) {
			f = Math.pow(-x, 3) + 9;
			System.out.printf("При х <= 13 значение функции равно %.3f%n", f);
		} else {
			f = -(3 / (x + 1));
			System.out.printf("При х > 13 значение функции равно %.3f%n", f);
		}
	}
}
