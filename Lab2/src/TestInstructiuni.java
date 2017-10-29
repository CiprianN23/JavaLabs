import java.util.Scanner;

public class TestInstructiuni
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduceti un numar ");
		int x = s.nextInt();
		System.out.println("Rezultatul functiei este: " + test(x));	
	}
	public static int test(int x) 
	{
		int suma = 0;
		for(int i = 0; i < 4; i++)
		{
			System.out.println("Am intrat in nivelul 1");
			int j = 0;
			while(j++ < x) 
			{
				System.out.println("Am intrat in nivelul 2");
				System.out.println("i = " + i + "; j = " + j);
				switch(i)
				{
				case 0:
					continue;
				case 1:
					continue;
				case 2:
					continue;
				case 3:
					suma += i + j;
					break;
				}
			}
			System.out.println("Am iesit din nivelul 2");
			
		}
		System.out.println("Am iesit din nivelul 1");
		return suma;
	}
}