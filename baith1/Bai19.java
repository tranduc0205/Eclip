package Bai1;

public class Bai19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; // nhập thẳng dữ liệu
        int dem = 0;

        if (n <= 1) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    dem++;
                }
            }

            if (dem == 2) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }
        }
	}

}
