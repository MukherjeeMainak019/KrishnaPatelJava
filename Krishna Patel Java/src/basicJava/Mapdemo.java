package basicJava;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {

	
	
	public static void map()
	{
		Map <String, Integer> map = new HashMap<String, Integer>();
		
		
		System.out.println(map.put("ID", 1));
		System.out.println(map.put("ID", 2));
		System.out.println(map.put(null, null));
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Mapdemo mapdemo = new Mapdemo();
		Mapdemo.map();

	}

}


// In Map values are stored in (Key and Pair values)
// (ID, 1): ID = Key and 1 = Value