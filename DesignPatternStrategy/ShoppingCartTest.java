import java.util.*;

public class ShoppingCartTest 
{

	public static void main(String[] args) 
	{
		
		ShoppingCart cart = new ShoppingCart();

		System.out.println("\n\t=================================================================");
		System.out.println("\t||       Strategy Design Pattern For Simple Shopping Cart      ||");
		System.out.println("\t=================================================================");
		
		System.out.println(" \n \t\t   >>><<<  WELCOME TO S-MART SHOP >>><<< ");	
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do 
		{
			System.out.println("\n============================================================================\n");
			
			System.out.println(" >>> Main Menu For Shopping :- \n");	
			
			System.out.println(" 1] Order Items \t\t 2] Payment Through Credit / Debit Card \n\n 3] Payment Through Paypal \t 4] Payment Through Bit-Coin \n\n 5] Exit Program \n ");
			System.out.print(" >> Enter The Action To Be Performed    ::  ");
			choice=sc.nextInt();
			
			System.out.println("\n============================================================================");
			
			switch(choice) 
			{
				case 1:
					System.out.println("\n============================================================================\n");
					int n;
					int price;
					String itemsName;
					System.out.print(" >> Enter How Much Items You Want To Buy  ::  ");
					n = sc.nextInt();
					System.out.println();
					
					for(int i=1;i<=n;i++) 
					{
						System.out.print(" >> Enter Name of Item " + i + "  :: ");
						itemsName = sc.next();
						System.out.print(" >> Enter Price of Item " + i + " :: ");
						price = sc.nextInt();				
					
						Item item1 = new Item(itemsName, price);
						cart.addItem(item1);
						System.out.println();
					}
					System.out.println("============================================================================");
					break;
				case 2:
					System.out.println("\n============================================================================\n");
					//pay by credit card
					System.out.println(" >>> Enter Credit / Debit Card Details :- \n");
					
					String name,CardNo = null,CVV = null,DOE = null;
					
					System.out.print(" >> Enter Card Holder Name  ::  ");
					name = sc.next();
					System.out.print(" >> Enter Card Number       ::  ");
					name = sc.next();
					System.out.print(" >> Enter CVV PIN           ::  ");
					name = sc.next();
					System.out.print(" >> Enter Date Of Expiry    ::  ");
					name = sc.next();
					
					cart.pay(new CreditCardStrategy(name,CardNo,CVV,DOE));
					System.out.println("\n============================================================================\n");
					
					break;
				case 3:

					System.out.println("\n============================================================================\n");
					System.out.println(" >>> Enter Pay Pal Details :- \n");

					//pay by paypal
					String mail,pwd;
					System.out.print(" >> Enter Your Email     ::  ");
					mail = sc.next();
					System.out.print(" >> Enter Your Password  ::  ");
					pwd = sc.next();
				
					cart.pay(new PaypalStrategy(mail,pwd));
					System.out.println("\n============================================================================\n");
					break;
					
				case 4:
					//pay by bitcoin
					System.out.println("\n============================================================================\n");
					System.out.println(" >>> Enter Bit-Coin Details :- \n");
					
					String vid,pwds;
					System.out.print(" >> Enter Your Bit Coin Wallet ID  ::  ");
					vid=sc.next();
					System.out.print(" >> Enter Your Password            ::  ");
					pwds=sc.next();
					System.out.println();
					
					cart.pay(new Bit_Coin(vid,pwds));
					System.out.println("\n============================================================================\n");
					break;
					
				case 5:
					System.out.println("\t --> Program Exited Successfully ");
					System.out.println("\n============================================================================\n");
					break;
			}
			
		}while(choice!=5);
	}

}



