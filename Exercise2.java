package lab9;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Exercise2 
{

	
	   static Map countCharacter(char[] ch)
	   {
		    Map<Character,Integer> m = new HashMap<Character,Integer>();
		    
		    int len =ch.length;
		    int[] dup=new int[len];
		    for(int i=0;i<len;i++)
		    {
		        dup[i]=0;
		    }
		    int count=1;
		    for(int i=0;i<len;i++)
		    {
		        if(dup[i]==0)
		        {
		            for(int j=i+1;j<len;j++)
		            {
		                if(ch[i]==ch[j])
		                {
		                  count++;
		                  dup[j]=1;
		                }
		            }
		            m.put(ch[i], count);
		            count=1;
		        }
		    }
	      return m;
	        
	    }  
	    
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of array"); 
	    int n = sc.nextInt();
	    char[] ch = new char[n];
	      for(int i=0;i<n;i++){
	        ch[i] = sc.next().charAt(0);  
	      }

	      Map<Character,Integer> map = countCharacter(ch);
	      
	      System.out.println(map);
	  }
	}


