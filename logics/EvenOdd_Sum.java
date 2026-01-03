package Core_Concepts.logics;

public class EvenOdd_Sum {

	public static void main(String[] args) {

		int num1=0;
		int num2=0;
		
		for(int i=0; i<=10340; i++)
		{
			if(i%2==0)
			{
				System.out.print("Even: "+i+"    ");
				num1+= i;
			}
			else
			{
				System.out.println("Odd: "+i);
				num2 += i;
			}
		}
		System.out.println();
		System.out.println("Total Sum of Even: "+num1);
		System.out.println("Total Sum of  Odd: "+num2);
			
	}

}
