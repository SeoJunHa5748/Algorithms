package level_2;
import java.util.*;
public class Solution_notsolve {
	  public static int solution(int[] elements) {
	        int answer = 0;
	       int a =0;
	        Set<Integer> arr = new HashSet<>();
	       

	     
	        
	        
	        for(int i = 0; i<=elements.length; i++) {
	        	 
	        for(int i2 = 0; i2<=elements.length; i2++) {
	        		 
	        for(int i3 = 0; i3<=i2; i3++) {
	        	a =+elements[i2%elements.length];
	        		arr.add(a);
	        	}
	        	 if(i2%elements.length == 0) {
	        		i2=0;
	        	}
	        	}
	        }
	  
	        
	        
	        
	        
	        
	        
//	        elements[0];  
//	        elements[1]; 
//	        elements[2];
//	        elements[3];  
//	        elements[4];
//	       
//	        elements[0]+elements[1];  
//	        elements[1]+elements[2];  
//	        elements[2]+elements[3];  
//	        elements[3]+elements[4];  
//	        elements[4]+elements[0];  
//	        
//	        
//	        elements[0]+elements[1]+elements[2];  
//	        elements[1]+elements[2]+elements[3];  
//	        elements[2]+elements[3]+elements[4];  
//	        elements[3]+elements[4]+elements[0];  
//	        elements[4]+elements[0]+elements[1];
//	        
//	        elements[0]+elements[1]+elements[2]+elements[3];  
//	        elements[1]+elements[2]+elements[3]+elements[4];  
//	        elements[2]+elements[3]+elements[4]+elements[0];  
//	        elements[3]+elements[4]+elements[0]+elements[1];  
//	        elements[4]+elements[0]+elements[1]+elements[2];
//	        
//	        
//	        
//	        elements[0]+elements[1]+elements[2]+elements[3]+elements[4];  
	       
	        
	        return answer;
	    }
	
public static void main(String[] args) {
	int [] d = {7, 9, 1, 1, 4};
	solution(d);
}
}

