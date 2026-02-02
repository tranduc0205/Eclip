package Bai1;

public class Bai07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n= 10;
    double tong = 0;
    for( int i =1; i<= n; i++) {
    	tong += (1.0*i)/(i+1);
    }
    System.out.println("S(n)=" + tong);
	}

}
