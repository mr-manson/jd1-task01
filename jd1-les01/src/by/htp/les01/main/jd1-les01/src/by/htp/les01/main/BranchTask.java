package by.htp.les01.main;

import java.util.Scanner;

public class BranchTask {

	public static void task01() {
		// 01. ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � �������
		// �� ����� ����� 7, � ��������� ������ � ����� 8.
		int a = 2;
		int b = 3;

		if (a < b) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}
	}

	public static void task02() {
		// 02. ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � �������
		// �� ����� ����� �yes�,
		// � ��������� ������ � ����� �no�
		int a = 4;
		int b = 3;

		if (a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static void task03() {
		// 03. ��������� ��������� ��������� ���������� ����� � � ����� 3. ������� ��
		// ����� ����� �yes�, ���� ����� � ������ 3;
		// ���� ������, �� ������� ����� �no�.
		int a = 1;

		if (a < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

	public static void task04() {
		// 04. ��������� ���������: ����� �� ��� ����� � � b?
		int a = 1;
		int b = 1;

		if (a == b) {
			System.out.println("����� a � b �����");
		} else {
			System.out.println("����� a � b �� �����");
		}
	}

	public static void task05() {
		// 05. ��������� ���������: ����������� ����������� �� ���� ����� � � b.
		int a = 5;
		int b = 2;

		if (a < b) {
			System.out.println("�� ����� " + a + " � " + b + " ���������� " + a);
		} else {
			System.out.println("�� ����� " + a + " � " + b + " ���������� " + b);
		}
	}

	public static void task06() {
		// 06. ��������� ���������: ����������� ����������� �� ���� ����� � � b.
		int a = 5;
		int b = 9;

		if (a > b) {
			System.out.println("�� ����� " + a + " � " + b + " ���������� " + a);
		} else {
			System.out.println("�� ����� " + a + " � " + b + " ���������� " + b);
		}
	}

	public static void task07() {
		// 07. ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ���
		// �������� ��������� a, b, c � �
		int a = 2;
		int b = -6;
		int c = -8;
		int x = 3;
		int y;

		y = a * x * x + b * x + c;

		if (y < 0) {
			System.out.println("������ ��������� ����� " + -y);
		} else if (y > 0) {
			System.out.println("������ ��������� ����� " + y);
		}
	}

	public static void task08() {
		// 08. ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.
		int a = 5;
		int b = 7;

		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);

		if (a2 < b2) {
			System.out.println("�� ��������� ����� " + a + " (" + (int) a2 + ") � " + b + " (" + (int) b2
					+ ") ���������� " + (int) a2);
		} else {
			System.out.println("�� ��������� ����� " + a + " (" + (int) a2 + ") � " + b + " (" + (int) b2
					+ ") ���������� " + (int) b2);
		}
	}

	public static void task09() {
		// 09. ��������� ���������, ������� ��������� �� ���� ��������� ��������,
		// �������� �� ������ ����������� ��������������.
		int a = 5;
		int b = 5;
		int c = 5;

		if (a == b && b == c && a == c) {
			System.out.println("����������� ��������������");
		} else {
			System.out.println("����������� �� ��������������");
		}
	}

	public static void task10() {
		// 10. ��������� ���������, ������� ��������� ������� ������ ����� ������.
		int circleA = 20;
		int circleB = 15;

		if (circleA < circleB) {
			System.out.println("�� ���� ������ ������� ������� � ����� �");
		} else {
			System.out.println("�� ���� ������ ������� ������� � ����� B");
		}
	}

	public static void task11() {
		// 11. ��������� ���������, ������� ��������� ������� ������ ������������
		// ������.
		int triangleA = 20;
		int triangleB = 15;

		if (triangleA > triangleB) {
			System.out.println("�� ���� ������������� ������� ������� � ������������ �");
		} else {
			System.out.println("�� ���� ������������� ������� ������� � ������������ B");
		}
	}

	public static void task12() {
		// 12. ���� ��� �������������� �����. �������� � ������� �� �� ���, ��������
		// ������� ��������������, � � ��������� ������� � �������������.
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

		System.out.println("������� ������������� ����� ����� " + above + "\n"
				+ "��������� ������� ������������� ����� ����� " + below);
	}

	public static void task13() {
		// 13. ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������,
		// ������� �� ����� ��������� ����� � ������ ���������.
		int x1 = -6;
		int y1 = 9;
		int x2 = 2;
		int y2 = -10;

		if ((Math.abs(x1) + Math.abs(y1)) == (Math.abs(x2) + Math.abs(y2))) {// �� ������
			System.out.println("����� ������������");
		} else if ((Math.abs(x1) + Math.abs(y1)) < (Math.abs(x2) + Math.abs(y2))) { // �� ������
			System.out.println("����� A ����� � ������ ���������");
		} else {
			System.out.println("����� B ����� � ������ ���������");
		}
	}

	public static void task14() {
		// 14. ���� ��� ���� ������������ (� ��������). ����������, ���������� �� �����
		// �����������, � ���� ��, �� ����� �� �� �������������.
		int angleA = 45;
		int angleB = 50;

		if ((180 - angleA - angleB) <= 0) {
			System.out.println("������ ������������ �� ����������");
		} else if (angleA == 90 || angleB == 90 || (angleA + angleB) == 90) {
			System.out.println("����� ����������� ���������� � �� �������������");
		} else {
			System.out.println("����� ����������� ����������");
		}
	}

	public static void task15() {
		// 15. ���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ����
		// ���� ����� �������� ��������� �� �����,
		// � ������� � �� ��������� �������������.
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
		// 16. �� ��������� ��Y ������ ������ ������������ ����� �. �������, ��� ���
		// ����������� (�� ����� ��� ��� � ����� ������������ ����).
		int x = 1;
		int y = -1;

		if (x == 0 && y == 0) {
			System.out.println("����� ��������� � ������ ���������.");
		} else if (x == 0) {
			System.out.println("����� ����������� �� ��� Y");
		} else if (y == 0) {
			System.out.println("����� ����������� �� ��� X");
		} else if (x > 0 && y > 0) {
			System.out.println("����� ����������� � I ��������");
		} else if (x < 0 && y > 0) {
			System.out.println("����� ����������� �� II ��������");
		} else if (x < 0 && y < 0) {
			System.out.println("����� ����������� � III ��������");
		} else if (x > 0 && y < 0) {
			System.out.println("����� ����������� � IV ��������");
		}
	}

	public static void task17() {
		// 17. ���� ����� ����� �, �. ���� ����� �� �����, �� �������� ������ �� ���
		// ����� � ��� �� ������, ������ �������� �� ��������,
		// � ���� �����, �� �������� ����� ������.
		int m = 4;
		int n = 6;

		if (m == n) {
			m = n = 0;
			System.out.println("m ����� " + m + ", n ����� " + n);
		}
		if (m != n) {
			if (m > n) {
				n = m;
				System.out.println("m � n ����� " + m);
			} else if (m < n) {
				m = n;
				System.out.println("m � n ����� " + n);
			}
		}
	}

	public static void task18() {
		// 18. ���������� ���������� ������������� ����� ����� �, b, �.
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
				System.out.println("������������� ����� ���");
			} else {

				System.out.println("������������� ����� " + count);
			}
		}
	}

	public static void task19() {
		// 19. ���������� ���������� ������������� ����� ����� �, b, �.
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
			System.out.println("������������� ����� ���");
		} else {
			System.out.println("������������� ����� " + count);
		}
	}

	public static void task20() {
		// 20. ����������, ��������� ����� ����� �, b, � �������� ����� k.
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
		System.out.println("����� " + k + " �������� ��������� ����� - " + s);
	}

	public static void task21() {
		// 21. ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ���
		// �������? ����� � ��� ̻.
		// � ����������� �� ������ �� ������ ������ ��������� ����� ���� ��������
		// �������!� ��� ���� �������� ��������!�.
		System.out.println("��� ��: ������� ��� �������? ����� � ��� �");
		Scanner s = new Scanner(System.in);
		String gender = s.nextLine();
		s.close();

		if (gender.equals("�")) {
			System.out.println("��� �������� ��������!");
		} else if (gender.equals("�")) {
			System.out.println("��� �������� �������!");
		}
	}

	public static void task22() {
		// 22. ���������������� �������� ���������� � � � ���, ����� � � ���������
		// ������� �� ���� ��������, � � y - �������.
		int x = 2;
		int y = 4;
		int temp;

		System.out.println("���� x = " + x + ", y = " + y);
		if (x < y) {
			temp = x;
			x = y;
			y = temp;
		}
		System.out.println("����� x = " + x + ", y = " + y);
	}

	public static void task23() {
		// 23. ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31,
		// ����� � �� 1 �� 12). ���� �������
		// ������������ ������, �� �������� �� ����.
		Scanner s = new Scanner(System.in);
		System.out.println("������� ����");
		int d = s.nextInt();

		if (d <= 0 || d > 31) {
			System.out.println("�������� ����");
			s.close();
			return;
		}
		System.out.println("������� �����");
		int m = s.nextInt();

		if (m < 1 || m > 12) {
			System.out.println("�������� �����");
			s.close();
			return;
		}

		if (m == 2) {
			if (d > 28) {
				System.out.println("�������� ����");
				s.close();
			} else {
				System.out.println("�� ����� ���������� ����");
				s.close();
			}
		}

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			if (d > 31) {
				System.out.println("�������� ����");
				s.close();
			} else {
				System.out.println("�� ����� ���������� ����");
				s.close();
			}
		}
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			if (d > 30) {
				System.out.println("�������� ����");
				s.close();
			} else {
				System.out.println("�� ����� ���������� ����");
				s.close();

			}
		}
	}

	public static void task24() {
		// 24. ��������� ���������, ������������ ��������� ������� �� ������� �
		// �������� �����, ���� �� �������� ������ ���������� ��������� �.
		int quantity = 16;

		if (quantity % 2 == 1) {
			System.out.println("�����");
		} else {
			System.out.println("�� �����");
		}
	}

	public static void task25() {
		// 25. �������� ��������� � ������ ������� ��������� ������� � ���������,
		// ������� ������� ��������� �������������� �������� �,
		// ���� ����������� � ������� ��������� 60� �.
		int temp = 61;
		if (temp > 60) {
			System.out.println("������������� ��������");
		}
	}

	public static void task26() {
		// 26. �������� ��������� ���������� ����� �������� � �������� �� ���� �����.
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
				"���� ����� - " + a + ", " + b + ", " + c + ". ����� ������������ � ������������� ����� " + sum);
	}

	public static void task27() {
		// 27. ����� max{min(a, b), min(c, d)}.
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
		System.out.println("������������ ����� ����� " + max);
	}

	public static void task28() {
		// 28. ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� ��
		// ����� d, �� ����� max(d � a, d � b, d � c).
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
			System.out.println("������������ �������� ��������� " + max);
		}

	}

	public static void task29() {
		// 29. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ���
		// ����������� �� ����� ������.
		int x1 = 2;
		int y1 = 4;
		int x2 = 1;
		int y2 = 4;
		int x3 = 1;
		int y3 = -4;

		if (((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) == 0) {
			System.out.println("29) ����� ����� �� ����� ������");
		} else {
			System.out.println("29) ����� �� ����� �� ����� ������");
		}
	}

	public static void task30() {
		// 30. ���� �������������� ����� �,b,�. ������� ��� �����, ���� � > b > �, �
		// �������� �� ����������� ����������, ���� ��� �� ���.
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
		// 31. ������ ������� �, � �������������� ��������� � ������� �, �, z �������.
		// ����������, ������� �� ������ ����� ���������.
		int a = 5;
		int b = 6;

		int x = 3;
		int y = 6;
		int z = 2;

		if (a >= x && b >= y || a >= y && b >= x) {
			System.out.println("������ �������");
		} else if (a >= x && b >= z || a >= z && b >= x) {
			System.out.println("������ �������");
		} else if (a >= y && b >= z || a >= z && b >= y) {
			System.out.println("������ �������");
		} else {
			System.out.println("������ �� �������");
		}
	}

	public static void task32() {
		// 32. �������� ���������, ������� �� �������� ���� ������ ����������, ��������
		// �� ����� �����-���� ���� �� ��� �������������.
		int a = -5;
		int b = -4;
		int c = -8;

		if ((a + b) > 0) {
			System.out.println("����� ����� a � b �������������");
		}
		if ((a + c) > 0) {
			System.out.println("����� ����� a � c �������������");
		}
		if ((b + c) > 0) {
			System.out.println("����� ����� b � c �������������");
		} else {
			System.out.println("����� ����� ���� ����� �������������");
		}
	}

	public static void task33() {
		// 33. �������� ���������, ������� �� ������ ����� ���������� ������� �������
		// ���������� � ��������� ���������� �
		// ���� ������. ������ � ���� ����� ������ ����� �������, �������� �� ��� ������
		// �� ������� �������. ��� �����
		// ��������� ������: 9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 �
		// �������� ������ ��� �, �; 9455, 8997 �
		// �������� ������ ���� �.

		int pas = 9583;

		if (pas == 9583 || pas == 1747) {
			System.out.println("�������� ������ ��� �, �, �");
		} else if (pas == 3331 || pas == 7922) {
			System.out.println("�������� ������ ��� �, �");
		} else if (pas == 9455 || pas == 8997) {
			System.out.println("�������� ������ ���� �");
		}
	}

	public static void task34() {
		// 34. ��������� ���������, ����������� ������ ���������� ���������� � �������
		// ��������. ���������
		// ����������� ��������� ����, ����� �����, ��������� �����������; ���� ����� ��
		// ���������, �������� �� ������
		// ��������; ���� ����� ������� ������, ��� ����������, �� �������� ���������
		// ����� � ��������� ����� �����; ����
		// ����� ������������, �� �������� ��������� �� ���� � ��������� ������
		// ����������� �����.
		int price = 50;
		int pay = 40;
		int change;

		change = Math.abs(pay - price);

		if (change == 0) {
			System.out.println("�������");
		} else if (change > 0) {
			System.out.println("�������� ����� " + change + " ���.");
		} else if (change < 0) {
			System.out.println("������������ �����, ��������� " + change + " ���.");
		}
	}

	public static void task35() {
		// 35. ��������� ����� � ����� � ������������ ���� �� ������ ���.
		int a = 360;

		System.out.print(a + "-� ���� � ���������� ���� - ��� ");
		if (a <= 31) {
			System.out.println(a + " ������");
		} else if (a <= 59) {
			a -= 31;
			System.out.println(a + " �������");
		} else if (a <= 90) {
			a -= 59;
			System.out.println(a + " �����");
		} else if (a <= 120) {
			a -= 90;
			System.out.println(a + " ������");
		} else if (a <= 151) {
			a -= 120;
			System.out.println(a + " ���");
		} else if (a <= 181) {
			a -= 151;
			System.out.println(a + " ����");
		} else if (a <= 212) {
			a -= 181;
			System.out.println(a + " ����");
		} else if (a <= 243) {
			a -= 212;
			System.out.println(a + " �������");
		} else if (a <= 273) {
			a -= 243;
			System.out.println(a + " ��������");
		} else if (a <= 304) {
			a -= 273;
			System.out.println(a + " �������");
		} else if (a <= 334) {
			a -= 304;
			System.out.println(a + " ������");
		} else if (a <= 365) {
			a -= 334;
			System.out.println(a + " �������");
		} else {
			System.out.println("� ���-�� ����������");
		}
	}

	public static void task36() {
		// 36. ��������� �������� �������
		double x = 4;
		double f;

		if (x <= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
			System.out.printf("��� � <= 3 �������� ������� ����� %.3f%n", f);
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
			System.out.printf("��� � > 3 �������� ������� ����� %.3f%n", f);
		}
	}

	public static void task37() {
		// 37. ��������� �������� �������
		double x = 4;
		double f;

		if (x >= 3) {
			f = Math.pow(-x, 2) + 3 * x + 9;
			System.out.printf("��� � >= 3 �������� ������� ����� %.3f%n", f);
		} else {
			f = 1 / (Math.pow(x, 3) - 6);
			System.out.printf("��� � < 3 �������� ������� ����� %.3f%n", f);
		}
	}

	public static void task38() {
		// 38. ��������� �������� �������
		double x = 6;
		double f;

		if (x >= 0 && x <= 3) {
			f = Math.pow(x, 2);
			System.out.printf("��� 0 <= � <= 3 �������� ������� ����� %.3f%n", f);
		} else {
			f = 4;
			System.out.printf("��� � > 3 ��� x < 0 �������� ������� ����� %.3f%n", f);
		}
	}

	public static void task39() {
		// 38. ��������� �������� �������
		double x = 6;
		double f;

		if (x >= 8) {
			f = Math.pow(-x, 2) + x - 9;
			System.out.printf("��� � >= 8 �������� ������� ����� %.3f%n", f);
		} else {
			f = 1 / (Math.pow(x, 4) - 6);
			System.out.printf("��� � < 8 �������� ������� ����� %.3f%n", f);
		}
	}

	public static void task40() {
		// 38. ��������� �������� �������
		double x = 6;
		double f;

		if (x <= 13) {
			f = Math.pow(-x, 3) + 9;
			System.out.printf("��� � <= 13 �������� ������� ����� %.3f%n", f);
		} else {
			f = -(3 / (x + 1));
			System.out.printf("��� � > 13 �������� ������� ����� %.3f%n", f);
		}
	}
}
