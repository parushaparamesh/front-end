package BasicLogicProgrammes;

public class HCF_By_WhileLoop {

	public static void main(String[] args) 
		{
		    int num1 = 36, num2 = 60, hcf;

		    while (num1 != num2)
		    {
		        if (num1 > num2)
		            num1 -= num2;
		        else
		            num2 -= num1;
		    }


		    System.out.println("The HCF: "+ num1);
		  }
}