package Collections;

import java.util.*;

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lt = new ArrayList<>();
		lt.add(289);
		lt.add(567);
		lt.add(658);
		lt.add(912);
		lt.add(505);
	/*	Comparator<Integer> com = new Comparator<Integer>()
				{
			      

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o1%10 > o2%10?1:-1 ;
				}
				};
	*/
		Comparator<Integer> com =(o1,o2)->
		{
			return o1%10 > o2%10?1:-1 ;
		};
		Collections.sort(lt,com);
		for(int i:lt)
			System.out.println(i);

	}

}
