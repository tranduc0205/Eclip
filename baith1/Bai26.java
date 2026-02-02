package Bai1;

public class Bai26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10; // nhập n trực tiếp trong code (n > 0)

        System.out.println("Cac so nguyen le nho hon " + n + " la:");

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
	}

}
