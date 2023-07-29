import java.lang.*;
import java.util.*;
public class Pattern 
{
    public void sqaure(int n)
    {
        //outer loop for rows
        for(int i=0;i<n;i++)
        {
            //inner loop for columns
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void righttri(int n)
    {
        //outer loop for rows
        for(int i=0;i<n;i++)
        {
            //inner loop for columns
            for(int j=0;j<=i;j++)
            { 
                //prints the star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void invertedtri(int n)
    {
        //inner loop for stars
        for(int i=n-1;i>=0;i--)
        {
            //outer loop for space
            for(int j=0;j<=i;j++)
            {
                //prints space and star
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public void pyramid(int n)
    {       
        //Outer loop work for rows  
        for (int i=0; i<n; i++)   
        {     
            //inner loop work for space      
            for (int j=n-i; j>1; j--)   
            {  
                //prints space between two stars  
                System.out.print(" ");   
            }   
            //inner loop for columns  
            for (int j=0; j<=i; j++)   
            {   
                //prints star      
                System.out.print("* ");   
            }   
            //throws the cursor in a new line after printing each line  
            System.out.println();   
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean c=true;
        while(c)
        {
        System.out.println("MENU: \n 1.Print a Sqaure star pattern \n 2.Print a right triangle pattern star pattern \n 3.Print an Inverted Right Traingle star pattern \n 4.Print a Pyramid star pattern \n 5.Exit\n");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        System.out.println("Enter the number of rows");
        int a=sc.nextInt();
        Pattern ob=new Pattern();
        switch(ch)
        {
            case 1: ob.sqaure(a);
            break;
            case 2:ob.righttri(a);
            break;
            case 3:ob.invertedtri(a);
            break;
            case 4:ob.pyramid(a);
            break;
            case 5: System.exit(0);
            default: System.out.println("Invalid Choice");
        }
    }
    }
}
