package practice;
import java.util.*;
public class IfElse
{
	
	
	public static void main(String args[])
	{
		System.out.println("ENTER THE NUMBER:"); 
		while(true)
		{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	        

	          
	    if ((n%2==0))
	    {
	        if((n>2 && n<5)||(n>20) )
	        {
	            System.out.println("not weird");  
	        }
	        else if(n>6 &&n<20)
	            
	          System.out.println("weird");
	        
	     }
	  else 
	    {
	        System.out.println("Weird");
	    }
	    sc.close();
	   		
		}
	      
	 }
	}


