package BasicLogicProgrammes;

public class FibnociiRecurse {
	public static void fb(int a,int b,int n) {
		if(n==0) {
			return ;
		}
		int c=a+b;
	    System.out.println(c);
	    fb(b,c,n-1);
	}
		
	

	public static void main(String[] args) {
		int n=6,a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		fb( a, b, n-2);
	}

}
