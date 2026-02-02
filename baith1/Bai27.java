package Bai1;

public class Bai27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 50; // nhập n trực tiếp trong code (n > 0)

	        System.out.println("Cac so le nho hon " + n + " (tru 7, 21, 41):");

	        for (int i = 1; i < n; i++) {
	            if (i % 2 != 0 && i != 7 && i != 21 && i != 41) {
	                System.out.print(i + " ");
	            }
	        }
	}

}
