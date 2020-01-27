package by.htp.les01.main;

public class First {

	public static void main(String[] args) {
		//getExmpl(3, 4);
	//}

	//public static void getExmpl(int x, int y) {
		
		int x = -3;
		int y = -4;
		int x1 = -4;
		int x2 = 0;
		int y1 = 4;

		for (int i = y1; i <= y; i++) {
			for (int r = x; r <= x; r++) {
				if (y <= y1 && x >= x1 && x <= x2) {
					System.out.println("Точка с координатами ( " + x + ", " + i + " принадлежит закрашенной области. ");

				} else {
					System.out.println(
							"Точка с координатами (" + x + ", " + i + ") не принадлежит закрашенной области. ");
				}
			}
		}
	}
}