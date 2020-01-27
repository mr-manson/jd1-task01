package by.htp.les01.task;

public class task01 {

	public static void main(String[] args) {
		double R = 333.444;
		int j = (int) R;
		int k = (int) ((R % j) * 1000);
		System.out.println(R + " -> " + k + "." + j);
						
		}
}
