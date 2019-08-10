package lab9;
import java.util.*;

public class Exercise1 
{
	static List getValue(HashMap<Integer,String> hm)
	{
		List<String> l=new ArrayList <String>();
		Set <Integer> s=hm.keySet();
		for(Integer i: s)
		{
			l.add(hm.get(i));
		}
		Collections.sort(l);
		return l;
	}
	
	public static void main(String args[])
	{
		HashMap <Integer,String> hash=new HashMap <Integer,String>();
		hash.put(0, "Hrishikesh");
		hash.put(1,"Mandeep");
		hash.put(2, "Abhi");
		List <String>list=new ArrayList<String>();
		list=getValue(hash);
		System.out.println(list);
	}

}
