package Bai1;

public class Bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n= 5;
    int giaithua = 1;
    int tong = 0;
    for (int i =1 ; i <=n ; i++) {
    	giaithua *=i;
    	tong += giaithua;
    }
    System.out.println("S(n) =" + tong);
	}

}
