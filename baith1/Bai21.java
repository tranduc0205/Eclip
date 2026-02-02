package Bai1;

public class Bai21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24; // nhập thẳng dữ liệu
        int m = 36;

        int ucln = 1;
        int min = (n < m) ? n : m;

        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                ucln = i;
            }
        }

        System.out.println("UCLN cua " + n + " va " + m + " la: " + ucln);
	}

}
