package Bai1;

public class Bai23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double a = 2;   // nhập thẳng dữ liệu
	        double b = -4;

	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phuong trinh co vo so nghiem");
	            } else {
	                System.out.println("Phuong trinh vo nghiem");
	            }
	        } else {
	            double x = -b / a;
	            System.out.println("Phuong trinh co nghiem x = " + x);
	        }
	}

}
