// Importing the Classes to use in the Program
import java.io.*;
import java.io.File;
import java.util.*;

public class File_Handling
{
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void addRecords() throws IOException
	{
		// Create or Modify a file for Database
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("records.txt", true)));
		String studentname, address, student_id, s, Class;;
		int roll_no;
		float marks;

		boolean addMore = false;

		do		{
			System.out.println("\n==============================================================");
			System.out.println(" >>> Enter Student Details :- ");
			// Read Data
			System.out.print("\n >> Enter Student Name  :: ");
			studentname = br.readLine();
			System.out.print("\n >> Student Id          :: ");
			student_id = br.readLine();
			System.out.print("\n >> Student Roll No     :: ");
			roll_no = Integer.parseInt(br.readLine());
			System.out.print("\n >> Student Address     :: ");
			address = br.readLine();
			System.out.print("\n >> Student Class       :: ");
			Class = br.readLine();
			System.out.print("\n >> Student Marks       :: ");
			marks = Float.parseFloat(br.readLine());

			// Print to File
			pw.println(studentname + "\t" + student_id + "\t" + roll_no + "\t" + address + "\t" + Class + "\t" + marks);
			System.out.println("\n==============================================================");
			System.out.println("\n==============================================================");
			System.out.print("\n --> Records Added Successfully ! \n \n >> Do You Want To Add More Records ? ( y / n ) :: ");

			s = br.readLine();
			if (s.equalsIgnoreCase("y"))
			{
				addMore = true;
				System.out.println();
			}
			else
			{
				addMore = false;
			}
		} while (addMore);
		System.out.println("\n==============================================================\n");
		pw.close();
		showMenu();

	}

	public void readRecords() throws IOException
	{
		System.out.println();
		try
		{
			// Open the file
			BufferedReader file = new BufferedReader(new FileReader("records.txt"));
			String name;

			// Read records from the file
			while ((name = file.readLine()) != null)
			{
				System.out.println(name);
				System.out.println(" ");
			}
			file.close();
			showMenu();

		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nERROR : File not Found !!!");
		}

	}

	public void searchRecords() throws IOException
	{
		System.out.println("\n==============================================================\n");
		try
		{
			// Open the file and search a record
			BufferedReader file = new BufferedReader(new FileReader("records.txt"));
			
			String name;
			int flag = 0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" >> Enter Id of the Student You Want To Search :: ");
			String searchname = sc.nextLine();
			
			// Read records from the file
			while ((name = file.readLine()) != null)
			{
				String[] line = name.split("\t");// used to match a string
				//System.out.println(line[0]);
				if (searchname.equalsIgnoreCase(line[1]))
				{
					System.out.println("\n --> Record Found \n");
					System.out.println(name);
					System.out.println("\t");
					flag = 1;
					break;
				}
			}

			if (flag == 0)
			{
				System.out.println("\n --> Record Not Found \n");
			}
			file.close();
			System.out.println("\n==============================================================\n");
			showMenu();

		}

		catch (FileNotFoundException e)
		{
			System.out.println("\n --> ERROR : File not Found !!! \n");
			System.out.println("\n==============================================================\n");
		}

	}

	public void deleteRecords() throws IOException
	{
		System.out.println("\n==============================================================\n");
		try
		{
			// Open the file
			BufferedReader file1 = new BufferedReader(new FileReader("records.txt"));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("records_update.txt", true)));

			String name;
			int flag=0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name of the student you want to delete: ");
			String searchname = sc.nextLine();
			
			// Read records from the file
			while((name = file1.readLine()) != null)
			{
				String[] line = name.split(" ");
				//System.out.println(line[0]);
				if(!searchname.equalsIgnoreCase(line[0]))
				{
					pw.println(name);
					flag=0;
				}
				else
				{
					System.out.println("Record found");
					flag=1;
				}
			}
			file1.close();
			pw.close();
			
			File delName = new File("records.txt");
			File oldName = new File("records_update.txt");
			File newName = new File("records.txt");
			
			if(delName.delete())
				System.out.println("deleted successfully");
			else
				System.out.println("Error");
			if (oldName.renameTo(newName))
				System.out.println("Renamed successfully");
			else
				System.out.println("Error");
			showMenu();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("\nERROR : File not Found !!!");
			System.out.println("\n==============================================================\n");
		}
	}

	public void updateRecords() throws IOException
	{
		System.out.println("\n==============================================================\n");
		try
		{
			// Open the file
			BufferedReader file1 = new BufferedReader(new FileReader("records.txt"));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("records_update.txt", true)));
			String name;
			int flag = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the name of the student you want to update: ");
			String searchname = sc.nextLine();

			// Read records from the file
			while ((name = file1.readLine()) != null)
			{

				String[] line = name.split("\t");
				//System.out.println(line[0]);
				if (!searchname.equalsIgnoreCase(line[0]))
				{
					pw.println(name);
					flag = 0;
				}

				else
				{
					System.out.println(" --> Record found");
					System.out.println(" --> Enter updated marks:");
					String up_mark = sc.nextLine();
					pw.println(line[0] + "\t" + line[1] + "\t" + line[2] + "\t" + line[3] + "\t" + line[4] + "\t" + up_mark);
					flag = 1;
				}
			}
			file1.close();
			pw.close();

			File delName = new File("records.txt");
			File oldName = new File("records_update.txt");
			File newName = new File("records.txt");

			if (delName.delete())
			{
				System.out.println("record updated successfully");
			}

			else
			{
				System.out.println("Error");
			}

			if (oldName.renameTo(newName))
			{
				System.out.println("Renamed successfully");
			}

			else
			{
				System.out.println("Error");
			}
			System.out.println("\n==============================================================\n");
			showMenu();
		}

		catch (FileNotFoundException e)
		{
			System.out.println("\nERROR : File not Found !!!");
			System.out.println("\n==============================================================\n");
		}
	}

	public void clear(String filename) throws IOException
	{
		// Create a blank file
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
		pw.close();
		System.out.println("\n --> All Records Cleared Successfully ! \n");

		for (int i = 0; i < 999999999; i++); 	// Wait for some time

		System.out.println("\n==============================================================\n");
		showMenu();
	}

	public void showMenu() throws IOException
	{
		System.out.println("==============================================================");

		System.out.println(" >>> File Handling Menu :- \n");
		System.out.print(" 1] Add Records \t\t\t 2] Display Records \n 3] Clear All Records \t 4] Search Records \n 5] Delete Records \t\t 6] Update Records \n 7] Exit Program \n\n >> Enter Your Choice :: ");

		int choice = Integer.parseInt(br.readLine());
		System.out.println("\n==============================================================");

		switch (choice)
		{
			case 1:
				addRecords();
				break;
			case 2:
				readRecords();
				break;
			case 3:
				clear("records.txt");
				break;
			case 4:
				searchRecords();
				break;
			case 5:
				deleteRecords();
				break;
			case 6:
				updateRecords();
				break;
			case 7:
				System.out.println("\n==============================================================\n\n");
				System.out.println(" \n \t -----> Program Exited Successfully --> ");
				System.exit(0);
				break;
				
			default:
				System.out.println("\n --> Invalid Choice !");
				break;
				
		}
	}

	public static void main(String args[]) throws IOException
	{
		System.out.println("\n\t\t=====================================");
		System.out.println("\t\t||      File Handling Program      ||");
		System.out.println("\t\t=====================================\n\n");
		File_Handling call = new File_Handling();
		call.showMenu();
	}

}