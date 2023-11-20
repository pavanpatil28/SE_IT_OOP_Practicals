import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Template<T>
{
    ArrayList<T> list = new ArrayList<T>();

    // Array To Take Data Of T type
    void assign(T[] arr, int n)  //  assign method is declare here..
    {
        list.addAll(Arrays.asList(arr).subList(0, n));
    }

    // Display Array
    void Display_List()      // display method is declare here..
    {
        Iterator<T> itr = list.iterator();
        System.out.print(" \n --> The Elements are :: [ ");

        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println("] \n\n==============================================================\n");
    }

    // Method of Palindrome
    void Check_Palindrome()
    {
        String R,S;
        T temp;
        boolean flag = false;
        Iterator<T> itr = list.iterator();

        //System.out.println("\n Palindrome Integers Are : ");
        int m = 0;

        while(itr.hasNext())
        {
            temp = itr.next();
            S = temp.toString();
            StringBuilder SR = new StringBuilder(S);
            R = SR.reverse().toString();

            if(S.equals(R))
            {
                m++;
                flag = true;
                System.out.println(" --> Palindrome Element is/are :: [ " + temp + " ] ");
            }
        }

        if(!flag)
        {
            System.out.println(" --> Palindrome Not Found ");
        }
        System.out.println("\n --> The Total Number Of Palindrome Elements are  ::  " + m);
        System.out.println("\n==============================================================");
    }

    // Method of Even Odd
    void Count_Even_Odd()
    {
        int even = 0, odd = 0;
        Iterator<T> itr = list.iterator();
        T temp;
        String S;
        int i;
        // double A;

        while(itr.hasNext())
        {
            temp = itr.next();
            S = temp.toString();
            i = Integer.parseInt(S);

            if(i%2 == 0)
            {
                even++;
                System.out.println(" --> Total Even Elements are  ::  [ " + temp + " ]");
            }
            else
            {
                odd++;
                System.out.println(" --> Total Odd Elements are   ::  [ " + temp + " ]");
            }
        }
        System.out.println("\n --> The Total Number of Even Integers are  ::  " + even);
        System.out.println(" --> The Total Number of Odd Integers are   ::  " + odd);
        System.out.println("\n==============================================================");
    }

    // PRIME METHOD
    void Prime_No()
    {
        //boolean flag = false;
        Iterator<T> itr = list.iterator();
        T temp;
        String S;
        int i;
        int m = 0;

        while(itr.hasNext())
        {
            temp = itr.next();
            S = temp.toString();
            i = Integer.parseInt(S);
            int bool = 0;

            for(int x = 2; x<i; x++)
            {
                if(i%x == 0)
                {
                    bool = 1;
                    break;
                }
            }

            if( i == 0 || i == 1)
            {
                System.out.println(" --> Number " + i + " is Not a Prime No. \n");
                break;
            }

            if(bool == 0)
            {
                m++;
                System.out.println(" --> Prime Elements are  ::  [ " + temp + " ] \n");
            }
        }
        System.out.println(" --> The Total Number of Prime Numbers are :: " + m);
    }
}

// Main Class
public class Template_Program
{
    public static void main(String[] args)
    {
        int i,n=0;
        int Choice;
        int choice;
        int ch;
        int chh;

        System.out.println("\t\t================================");
        System.out.println("\t\t||      Template Program      ||");
        System.out.println("\t\t================================");
        Scanner sc =new Scanner(System.in);
        do
        {
            System.out.println("\n==============================================================");
            System.out.println(" >>> Template Menu :- \n");
            System.out.println(" 1] Check For Integer \t 2] Check For Float \n 3] Check For String \t 4] Exit Program \n ");
            System.out.print(" >> Enter Your Choice :: ");
            Choice = sc.nextInt();
            System.out.println("\n==============================================================");

            switch (Choice)
            {
                case 1:
                    System.out.println("\n==============================================================");
                    System.out.println(" >>> Enter the Elements :- ");
                    System.out.print("\n >> Enter the No. Of Elements You Want :: ");
                    n = sc.nextInt();
                    System.out.println();
                    Integer[] a = new Integer[n];

                    for (i = 0; i < n; i++)
                    {
                        System.out.print(" >> Enter The Element At Index Value [" + i + "] :: ");
                        a[i] = sc.nextInt();
                    }
                    System.out.println("\n==============================================================");

                    do
                    {
                        System.out.println("\n==============================================================");
                        System.out.println(" >>> Operation Menu :- \n");
                        System.out.println(" 1] Check Even/Odd Integer \t 2] Check Palindrome \n 3] Check Prime \t\t 4] Exit Menu \n");
                        System.out.print(" >> Choose Which Operation To Perform :: ");
                        ch = sc.nextInt();
                        System.out.println("\n==============================================================");
                        Template<Integer> obj = new Template<Integer>();
                        obj.assign(a,n);
                        obj.Display_List();

                        switch(ch)
                        {
                            case 1:
                                obj.Count_Even_Odd();
                                break;
                            case 2:
                                obj.Check_Palindrome();
                                break;
                            case 3:
                                obj.Prime_No();
                                break;
                            default:
                                System.out.println(" \t -----> Menu Exited Successfully --> ");
                                System.out.println("\n==============================================================");
                                break;
                        }
                    }while(ch!=4 );
                    break;

                case 2:
                    System.out.println("\n==============================================================");
                    System.out.println(" >>> Enter the Elements :- ");
                    System.out.print("\n >> Enter the No. Of Elements You Want :: ");
                    n = sc.nextInt();
                    System.out.println();
                    Float[] b = new Float[n];

                    for(i=0;i<n;i++)
                    {
                        System.out.print(" >> Enter The Element At Index Value [" + i + "] :: ");
                        b[i]=sc.nextFloat();
                    }

                    System.out.println("\n==============================================================");
                    do
                    {
                        System.out.println("\n==============================================================");
                        System.out.println(" >>> Operation Menu :- \n");
                        System.out.println(" 1] Check Palindrome \t 2] Exit Menu \n");
                        System.out.print(" >> Choose Which Operation To Perform :: ");
                        chh = sc.nextInt();
                        System.out.println("\n==============================================================");
                        Template<Float> obj1 = new Template<Float>();
                        obj1.assign(b,n);
                        obj1.Display_List();

                        switch(chh)
                        {
                            case 1 :
                                obj1.Check_Palindrome();
                                break;

                            default:
                                System.out.println(" \t -----> Menu Exited Successfully --> ");
                                System.out.println("\n==============================================================");
                                break;
                        }
                    }while(chh!=2);
                    break;

                case 3:
                    System.out.println("\n==============================================================");
                    System.out.println(" >>> Enter the Elements :- ");
                    System.out.print("\n >> Enter the No. Of Elements You Want :: ");
                    n = sc.nextInt();
                    System.out.println();
                    String[] c = new String[n];

                    for(i=0; i<n; i++)
                    {
                        System.out.print(" >> Enter The Element At Index Value [" + i + "] :: ");
                        c[i]=sc.next();
                    }

                    System.out.println("\n==============================================================");
                    do
                    {
                        System.out.println("\n==============================================================");
                        System.out.println(" >>> Operation Menu :- \n");
                        System.out.println(" 1] Check Palindrome " + " \t 2] Exit Menu \n ");
                        System.out.print(" >> Choose Which Operation To Perform :: ");
                        choice = sc.nextInt();
                        System.out.println("\n==============================================================");
                        Template<String> obj2 = new Template<String>();

                        obj2.assign(c, n);
                        obj2.Display_List();

                        switch(choice)
                        {
                            case 1:
                                obj2.Check_Palindrome();
                                break;
                            default:
                                System.out.println(" \t -----> Menu Exited Successfully --> ");
                                System.out.println("\n==============================================================");
                                break;
                        }
                    }while(choice!=2);
                    break;

                default:
                    System.out.println(" \n \t -----> Program Exited Successfully --> ");
                    System.out.println("\n==============================================================\n\n");
            }
        }while(Choice!=4);

    }
}
