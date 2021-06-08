package Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsEx1 {
	 public static List get10() {
		 List numlist = new ArrayList();
		 for(int i=0;i<=10;i++) {
			 numlist.add(i);
		 }
		 return numlist;
	 }
	 @SuppressWarnings("unchecked")
	public static List getCountryList(String c1,String c2,String c3,String c4,String c5) {
		List countrylist = new ArrayList();
		 countrylist.add(c1);
		 countrylist.add(c2);
		 countrylist.add(c3);
		 countrylist.add(c4);
		 countrylist.add(c5);
		 return countrylist;
	 }
	 @SuppressWarnings("unchecked")
	public static List get15(List numlist) {
		 List numlist2 = new ArrayList();
		 numlist2.addAll(numlist);
		 for(int i=11;i<=15;i++) {
			 numlist2.add(i);
		 }
		 return numlist2;
	 }
		public static void main(String[] args) {
		
			System.out.println(get10());
			System.out.println(getCountryList("India","England","Srilanka","SouthAfrica","Australia"));
			System.out.println(get15(get10()));
		}
	}
	
 