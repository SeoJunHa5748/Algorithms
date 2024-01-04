package basic;
import java.util.*;
public class StringMultiplication {
	   
	
	public String solution(String my_string, int k) {
	        String answer = "";
	        List<String> arr = new ArrayList<>();
	        for(int i = 0; i<k; i++) {
	    	   arr.add(my_string);
	       }
	       String [] arr2 = arr.toArray(new String[k]);
	       answer = String.join("", arr2);
	        return answer;
	    }
}
