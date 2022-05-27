package basicJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Collections {

	
	public static void listexamples()
	{
		
		List<String> list1 = new ArrayList<String>();
		
		HashSet set=new HashSet();
		
		set.add(10);
		set.add(12);
		set.add(22);
		set.add(22);
		set.add(22);
		set.add(221);
		set.add(21);
		set.add("");
		
	
		System.out.println(set);
	}
	
	
		
	
	
	
	
	public static void main(String[] args) {
		listexamples();

		
		

	}

}
