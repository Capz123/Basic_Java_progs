import java.util.*;

public class algo
{
		public static void main (String[] args) 
	{
	
		int a, b, c;
		int i;
		double div;
	
		Scanner sc = new Scanner(System.in);
		do{
		
		
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		
		System.out.println("Select Operation");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		
		System.out.print("Type the number you selected ");
		i = sc.nextInt();
			switch(i)
			{
				case 1:	c = a+b;
						System.out.println("The sum of two numbers is "+c);
						break;
				case 2:	c = a-b;
						System.out.println("The difference of two number is "+c);
						break;
				case 3:	c = a*b;
						System.out.println("The product of two numbers is "+c);
						break;
				case 4: div = a/b;
						System.out.println("The qoutient of two numbers is "+div);
						break;
			}
		}while(i != 5);
		
	}
	

}