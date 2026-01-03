package Core_Concepts.logics;

public class Factorial {

	public static void main(String[] args) {

		int num=5;
		int factorial=0;
		
		for(int i=1; i<=num; i++)	// 5+4+3+2+1
		{
			//System.out.println(i);
			factorial +=i;
		}
		System.out.println(factorial);
	}

}
