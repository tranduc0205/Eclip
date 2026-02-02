package Bai1;

public class Bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 10; // nhập thẳng dữ liệu
	        int demUoc = 0;
	        int demLe = 0;
	        int demChan = 0;

	        System.out.println("Cac uoc cua so " + n + " la:");

	        for (int i = 1; i <= n; i++) {
	            if (n % i == 0) {
	                System.out.print(i + " ");

	                demUoc++;

	                if (i % 2 == 0) {
	                    demChan++;
	                } else {
	                    demLe++;
	                }
	            }
	        }

	        System.out.println();
	        System.out.println("Tong so uoc: " + demUoc);
	        System.out.println("So uoc le: " + demLe);
	        System.out.println("So uoc chan: " + demChan);
	}

}
