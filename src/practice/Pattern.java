
package practice;
import java.util.*;
public class Pattern {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		
		for(int i=1;i<=q;i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print( j);
			}
			System.out.println();
		} 
			for(int m=q-1;m>=1;m--)
			{
				for(int n=1;n<=m;n++)
				{
					System.out.print(n);
				}
			System.out.println();
			}
			sc.close();
			}	
}	
				
			
		
		
		
				
			
	
	
		
		

	

