package by.htp.les01.main;

public class BranchTask {

	public static void task01() {
		// 01. ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � ������� �� ����� ����� 7, � ��������� ������ � ����� 8.
		int a = 2;
		int b = 3;
		if (a < b) {
			System.out.println(7);
		}else {
			System.out.println(8);
		}
	}
	
	public static void task02() {
		// 02. ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 � ������� �� ����� ����� �yes�,
		// � ��������� ������ � ����� �no�
		int a = 4;
		int b = 3;
		if (a < b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

	public static void task03() {
		// 03. ��������� ��������� ��������� ���������� ����� � � ����� 3. ������� �� ����� ����� �yes�, ���� ����� � ������ 3;
		// ���� ������, �� ������� ����� �no�.
		int a = 1;
		if (a < 3) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
	
	public static void task04() {
		// 04. ��������� ���������: ����� �� ��� ����� � � b?
		int a = 1;
		int b = 1;
		if (a == b) {
			System.out.println("����� a � b �����");
		}else {
			System.out.println("����� a � b �� �����");
		}
	}
	
	public static void task05() {
		// 05. ��������� ���������: ����������� ����������� �� ���� ����� � � b.
		int a = 5;
		int b = 2;
		if (a < b) {
			System.out.println("�� ����� " + a + " � " + b + " ���������� " + a);
		}else {
			System.out.println("�� ����� " + a + " � " + b + " ���������� " + b);
		}
	}
	
	public static void task06() {
		// 06. ��������� ���������: ����������� ����������� �� ���� ����� � � b.
		int a = 5;
		int b = 9;
		if (a > b) {
			System.out.println("�� ����� " + a + " � " + b + " ���������� " + a);
		}else {
			System.out.println("�� ����� " + a + " � " + b + " ���������� " + b);
		}
	}
		
	public static void task07() {
		// 07. ��������� ��������� ���������� ������ ��������� a*x*x + b*x + c ��� �������� ��������� a, b, c � �
		//
	}
	
	public static void task08() {
		// 08. ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.
		int a = 5;
		int b = 7;
		double a2 = Math.pow(a, 2);
		double b2 = Math.pow(b, 2);
		if (a2 < b2) {
			System.out.println("�� ��������� ����� " + a + " (" + (int) a2 + ") � " + b + " (" + (int) b2 + ") ���������� " + (int) a2);
		}else {
			System.out.println("�� ��������� ����� " + a + " (" + (int) a2 + ") � " + b + " (" + (int) b2 + ") ���������� " + (int) b2);
		}
	}
	
	public static void task09() {
		// 09. ��������� ���������, ������� ��������� �� ���� ��������� ��������, �������� �� ������ ����������� ��������������.
		int a = 5;
		int b = 5;
		int c = 5;
		if (a == b && b == c && a == c) {
			System.out.println("����������� ��������������");
		}else {
			System.out.println("����������� �� ��������������");
		}
	}
	
	public static void task10() {
		// 10. ��������� ���������, ������� ��������� ������� ������ ����� ������.
		int roundA = 20;
		int roundB = 15;
		if (roundA < roundB) {
			System.out.println("�� ���� ������ ������� ������� � ����� �");
		} else {
			System.out.println("�� ���� ������ ������� ������� � ����� B");
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
