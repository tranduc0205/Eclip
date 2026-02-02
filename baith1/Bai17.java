package Bai1;

public class Bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n= 10;
    int tong = 0;
    int tich = 1;
    System.out.println("Tong va tich cua cac uoc cua so nguyen duong " +n+ " la: ");
    for(int i =1 ;i<=n; i ++) {
    	if (n % i == 0 ) {
    	tong += i;
    	tich *= i;
    	}
	}
    System.out.println("Tong la: "+ tong);
    System.out.println("Tich la: "+ tich);
	}
}
