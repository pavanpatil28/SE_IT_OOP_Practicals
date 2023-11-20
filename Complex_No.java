// Importing the Java Scanner class to take Input from the user.
import java.util.Scanner;

// Creating Class Complex
class Complex 
{
	// Declaring variables
	int real,imaginary,mul,n1,n2,div1,div2,d;

	// Creating Default Constructor
	Complex()
	{
		real = 0; imaginary = 0; mul = 0; n1 = 0; n2 = 0; div1 = 0; div2 = 0; d = 0;
	}

	// Creating Parameterized Constructor
	Complex(int r, int i, int j)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("=================================================================");
		System.out.print(" >> Enter the real part of the No. "  + j + " = ");
		real = sc.nextInt();
		
		System.out.print(" >> Enter the imaginary part of the No. "  + j + " = ");
		imaginary = sc.nextInt();
		System.out.println();
	}

	// Method to display the entered complex no.
	void display(String k)
	{	
		System.out.println( k + " No = " + real + " + " + imaginary + "i ");
		System.out.println("\n=================================================================\n");
	}

	// Method to perform sum operation on the two complex no
	 void Sum(Complex a1, Complex a2)
	 {	 
		real = a1.real + a2.real;
		imaginary = a1.imaginary + a2.imaginary;
	 }

	// Method to display the sum of the two complex no
	 void dis()
	 {
		System.out.println("\n --> The Sum of two complex number is = " + real + " + " + imaginary + "i ");
		System.out.println("\n=================================================================\n");
	 }

	// Method to perform Subtraction operation on the two complex no
	 void sub(Complex a1, Complex a2)
	{
		real = a1.real - a2.real;
		imaginary = a1.imaginary - a2.imaginary;
	}

	// Method to display the Subtraction of the two complex no
	void disp()
	 {	 
			System.out.println("\n --> The Subtraction Of Two Complex Number Is = " + real + " + " + imaginary + "i ");
			System.out.println("\n=================================================================\n");
	 }

	// Method to perform Multiplication operation on the two complex no
	void mult(Complex a1, Complex a2)
	{ 
			 mul=(a1.real*a2.real)+((-1)*a1.imaginary*a2.imaginary);
			 real=(a1.real*a2.imaginary)+(a1.imaginary*a2.real);	 
	}

	// Method to display the Multiplication of the two complex no
	void dismult()
	 {
			System.out.println("\n --> The multiplication of two complex number is = "+mul+" + "+real+"i ");
			System.out.println("\n=================================================================\n");
	 }

	// Method to perform Division operation on the two complex no
	void division(Complex a1, Complex a2)
	{	 
		 d=(a2.real*a2.real)+(a2.imaginary*a2.imaginary);
		 n1=(a1.real*a2.real)+((-1)*a1.imaginary*a2.imaginary);
		 n2=(a1.imaginary*a2.real)-(a1.real*a2.imaginary);

		// for checking if the Denominator is valid
		if(d==0)
		 {
			 System.out.println("\n \t\t !!!!!! Error !!!!! ");
		 }
		 else
		 {
			 div1=(n1/d);
			 div2=(n2/d);
		 }
	}

	// Method to display the Division of the two complex no
	void disdiv(Complex a1, Complex a2)
	 {
		 // for checking if the Denominator is valid
		 if(d==0)
		 {
			 System.out.println("\n \t\t -----> Denominator cannot be zero --> ");
			 System.out.println("\n=================================================================\n");
		 }
		 else
		 {
			 if(div1 == 0 || div2 == 0 )
			 {
				 System.out.println(" \n --> The Division of two complex number is = " + a1.real + "/" + a2.real + " + " + a1.imaginary + "/" + a2.imaginary + "i ");
				 System.out.println("\n=================================================================\n");				 				 
			 }
			 else
			 {
				 System.out.println(" \n --> The Division of two complex number is = "+div1+" + "+div2+"i ");
				 System.out.println("\n=================================================================\n");				 
			 }
		 }
	 }
}

// Main class
public class Complex_No 
{
	public static void main(String[] args)
	{
		// Declaring variables;
		int  real, imaginary, i, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n \t =========================================== ");
		System.out.println(" \t ||   Program for Complex No Calculator   || ");
		System.out.println(" \t =========================================== ");
		System.out.println();
		Complex b1 = new Complex( 0, 0, 1);
		b1.display(" --> First");
		Complex b2 = new Complex( 0, 0, 2);
		b2.display(" --> Second");

		// infinite while loop to perform the operations multiple times
		while(true)
		{
			int choice;
			System.out.println("=================================================================");
			// Creating Menu for the Calculator operations of Complex No
			System.out.println(" >>> Main Menu of Calculator :- ");
			System.out.println();
			System.out.println(" 1] Addition ");
			System.out.println(" 2] Subtraction ");
			System.out.println(" 3] Multiplication ");
			System.out.println(" 4] Division ");
			System.out.println(" 5] Exit ");
			// Input the operation to be performed
			System.out.print(" >> Enter the operation to be Performed = ");
			choice = sc.nextInt();
			System.out.println("\n=================================================================");

			// Program gets Exited if input is 5
			if(choice==5) 
			{
				System.out.println("\n \t -----> Program Exited Successfully --> ");
				System.out.println("\n=================================================================");
				break;		
			}
			// Operations will be performed according to the entered input from main menu
			else
			{
				// Switch case to perform different cases
				switch(choice)
				{
					// For Sum
					case 1 :
						Complex b3 = new Complex();
						b3.Sum(b1, b2);
						b3.dis();
						break;

					// For Subtraction
					case 2 :
						Complex b4 = new Complex();
						b4.sub(b1,b2);
						b4.disp();
						break;

					// For Multiplication
					case 3 :
						Complex b5 = new Complex();
						b5.mult(b1, b2);
						b5.dismult();
						break;

					// For Division
					case 4 :
						Complex b6 = new Complex();
						b6.division(b1, b2);
						b6.disdiv(b1, b2);
						break;
				}	
			}
		}
	}
}
