package lab9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Exercise3 
{
	  static Map getSquares(int[] arr)
	  {
	     Map<Integer,Integer> m = new HashMap<Integer,Integer>();
	     for(int i=0;i<arr.length;i++)
	     {
	         m.put(arr[i],arr[i]*arr[i]);
	     }
	      return m;
	  }
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Entyer the Size of Array");
	        int n = sc.nextInt();
	        int[] a = new int[n];
	         for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }
	        Map<Integer,Integer> map = getSquares(a);
	          System.out.println(map);
	    }
	}


