package by.htp.les01.main;

public class Fourth {
	public static void main(String[] args) {
	// 21
		double R = 333.444;
		int jj = (int) R;
		int kk = (int) ((R % jj) * 1000);
		System.out.println(kk + "." + jj);
		
	//22
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
		
		
	//23
		double rIn = 10;
		double rOut = 20;
		double areaIn = Math.PI * Math.pow(rIn, 2);
		double areaOut = Math.PI * Math.pow(rOut, 2);
		double areaRing = areaOut - areaIn;
		System.out.println("Площадь кольца - " + areaRing + " см2");
		
	//24
		double a = 17;
		double b = 11;
		double degrees = 40;
		double radians = Math.toRadians(degrees);
		double tgAngle = Math.tan(radians);
		double areaTrapeze = (Math.pow(a, 2) - Math.pow(b, 2)) / 4;
		areaTrapeze = areaTrapeze * tgAngle;
		System.out.println("Площадь трапеции - " + areaTrapeze + " см2");
		
	//25
		
		
		
	//26
		double a1 = 15; // сторона a
		double b1 = 25; // сторона b
		double y1 = 35; // угол в градусах
		y1 = Math.toRadians(y1); // угол в радианах
		y1 = Math.sin(y1); // синус угла
		double area1 = (a1 * b1 * y1) /2; // площадь
		System.out.println("Площадь треугольника - " + area1 + " см2");
		
	//27
		int u=2;
		int u2=u*u;
		int u4=u2*u2;
		System.out.println("Число " + u + " в восьмой степени = " + u4*u4);
				
		int uu=2;
		int uu2=uu*uu;
		int uu4=uu2*uu2;
		System.out.println("Число " + uu + " в десятой степени = " + uu4*uu4*uu2);
		
	//28
		
		
	//29
		
		
	//30
		double R1 = 10;
		double R2 = 12;
		double R3 = 14;
		double RR;
		RR = 1 / R1 + 1 / R2 + 1 / R3; // 1
		RR = 1 / RR;                    // 2
		System.out.println("Сопротивление параллельного соединения - " + RR + " Ом");
		
		
		
		
		
		
		
	}
}
