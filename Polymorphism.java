// Importing the Java Scanner class to take Input from the user.
import java.util.Scanner;  
// Importing the Java Formatter class to format the output.
import java.util.Formatter;

// creating an abstract class publication
class Publication
{
	String title, str = "|";
	int price,flag1=0;
	int copies;
	static float counter=0;
	static int flag=0;
	
//	void Sale_copy()
//	{
//		
//	}
}

class Book extends Publication
{
	String[] Empty = new String[10];
	String[] AAuthor = new String[10];
	int[] ccopies = new int[10];
	float[] pprice = new float[10];
	String[] Title = {"Wings of Fire","Success","Atomic Habits","Relativity","Other Side Of Silence","The Girl With No Dreams","The Magical Book"};
	String[] Author = {"Dr.Abdul Kalam","J C Choudhary ","James Clear","Albert Einstein","Prashanth Chakkula","Deepak Gupta","Sai Chander Akula"};
	float[] Price= {150,230,190,250,210,170,180};
	int [] Copies= {100,200,100,400,200,250,500,120};
	
	public void Default_Books() 
	{
		System.out.println(" >>> Book Stock :- \n");
		System.out.println(" _________________________________________________________________________________________________");
		
		Formatter fmt1 = new Formatter(); 
		fmt1.format("%1s %12s %17s %12s %15s %11s %8s %12s %3s \n", "|", "Book Name", "|", "Book Author", "|", "Book Price", "|", "Book Copies", "|");
		System.out.print(fmt1);
		
		System.out.println("|______________________________|____________________________|____________________|________________|");
		for(int i=0;i<Title.length;i++) 
		{
			System.out.printf("| " + (i+1) + "] %-25s %-3s",Title[i],str);
			System.out.printf("%-25s %-3s",Author[i],str);
			System.out.printf("%-17s %-3s",Price[i],str);
			System.out.printf("%-13s %-1s",Copies[i],str);
			System.out.println("\n|______________________________|____________________________|____________________|________________|");
		}
		System.out.println("\n======================================================================================================");
	}
	
	public void Order_copies() 
	{
    	// Creating the object sc of the Scanner file
		Scanner sc = new Scanner(System.in);
		int atm, pin, choice,flag1 = 0, temp = 0;
		String upi;
		
		System.out.println("\n======================================================================================================");
		System.out.println(" >>> Enter the Book Details :- \n");
		System.out.print(" >> Enter the Title of Book to order :: ");
		title=sc.next();
		
		for(int i=0;i<Title.length;i++) 
		{
			if(Title[i].equalsIgnoreCase(title)) 
			{
				flag1 = 1;
				temp = 1;
			}
		}
		
		if(temp == 0)
		{			
			System.out.println("\n \t -----> This Book is not Avaiable in the Book Stock --> ");
		}
		
		if(flag1 == 1)
		{
			for(int i=0;i<Title.length;i++) 
			{
				if(Title[i].equalsIgnoreCase(title))
				{
					System.out.print(" >> How many Copies do you want ? = ");
					copies=sc.nextInt();
					
					if(copies == 0)
					{
						System.out.println(" \n \t -----> Enter atleast 1 Copy of Book --> ");
						System.out.println("\n======================================================================================================");
						break;
					}
					
					if(copies > Copies[i])
					{
						System.out.println(" \n \t -----> Entered No. of Book Copies are not available --> ");
						System.out.println("\n======================================================================================================");
						break;
					}
					
					if(copies <= Copies[i]) 
					{
						for(int j=flag;j<=flag;j++)
						{
							Empty[j]=Title[i];
							AAuthor[j] = Author[i]; 
							ccopies[j]=copies;
							pprice[j]=Price[i]*copies;
						}
						Copies[i]=Copies[i]-copies;
						
						System.out.println("\n======================================================================================================");
				    	System.out.println("\n \t\t\t\t\t ====================== ");
						System.out.println(" \t\t\t\t\t ||   Book Details   || ");
						System.out.println(" \t\t\t\t\t ====================== \n");
		
						System.out.println("  _________________________________________________________________________________________________");
						
						Formatter fmt1 = new Formatter(); 
						fmt1.format("%2s %12s %17s %12s %15s %11s %8s %12s %3s \n", "|", "Book Name", "|", "Book Author", "|", "Book Price", "|", "Book Copies ", "|");
						System.out.print(fmt1);
						
						System.out.println(" |______________________________|____________________________|____________________|________________|");					
						System.out.printf(" | " + (i+1) + "] %-25s %-2s",Title[i],str);
						System.out.printf(" %-25s %-2s",Author[i],str);
						System.out.printf(" %-17s %-1s",Price[i]*copies,str);
						System.out.printf(" %-14s %-1s",copies,str);
						System.out.println("\n |______________________________|____________________________|____________________|________________|");
						
						// Computing 
						counter += (Price[i]*copies);
						flag++;
						
						System.out.println("\n======================================================================================================");
						System.out.print(" >>> Payment Options :- \n \n 1] Cash. \n 2] Paytm/Phone-Pay/G-Pay. \n \n Enter the choice :: ");
						choice=sc.nextInt();
						System.out.println("\n======================================================================================================");
						
						switch(choice) 
						{
							case 1:
								System.out.print(" >> Do you want Bill ? \n \n \t 1] Yes. \t 2] No. \t :: ");
								choice=sc.nextInt();
								System.out.println("\n======================================================================================================");
								
								if(choice==1) 
								{
									System.out.println("\n \t\t =================== ");
									System.out.println(" \t\t ||   Book BILL   || ");
									System.out.println(" \t\t =================== \n");
									
									System.out.println(" =====================================================");
									System.out.println(" ||  Book Name \t\t ||  " + Title[i]);//							
									System.out.println(" =====================================================");
									
									System.out.println(" ||  Book Author \t ||  " + Author[i]);//							
									System.out.println(" =====================================================");
									
									System.out.println(" ||  Book Price \t ||  " + Price[i]*copies);//						
									System.out.println(" =====================================================");
									
									System.out.println(" ||  Book Copies \t ||  " + copies);//								
									System.out.println(" =====================================================");
									
									System.out.println("\n \t -----> Cash Amount Payed --> ");
									System.out.println("\n \t -----> Book Purchase Successfull --> ");
								}
								
								else 
								{
									System.out.println("\n \t -----> Cash Amount Payed --> ");
									System.out.println("\n \t -----> Book Purchase Successfull --> ");
								}
								break;
								
							case 2:
								System.out.println(" >>> Online Payment Menu :- \n");
								System.out.print(" >> Enter UPI           :: ");
								upi=sc.next();
								System.out.print(" >> Enter Amount        :: ");
								atm=sc.nextInt();
								System.out.print(" >> Enter (4-digit) PIN :: ");
								pin=sc.nextInt();
								if(atm!=Price[i]*copies)
								{
									System.out.println("\n \t -----> Payment UnSuccessfull Amount Entered is not equal to Bill Amount --> ");
									Copies[i]=Copies[i]+copies;
								}
								else
								{								
									System.out.println("\n \t -----> Online Payment Successfull --> ");
									System.out.println("\n \t -----> Book Purchase Successfull --> ");
								}
								break;
						  }
					}
				}
			}		
		}
	}		
	
	public void Sale_copy() 
	{
		int i = 0;
		
		System.out.println("\n \t\t\t =========================================== ");
		System.out.println(" \t\t\t ||   Total Sale Of Publication Of Book   || ");
		System.out.println(" \t\t\t =========================================== \n");
		
		if(flag!=0)
		{
			System.out.println(" >>> Book Saled :- ");
			System.out.println(" \n --> NO OF BOOKS SALED :: " + flag);
			System.out.println("\n _________________________________________________________________________________________________");
			
			
			Formatter fmt1 = new Formatter(); 
			fmt1.format("%1s %12s %17s %12s %15s %11s %8s %12s %3s \n", "|", "Book Name", "|", "Book Author", "|", "Book Price", "|", "Book Copies", "|");
			System.out.print(fmt1);
			
			System.out.println("|______________________________|____________________________|____________________|________________|");
			for(int j=i;j<flag;j++) 
			{
				System.out.printf("| " + (i+1) + "] %-25s %-3s",Empty[i],str);
				System.out.printf("%-25s %-3s",AAuthor[i],str);
				System.out.printf("%-17s %-3s",pprice[i],str);
				System.out.printf("%-13s %-1s",ccopies[i],str);
				System.out.println("\n|______________________________|____________________________|____________________|________________|");
				i++;
			}		
			System.out.println("\n --> Tota Sale Of Book :: " + counter);
		}	
		
		else
		{
			System.out.println(" \n -----> No Books Saled to Display --> ");
		}
		System.out.println("\n======================================================================================================");
	}
	
	public void Add_copies() 
	{
		int flag = 0, temp = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n======================================================================================================");
		System.out.println(" >>> Book Add Menu :- ");
		System.out.print("\n >> Enter the Title of Book to add more copies :: ");
		title=sc.next();
		
		for(int i=0;i<Title.length;i++) 
		{
			if(Title[i].equalsIgnoreCase(title)) 
			{
				flag = 1;
				temp = 1;
			}
		}
		
		if(temp == 0)
		{			
			System.out.println("\n \t -----> This Book is not Avaiable in the Book Stock --> ");
		}
		
		if(flag == 1)
		{
			System.out.print(" >> How many copies do you want to add ? :: ");
			copies=sc.nextInt();
			
			for(int i=0;i<Title.length;i++) 
			{
				if(Title[i].equalsIgnoreCase(title)) 
				{
					Copies[i]+=copies;
				}
			}	
			if(copies!=0)
			{
				System.out.println("\n \t -----> Book Copies Added Successfully --> ");			
			}
			if(copies==0 )
			{
				System.out.println("\n \t -----> No. of Book Copies remain same --> ");		
			}
		}	
		System.out.println("\n======================================================================================================");
	}
	
}
	
class Magazine extends Publication
{
	String[] Empty= new String[10];
	int[]ccopies= new int[10];
	float[]pprice= new float[10];
	String[]Dates= new String[100];
	String[]Dates2= new String[10];
	String[] Title= {"India Today","Time","Champak","Readers Digest","The Week","Overdrive","Bussiness Today"};
	String[] Date= {"12-10-22","3-9-22","4-5-22","6-3-22","17-8-22","25-7-22","10-11-22"};
	float[] Price= {150,230,190,250,210,170,180};
	int[] Copies= {100,200,100,400,200,250,500,120};
	
	void Our_Magazines() 
	{		
		System.out.println(" >>> Magazine Stock :- \n");
		System.out.println(" _____________________________________________________________________________________");
		
		Formatter fmt2 = new Formatter(); 
		fmt2.format("%1s %16s %13s %15s %2s %10s %2s %10s %1s \n", "|", "Magazine Name", "|", "Published Date", "|", "Magazine Price", "|", "Magazine Copies", "|");
		System.out.print(fmt2);
		
		System.out.println("|______________________________|__________________|_________________|_________________|");
		for(int i=0;i<Title.length;i++) 
		{
			System.out.printf("| " + (i+1) + "] %-25s %-3s",Title[i],str);
			System.out.printf("%-15s %-3s",Date[i],str);
			System.out.printf("%-14s %-2s",Price[i],str);
			System.out.printf("%-15s %-1s",Copies[i],str);
			System.out.println("\n|______________________________|__________________|_________________|_________________|");
		}
		System.out.println("\n======================================================================================================");
	}
	
	void Order_Quantity() 
	{
		
    	// Creating the object sc of the Scanner file
		Scanner sc = new Scanner(System.in);
		int atm, pin, choice,flag1 = 0, temp = 0;
		String upi;
		
		System.out.println("\n======================================================================================================");
		System.out.println(" >>> Enter the Magazine Details :- \n");
		System.out.print(" >> Enter the Title of Magazine to Order :: ");
		title=sc.next();
		
		for(int i=0;i<Title.length;i++) 
		{
			if(Title[i].equalsIgnoreCase(title)) 
			{
				flag1 = 1;
				temp = 1;
			}
		}
		
		if(temp == 0)
		{			
			System.out.println("\n \t -----> This Magazine is not Avaiable in the Magazine Stock --> ");
		}
		
		if(flag1 == 1)
		{
			for(int i=0;i<Title.length;i++) 
			{
				if(Title[i].equalsIgnoreCase(title))
				{
					System.out.print(" >> How many copies do you want ? = ");
					copies=sc.nextInt();
					
					if(copies == 0)
					{
						System.out.println(" \n \t -----> Enter atleast 1 Copy of Magazine --> ");
						System.out.println("\n======================================================================================================");
						break;
					}
					
					if(copies > Copies[i])
					{
						System.out.println(" \n \t -----> Entered No. of Magazine Copies are not available --> ");
						System.out.println("\n======================================================================================================");
						break;
					}
					
					if(copies <= Copies[i]) 
					{
						for(int j=flag;j<=flag;j++)
						{
							Empty[j]=Title[i];
							ccopies[j]=copies;
							pprice[j]=Price[i]*copies;
							System.out.print(" >> Enter the Issue Date : DD-MM-YY :: ");
							Dates[i] = sc.next();
							Dates[j] = Dates[i];
						}
						
						System.out.println("\n======================================================================================================");
				    	System.out.println("\n \t\t\t\t\t ========================== ");
						System.out.println(" \t\t\t\t\t ||   Magazine Details   || ");
						System.out.println(" \t\t\t\t\t ========================== \n");
						System.out.println(" _____________________________________________________________________________________");
						
						Formatter fmt3 = new Formatter(); 
						fmt3.format("%1s %16s %13s %15s %2s %10s %2s %10s %1s \n", "|", "Magazine Name", "|", "Published Date", "|", "Magazine Price", "|", "Magazine Copies", "|");
						System.out.print(fmt3);
						
						System.out.println("|______________________________|__________________|_________________|_________________|");						
						System.out.printf("| " + (i+1) + "] %-25s %-3s",Title[i],str);
						System.out.printf("%-15s %-3s",Date[i],str);
						System.out.printf("%-14s %-2s",Price[i]*copies,str);
						System.out.printf("%-15s %-1s",copies,str);
						System.out.println("\n|______________________________|__________________|_________________|_________________|");						
						System.out.println("\n======================================================================================================");
											
						// Computing 
						flag++;
						
						System.out.println("\n======================================================================================================");
						System.out.print(" >>> Payment Options :- \n \n 1] Cash. \n 2] Paytm/Phone-Pay/G-Pay. \n \n Enter the choice :: ");
						choice=sc.nextInt();
						System.out.println("\n======================================================================================================");
						
						switch(choice) 
						{
							case 1:
								System.out.print(" >> Do you want Bill ? \n \n \t 1] Yes. \t 2] No. \t :: ");
								choice=sc.nextInt();
								System.out.println("\n======================================================================================================");
								
								if(choice==1) 
								{
									System.out.println("\n \t\t ======================= ");
									System.out.println(" \t\t ||   Magazine BILL   || ");
									System.out.println(" \t\t ======================= \n");
									
									System.out.println(" =====================================================");
									System.out.println(" ||  Magazine Name \t\t ||  " + Title[i]);//							
									System.out.println(" =====================================================");
									
									System.out.println(" ||  Magazine Issue Date \t ||  " + Date[i]);//							
									System.out.println(" =====================================================");
									
									System.out.println(" ||  Magazine Total Price \t ||  " + Price[i]*copies);//						
									System.out.println(" =====================================================");
									
									System.out.println(" ||  Magazine No. of Copies \t ||  " + copies);//								
									System.out.println(" =====================================================");
									
									System.out.println("\n \t -----> Cash Amount Payed --> ");
									System.out.println("\n \t ----->  Successfull --> ");
								}
								
								else 
								{
									System.out.println("\n \t -----> Cash Amount Payed --> ");
									System.out.println("\n \t ----->  Successfull --> ");
								}
								break;
								
							case 2:
								System.out.println(" >>> Online Payment Menu :- \n");
								System.out.print(" >> Enter UPI           :: ");
								upi=sc.next();
								System.out.print(" >> Enter Amount        :: ");
								atm=sc.nextInt();
								System.out.print(" >> Enter (4-digit) PIN :: ");
								pin=sc.nextInt();
								
								if(atm!=Price[i]*copies)
								{
									System.out.println("\n \t -----> Payment UnSuccessfull Amount Entered is not equal to Bill Amount --> ");
									Copies[i]=Copies[i]+copies;
								}
								else
								{								
									System.out.println("\n \t -----> Online Payment Successfull --> ");
									System.out.println("\n \t ----->  Successfull --> ");
								}
								break;
						}
						Copies[i]=Copies[i]-copies;
					}
				}
			}		
		}
	}
	
	void Current_Issue() 
	{
		System.out.println("\n======================================================================================================");
		System.out.println(" >>> Currently Issued Magazine :- \n");
		System.out.println(" _________________________________________________________________________________________");
		
		Formatter fmt3 = new Formatter(); 
		fmt3.format("%1s %14s %10s %8s %8s %1s %5s %15s %5s \n", "|", "Magazine Name", "|", "Issued Date", "|", "Magazine Price", "|", "Magazine Copies", "|");
		System.out.print(fmt3);
		
		System.out.println("|_________________________|____________________|____________________|_____________________|");
		for(int i=0;i<flag;i++) 
		{
			System.out.printf("| " + (i+1) + "] %-25s %-3s",Empty[i]);
			System.out.printf("%-15s %-3s",Dates[i],str);
			System.out.printf("%-15s %-1s",ccopies[i]);
//			System.out.printf("%-15s %-1s",copies,str);
			System.out.println("\n|______________________________|__________________|_________________|_________________|");				
		}
		System.out.println("\n======================================================================================================");						
		
//		System.out.printf("| " + (i+1) + "] %-25s %-3s",Title[i],str);
//		System.out.printf("%-14s %-2s",Price[i]*copies,str);
	}
	
	void Recieved_Issue() 
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		for(int i=0;i<flag;i++) {
			System.out.print("Magazine name:"+Empty[i]+"   ");
			System.out.print("Enter the Date of Recieving:");
			Dates2[i]=sc.next();
		}
		
		System.out.println("***************************Recieved Issue of Magazine**************************");
		System.out.println("Magazine Name\t\t\tRecieved Date");
		for(int i=0;i<flag;i++) {
			System.out.printf("%-30s ",Empty[i]);
			System.out.printf("%-30s",Dates2[i]);
			System.out.println();
		}
		System.out.println("********************************************************************************");
		System.out.println();
	}
	
	public void Sale_copy() {
		System.out.println(        "****************************************TOTAL SALE OF PUBLICATION OF Magazine*******************************");
		System.out.println(        "|           NO OF Magazines SALED:"+flag+"                                                                 |");
		System.out.println(        "|Magazine Name\t\t\tCopies\t\t\tTotal Price");
		for(int j=i;j<flag;j++) {
			System.out.printf(     "|"+(i+1)+"]%-30s ",Empty[i]);
			System.out.printf("%-30s",ccopies[i]);
			System.out.printf("%-30s",pprice[i]);
			System.out.println();
			i++;
		}
		System.out.println(        "|    TOTAL SALE OF = Magazines=" + counter       +"                                                            |");
		System.out.println(        "|_______________________________________+++++++++++++++++++++++++++++++++_____________________________________|");
	}
	
	public void Add_copies() 
	{
    	// Creating the object sc of the Scanner file
		Scanner sc=new Scanner(System.in);
		
		// Taking Input from user
		System.out.print(" >> Enter the Title of Book to add more copies :: ");
		title=sc.next();
		System.out.print(" >> How many copies do you want to add ? = ");
		copies=sc.nextInt();
		
		for(int i=0;i<Title.length;i++) 
		{
			if(Title[i].equalsIgnoreCase(title)) 
			{
				Copies[i]+=copies;
			}
		}	
	}
}

public class  Polymorphism
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Book go=new Book();
		Magazine to=new Magazine();
		int choice;
		while(true) 
		{
			System.out.println("\n \t\t\t\t\t ============== ");
			System.out.println(" \t\t\t\t\t ||  Library || ");
			System.out.println(" \t\t\t\t\t ============== ");
			System.out.println("\n======================================================================================================");
			System.out.print(" >>> Library Menu :- \n\n 1] Book \t\t 2] Magazine \n 3] Exit Library Menu \n\n >> Enter Your Choice :: ");
			choice=sc.nextInt();
			System.out.println("\n======================================================================================================");
			
			switch(choice)
			{
				case 1:
					while(true)
					{
						System.out.println("\n======================================================================================================");
						System.out.print(" >>> Book Menu :- \n\n 1] Our Books \t\t\t\t 2] Select Book to Order \n 3] Total Sale of Publication Book \t 4] Add More copies \n 5] Exit Book Menu \n\n >> Enter Your Choice :: ");
						choice=sc.nextInt();
						System.out.println("\n======================================================================================================");
						
		                // Using switch case for different operations to perform 
						switch(choice) 
						{
							case 1:
								go.Default_Books();
								break;						
							case 2:
								go.Order_copies();
								break;								
							case 3:
								go.Sale_copy();
								break;
							case 4:
								go.Add_copies();
								break;
						}
						if(choice==5)
						{
							System.out.println("\n \t -----> Book Menu Exited Successfully --> ");
							System.out.println("\n======================================================================================================");
							break;
						}
					}
					break;
				case 2:
					while(true) 
					{
						System.out.println("\n======================================================================================================");
						System.out.print(" >>> Magazine Menu :- \n\n 1] Our Magazines \t\t\t\t 2] Select Magazines to Order \n 3] See Current Issue \t\t\t\t 4] See Recieved Issue \n 5] Total Sale of Publication of Magazine \t 6] Add more copies \n 7] Exit Magazine Menu \n\n Enter Your Choice :: ");
						choice=sc.nextInt();
						System.out.println("\n======================================================================================================");
						
						switch(choice) 
						{
							case 1:
								to.Our_Magazines();
								break;
							case 2:
								to.Order_Quantity();
								break;
							case 3:
								to.Current_Issue();
								break;
							case 4:
								to.Recieved_Issue();
								break;
							case 5:
								to.Sale_copy();
								break;
							case 6:
								to.Add_copies();
								break;						
						}
						if(choice==7) 
						{
							System.out.println("\n \t -----> Book Menu Exited Successfully --> ");
							System.out.println("\n======================================================================================================");
							break;
						}
					}
					break;
			}
			if(choice==3) 
			{
				System.out.println("\n \t -----> Library Menu Exited Successfully --> ");
				System.out.println("\n======================================================================================================");
				break;
			}
		}
	}
}
