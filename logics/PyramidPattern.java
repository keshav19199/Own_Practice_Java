package Core_Concepts.logics;

public class PyramidPattern {

	public static void main(String[] args) {

		String str="*";
		
		for(int i=1; i<=5; i++)	// Line 1-*, 2-* *, 3- * * *, 4-* * * * * 
		{
			for(int j=1; j<i; j++)
			{
				System.out.println(str);
			}
		}
	}

}
