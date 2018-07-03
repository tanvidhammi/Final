package practice;
import java.util.*;

public class Table {

     public static void main(String args[])
     {
    	 System.out.println("ENTER THE VALUE :");
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int n=1;
       
       for(n=1;n<=20;n++)
     {
    	 System.out.println(t + "*" +n+ "=" +n*t);
     }
     sc.close();
     }
}

	
	

