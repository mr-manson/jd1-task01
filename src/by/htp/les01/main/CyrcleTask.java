package by.htp.les01.main;

import java.util.Scanner;

public class CyrcleTask {

	public static void task01() {
		// 1. ���������� ������� �� ����� ����� �� 1 �� 5.
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
	}

	public static void task02() {
		// 2. ���������� ������� �� ����� ����� �� 5 �� 1.
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
	}

	public static void task03() {
		// 3. ���������� ������� �� ����� ������� ��������� �� 3:
		int a;

		for (int i = 1; i <= 9; i++) {
			a = i * 3;
			System.out.print(i + " * 3 = " + a);
		}
	}

	public static void task04() {
		// 4. � ������� ��������� while �������� ��������� ������ ���� ������ ����� �
		// ��������� �� 2 �� 100 ������������.
		int a = 0;

		while (a <= 100) {
			a++;
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}
	}

	public static void task05() {
		// 5. � ������� ��������� while �������� ��������� ����������� ����� ����
		// �������� ����� � ��������� �� 1 �� 99 ������������.
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
		// 6. �������� ���������, ��� ������������ ������ ����� ����� �������������
		// �����. � ��������� ��������� ��� ����� �� 1 �� ���������� �������������
		// �����.
		int a;
		int b = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("������� ����� ������������� �����");
		a = s.nextInt();
		s.close();
		int sum = 0;
		while (b < a) {
			b++;
			sum += b;
		}
		System.out.println("����� ���� ����� �� ���� �� " + a + " ����� " + sum);
	}

	public static void task07() {
		// 7. ��������� �������� ������� �� ������� [�,b] c ����� h:
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
		// 8. ��������� �������� ������� �� ������� [�,b] c ����� h:
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
		// 9. ����� ����� ��������� ������ ��� �����.
		int a = 100;
		int sum = 0;

		for (int i = 0; i <= a; i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println("����� ��������� ������ " + a + " ����� ����� " + sum);
	}

	public static void task10() {
		// 10. ��������� ��������� ���������� ������������ ��������� ������ �������
		// �����.
		long a = 200L;
		long sum = 0L;

		for (int i = 0; i <= a; i++) {
			sum *= Math.pow(i, 2);
		}
		if (sum <= 0) {
			System.out.println("������������!!!");
		} else {
			System.out.println("������������ ��������� ������ " + a + " ����� ����� " + sum);
		}
	}

	public static void task11() {
		// 11. ��������� ��������� ���������� �������� ����� ������ ������� �����
		int sub = 1;

		for (int i = 2; i <= 200; i++) {
			sub -= Math.pow(i, 3);
		}
		System.out.println(sub);
	}

	public static void task12() {
		// 12. ������������������ �n �������� ���: �1 = 1, an =6+ �n-1 , ��� ������� n
		// >1 ��������� ���������
		// ���������� ������������ ������ 10 ������ ���� ������������������.
		int a = 1;
		long y = 1L;

		for (int i = 2; i <= 10; i++) {
			a += 6;
			y *= a;
		}
		System.out.println(y);
	}

	public static void task13() {
		// 13. ��������� ������� �������� ������� y = 5 - x2/2 �� ������� [-5; 5] �
		// ����� 0.5.
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
		// 14. ���� ����������� n. ���������: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
		double n = 10;
		double sum = 0;

		for (double i = 1; i <= n; i++) {
			sum += 1 / i;
		}
		System.out.println("����� ����� " + sum);
	}

	public static void task15() {
		// 15. ��������� : 1+2+4+8+...+ 2 � 10 �������.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += Math.pow(2, i);
		}
		System.out.println("����� ����� " + sum);
	}

	public static void task16() {
		// 16. ���������: (1+2)*(1+2+3)*...*(1+2+...+10).
		int sum = 1;
		long mult = 1;

		for (int i = 2; i <= 10; i++) {
			sum += i;
			mult *= sum;
		}
		System.out.println(mult);
	}

	public static void task17() {
		// 17. ���� �������������� (�) � ����������� (n). ���������: a(a+1)...(a+n-1)
		double a = 1;
		int n = 5;

		for (int i = 1; i < n; i++) {
			a *= (a + i);
		}
		System.out.println(a);
	}

	public static void task18() {
		// 18. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����,
		// ������ ������� ������ ���
		// ����� ��������� �.
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
		System.out.println("����� ������� ����� " + sum);
	}

	public static void task19() {
		// 19. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����,
		// ������ ������� ������ ���
		// ����� ��������� �.
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
		System.out.println("����� ������� ����� " + sum);
	}

	public static void task20() {
		// 20. ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����,
		// ������ ������� ������ ���
		// ����� ��������� �.
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
		System.out.println("����� ������� ����� " + sum);
	}

	public static void task21() {
		// 21. ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�,
		// b] � ����� h. ��������� �����������
		// � ���� �������, ������ ������� ������� � �������� ���������, ������ -
		// ��������������� �������� �������:
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
		// 22. ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�,
		// b] � ����� h. ��������� �����������
		// � ���� �������, ������ ������� ������� � �������� ���������, ������ -
		// ��������������� �������� �������:
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
		// 23. ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�,
		// b] � ����� h. ��������� �����������
		// � ���� �������, ������ ������� ������� � �������� ���������, ������ -
		// ��������������� �������� �������:
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
		// 24. �������� ����������� �����. ����� ����� ������ ����, �������� � ���
		// ������. ������������� ��� � ������ �����, ����� �������� ����� ���������
		// � �������� ������� �� ��������� � ��������� ������.

	}

	public static void task25() {
		// 25. ��������� ���������� ��������� �����, ������� ���� ������������.
		int a = 10;
		int b = 1;
		int c = 1;
		for (int i = 1; i <= a; i++) {
			b *= c;
			c++;
		}
		System.out.println("��������� ����� " + a + " ����� " + b);
	}

	public static void task26() {
		// 26. ������� �� ����� ������������ ����� ��������� � �� ����������
		// ������������� � ������ ���������� (������� ASCII).
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
		// 27. ��� ������� ������������ ����� � ���������� �� m �� n ������� ���
		// ��������, ����� ������� �
		// ������ �����. m � n �������� � ����������.
		int m = 10;
		int n = 15;
		// int count = 0;

		for (int i = m; i <= n; i++) {
			System.out.print("�������� ����� " + i + " - ");
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					System.out.print(j + "  ");
				}
			}
			if (count == 0) {
				System.out.print("��������� ���");
			}
			System.out.println("");
		}
	}

	public static void task28() {
		// 282. �������� ���������, � ������� �������� ��� �������� � � Y � ����
		// �������� (+, �, /, *). ���������
		// ��������� Z � ����������� �� �����. ������������� ������� �� ���������
		// �������� ���� ��������, �
		// ����� �� ���� Y=0 ��� �������. ������������ ����������� ������������
		// ���������� ���
		// ������������ ��������� (�.�. ��������� ����). � �������� ������� �����������
		// ���������� ������� �0�.
		int a;
		int b;
		int rez = 0;
		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("������� ������ �����");
			a = sc.nextInt();
			System.out.println("������� ������ �����");
			b = sc.nextInt();
			System.out.println("������� ���� �������� (+ - / *)");
			char c = sc.next().charAt(0);
			// sc.close();
			if (c == '*') {
				rez = a * b;
			} else if (c == '/') {
				if (b == 0) {
					System.out.println("������� �� ����!");
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
		// 29. ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� �
		// ������� �����.

	}

	public static void task39() {
		// 39. � ����������� ����� ���������� ������� �����. ����� ���������� �����
		// �������� �� 7, ��
		// �������� �������� �����. ����� ��� �����.
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
