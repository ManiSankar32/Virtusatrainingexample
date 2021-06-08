package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx {
    
	public static Map<Integer,String> Students(Map<Integer,String> map){
		
		map.put(1,"Mani");
		map.put(2, "Venkat");
		map.put(3,"seshu");
		map.put(4,"sai");
		map.put(5, "siva");
		return map;
	}
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<Integer,String>();
	  Students(map);
	  for(int i:map.keySet()) {
		  System.out.println(i+" "+map.get(i));
	  }
	}
}
