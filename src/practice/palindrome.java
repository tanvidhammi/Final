/*package practice;
import java.util.*;
import java.io.*;
public class palindrome
{
	 public static void main(String[] args) throws IOException
     {
         String ch;
         Scanner br = new Scanner(System.in);
         System.out.print("Enter the word:");
         ch=br.nextLine();//Line();
         int count=0,len=0;
         do
         {
             char arr[]=ch.toCharArray();
             len=arr.length;
             count=0;
             for(int j=0;j<len;j++)
             {
                 if((arr[0]== arr[j])&&((arr[0]>=65&&arr[0]<=90)||(arr[0]>=97&&arr[0]<=122)))
                 count++;
             }
               
             if(count!=0)
                 System.out.println(arr[0] + " " + count);
                 ch = ch.replace("" + arr[0], "");
                     
         }
         while(len!=1);
         br.close();
        
     }

}*/
