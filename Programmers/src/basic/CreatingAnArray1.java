package basic;

import java.util.ArrayList;
import java.util.List;

public class CreatingAnArray1 {
	  
	public int[] solution(int n, int k) {
	        int[] answer = {};
	        
	        List<Integer> a = new ArrayList<>();
	        
	        for(int i = 0; i<n; i++) {
	        	if (i%k == 0 ) {
	        	a.add(i);		        	}
	        }
	        
	        return answer;
	    }
}
