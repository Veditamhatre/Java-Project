package code;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int num1,num2,option;
		option = 0;
		while (option!=6)
			{
				System.out.println("Enter the First Number :");
				num1=sc.nextInt();

				System.out.println("Enter the Second Number :");
				num2=sc.nextInt();
				
				System.out.println("1. Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulo \n6.Exit");
				System.out.println("Enter your Option : ");
				option =sc.nextInt();
				switch(option) {
				case 1: System.out.println("Addition :" +(num1+num2));
				break;
				case 2: System.out.println("Subtraction :" +(num1-num2));
				break;
				case 3: System.out.println("Multiplication :" +(num1*num2));
				break;
				case 4: System.out.println("Division :" +(num1/num2));
				break;
				case 5: System.out.println("Modulo :" +(num1%num2));
				break;
				case 6: System.exit(0);
				break;
				default : System.out.println("Invalid Input....");
				
				}
	}
}
}