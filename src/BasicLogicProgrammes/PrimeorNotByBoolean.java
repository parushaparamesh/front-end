package BasicLogicProgrammes;
import java.util.*;
public class PrimeorNotByBoolean {

	public static void main(String[] args) {
		
     int i;
     System.out.println(" Enter a Number");

     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     boolean isPrime = true;
     
     if (n<2)
    	 isPrime = false;
     else 
    	 for(i= 2;i < n; i++) {
    		 if (n%i==0) {
    			 isPrime = false;
    			 break;
    		 }
    	 }
     String CheckPrime = isPrime ? " is a Prime ": " is a Not a Prime";
     System.out.println(n+CheckPrime);
     
	}

}
