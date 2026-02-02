package Bai1;

public class Bai06 {
     public static void main(String[] args) {
    	 int n=10;
    	 double tong = 0;
    	 for(int i=1; i<=n; i++) {
    		 tong= tong + 1.0/(i*(i+1));
    	 }
    	 System.out.println("S(n) =" + tong );
     }
     
}
