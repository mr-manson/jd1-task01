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
		// �����. � ���������
		// ��������� ��� ����� �� 1 �� ���������� ������������� �����.
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
		
	}
}
