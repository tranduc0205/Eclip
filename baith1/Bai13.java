package Bai1;

public class Bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x=2;
    int n= 5;
    int luythua =1;
    int tong =0;
    for (int i=1; i<=n; i++) {
    	luythua *= x*x;
    	tong += luythua;
    }
    System.out.println("S(n) ="+ tong);
	}
}