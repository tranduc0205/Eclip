package Bai1;

public class Bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x= 2;
    int n=5;
    int luythua =x;
    int tong =0;
    for(int i=0;i<=n; i++) {
    	tong += luythua;
    	luythua = luythua*x*x;
    	
    }
    System.out.println("S(n) =" + tong );	
    }
}
