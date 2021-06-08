package Collections;
import java.util.*;

public class MainSort {
	
	
	    public static void main(String args[])
	    {
	        List<Integer> st = new ArrayList<>();
	        st.add(0);
	        st.add(-1);
	        st.add(1);
	        st.add(0);
	        Collections.sort(st);
	        for(int i:st)
	        {
	            System.out.println(i);
	        }
	    }
	
}
