package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Pakistan");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("USA: " + countries.getCountry("USA"));
        int sum=0;
		for(int i:countries.get10())
		   sum=sum+i;
		System.out.println(sum);

	}

}
class Country {
	
	HashSet<String> H1 = new HashSet<>();
	
	public HashSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
	 public static HashSet<Integer> get10() {
		 HashSet<Integer>  set = new HashSet<Integer>();
		 for(int i = 1;i<=10;i++) {
			 set.add(i);
		 }
		 return set;
	 }
}
