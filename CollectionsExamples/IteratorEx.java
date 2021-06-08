package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class IteratorEx {
	public static Set<String> getCountryList(String c1,String c2,String c3,String c4,String c5) {
		Set<String> countrylist = new HashSet();
		 countrylist.add(c1);
		 countrylist.add(c2);
		 countrylist.add(c3);
		 countrylist.add(c4);
		 countrylist.add(c5);
		 return countrylist;
	 }
  public static void main(String args[]) {
	  Set<String> countrySet = getCountryList("India","England","Srilanka","SouthAfrica","Australia");
      Iterator<String> iter = countrySet.iterator();
      while(iter.hasNext()) {
    	  String str = iter.next();
    	  System.out.println(str);
      }
  }
  
}
