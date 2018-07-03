package practice;
import java.util.*;

public class Name2 
{

	public static void main(String[] args)// throws Exception
	{
		 
			 //while(true)
		Scanner sc= new Scanner(System.in);
			    try { 
				
		        int myInt = Integer.parseInt(sc.next());
		        String st =sc.next();
		        double db = sc.nextDouble();
		        
		        System.out.println("integer is:" + myInt);
		        System.out.println("String is:"+st+"");
		        System.out.println("double is:"+db+"");
		        }
		        catch(NoSuchElementException e)
		        {
		        	System.out.print(e);
		        }
		        finally {
		        sc.close();
 
		        }

    }
}


	
/*
package practice;
import java.util.*;
public class Demo3 {
  
	
    public static void main(String[] args) {
    	System.out.println("ENTER VALUES");
    
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        scan.nextLine();
        String st=scan.nextLine();
        int b=scan.nextInt();
        
        System.out.println(a);
        System.out.println(st);
        System.out.println(b);
        scan.close();
       
    }
}

*/
