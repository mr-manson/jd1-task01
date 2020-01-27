package by.htp.les01.main;

public class LinearTask {

	public static void task01() {
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
		double a = 5;
		double c = 3 + a;
		System.out.println("�������� ������� � - " + c);
	}

	public static void task03() {
		double x = 1;
		double y = 2;
		double z = 2 * x + (y - 2) * 5;
		System.out.println("�������� ������� z - " + z);
	}

	public static void task04() {
		double a = 1;
		double b = 2;
		double c = 3;
		double z = ((a - 3) * b / 2) + c;
		System.out.println("�������� ������� z - " + z);
	}

	public static void task05() {
		double a = 5;
		double b = 6;
		double average = (a + b) / 2;
		System.out.println("������� �������������� ����� " + a + " � " + b + " = " + average);
	}

	public static void task06() {
		int bidon1, volum1, litr1;
		int bidon2, volum2, litr2;
		bidon1 = 10; // ���������� ��������� �������
		litr1 = 80; // ����� ������ ��������� �������
		volum1 = litr1 / bidon1; // ����� ���������� ������

		volum2 = volum1 + 12; // ����� �������� ������
		bidon2 = 15; // ���������� ������� �������
		litr2 = volum2 * bidon2; // ����� ������ ������� �������

		System.out.println("� " + bidon2 + " ������� ������� " + litr2 + " ������ ������");
	}

	public static void task07() {
		double length = 6;
		double width = length / 2;
		double area = length * width;
		System.out.println("������� �������������� - " + area);
	}

	public static void task08() {
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
		System.out.println("�������� ��������� - " + rez);
	}

	public static void task09() {
		double a = 2;
		double b = 3;
		double c = 4;
		double d = 5;
		double rez = a / c * b / d;
		rez = rez - ((a * b - c) / (c * d));
		System.out.println("�������� ��������� - " + rez);
	}

	public static void task10() {
		double x = 15;
		double y = 25;
		double rez;
		x = Math.toRadians(x);
		y = Math.toRadians(y);
		rez = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
		rez = rez * Math.tan(x * y);
		System.out.println("�������� ��������� - " + rez);
	}

	public static void task11() {
		double a = 5;
		double b = 7;
		double c = Math.pow(a, 2) + Math.pow(b, 2);
		c = Math.sqrt(c);
		double area = a * b / 2;
		double perimeter = a + b + c;
		System.out.println("������� ������������ - " + area + " ��2");
		System.out.println("�������� ������������ - " + perimeter + " ��");
	}

	public static void task12() {
		double x1 = 2, y1 = 3;
		double x2 = -2, y2 = 1;
		double AC = x1 - x2; // ������ �����
		double BC = y1 - y2; // ������ �����
		double AB = Math.sqrt(Math.pow(AC, 2) + Math.pow(BC, 2)); // ���������� - ���������� ����� �������
		System.out.println("���������� ����� ������� -" + AB);
	}

	public static void task13() {
		double x11 = -2, y11 = -1;
		double x22 = 2, y22 = 3;
		double x33 = 4, y33 = -2;
		// ������� AB
		double one1 = x11 - x22; // ������ ����� 1
		double two1 = y11 - y22; // ������ ����� 1
		double AB2 = Math.sqrt(Math.pow(one1, 2) + Math.pow(two1, 2)); // ���������� 1 !!!!

		// ������� ��
		double one2 = x22 - x33; // ������ ����� 2
		double two2 = y22 - y33; // ������ ����� 2
		double BC2 = Math.sqrt(Math.pow(one2, 2) + Math.pow(two2, 2)); // ���������� 2 !!!!

		// ������� A�
		double one3 = x11 - x33; // ������ ����� 3
		double two3 = y11 - y33; // ������ ����� 3
		double AC2 = Math.sqrt(Math.pow(one3, 2) + Math.pow(two3, 2)); // ���������� 3 !!!!

		// ��������
		double perimeter2 = AB2 + BC2 + AC2;

		// �������
		double halfPer = perimeter2 / 2; // ������������
		double area2 = (halfPer - AB2) * (halfPer - BC2) * (halfPer - AC2);
		area2 = Math.sqrt(halfPer * area2);
		System.out.println(
				"�������� ������������ - " + perimeter2 + " ��" + "\n" + "������� ������������ - " + area2 + " ��2");
	}

	public static void task14() {
		double R = 5;
		double C = 2 * Math.PI * R;
		double S = Math.PI * Math.pow(R, 2);
		System.out.println("����� ���������� - " + C + " ��");
		System.out.println("������� ����� - " + S + " ��.��.");
	}

	public static void task15() {
		double pow2 = Math.pow(Math.PI, 2);
		double pow3 = Math.pow(Math.PI, 3);
		double pow4 = Math.pow(Math.PI, 4);
		double pow5 = Math.pow(Math.PI, 5);
		System.out.println("����� �� �� ������ ������� - " + pow2);
		System.out.println("����� �� � ������� ������� - " + pow3);
		System.out.println("����� �� � ��������� ������� - " + pow4);
		System.out.println("����� �� � ����� ������� - " + pow5);
	}

	public static void task16() {
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
		System.out.println("������������ ���� ��������� ����� - " + rez);
	}

	public static void task17() {
		double a = -9;
		double b = 15;
		double average = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double geometric = Math.sqrt(Math.abs(a) * Math.abs(b));
		System.out.println("������� �������������� ����� - " + average);
		System.out.println("������� �������������� ������� - " + geometric);
	}

	public static void task18() {
		int rebro = 3;
		int areaOne = rebro * rebro;
		int areaFull = areaOne * 6;
		int volum = rebro * rebro * rebro;
		System.out.println("������� ����� ���� - " + areaOne + " ��2");
		System.out.println("������� ������ ����������� ���� - " + areaFull + " ��2");
		System.out.println("����� ���� ���� - " + volum + " ��3");
	}

	public static void task19() {
		double a = 3;
		double height;
		height = Math.sqrt(a) / 2 * a;
		double area = a / 2 * height;
		double radiusIn = a / (2 * Math.sqrt(3));
		double radiusOut = a / Math.sqrt(3);
		System.out.println("������ ������������ - " + height + " ��");
		System.out.println("������� ������������ - " + area + " ��2");
		System.out.println("������ ��������� ���������� - " + radiusIn + " ��");
		System.out.println("������ ��������� ���������� - " + radiusOut + " ��");
	}

	public static void task20() {
		double length = 30;
		double radius = length / (2 * Math.PI);
		double area = Math.PI * Math.pow(radius, 2);
		System.out.println("������� ����� - " + area + " ��2");
	}

	public static void task21() {
		double R = 333.444;
		int j = (int) R;
		int k = (int) ((R % j) * 1000);
		System.out.println(R + " -> " + k + "." + j);
	}

	public static void task22() {
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
		System.out.println(zeroH + hour + " � " + zeroM + min + " � " + zeroS + sec + " �");
	}

	public static void task23() {
		double rIn = 10;
		double rOut = 20;
		double areaIn = Math.PI * Math.pow(rIn, 2);
		double areaOut = Math.PI * Math.pow(rOut, 2);
		double areaRing = areaOut - areaIn;
		System.out.println("������� ������ - " + areaRing + " ��2");
	}

	public static void task24() {
		double a = 17;
		double b = 11;
		double degrees = 40;
		double radians = Math.toRadians(degrees);
		double tgAngle = Math.tan(radians);
		double areaTrapeze = (Math.pow(a, 2) - Math.pow(b, 2)) / 4;
		areaTrapeze = areaTrapeze * tgAngle;
		System.out.println("������� �������� - " + areaTrapeze + " ��2");
	}

	public static void task25() {
		//
	}

	public static void task26() {
		double a = 15; // ������� a
		double b = 25; // ������� b
		double y = 35; // ���� � ��������
		y = Math.toRadians(y); // ���� � ��������
		y = Math.sin(y); // ����� ����
		double area = (a * b * y) / 2; // �������
		System.out.println("������� ������������ - " + area + " ��2");
	}

	public static void task27() {
		int u = 2;
		int u2 = u * u;
		int u4 = u2 * u2;
		System.out.println("����� " + u + " � ������� ������� = " + u4 * u4);
	
		int uu = 2;
		int uu2 = uu * uu;
		int uu4 = uu2 * uu2;
		System.out.println("����� " + uu + " � ������� ������� = " + uu4 * uu4 * uu2);
	}

	public static void task28() {
		//
	}

	public static void task29() {
		//
	}

	public static void task30() {
		double R1 = 10;
		double R2 = 12;
		double R3 = 14;
		double RR;
		RR = 1 / R1 + 1 / R2 + 1 / R3; // 1
		RR = 1 / RR; // 2
		System.out.println("������������� ������������� ���������� - " + RR + " ��");
	}
	public static void task31() {
		//
	}

	public static void task32() {
		//
	}
			
	public static void task33() {
			char a = 'i';
			int b = (int) a;
			char before = (char) (b-1);
			char after = (char) (b+1);
			System.out.println("���������� ����� ������� - " + b); 
			System.out.println("������ �� - " + before); 
			System.out.println("������ ����� " + after);
	}
			
	public static void task34() {
		//
	}
			
	public static void task35() {
			double m = 226;
			double n = 17;
			double div = m / n;
			int div2 = (int)div;
			int cel = (int)div%10;
			int drob = (int)((div%div2)*10);
					
			System.out.println("m / n = " + div);
			System.out.println("������� ����� ������� ����� - " + drob);
			System.out.println("������� ����� ����� ����� - " + cel);		
	}
	
	public static void task36() {
		//
	}
	
	public static void task37() {
		//
	}
	
	public static void task38() {
		//
	}
	
	public static void task39() {
		//
	}
	
	public static void task40() {
		//
	}
}