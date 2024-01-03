package level_2;
import java.util.*;
class Solution {
    public static String solution(String s) {
      String answer = "";   
      int i = 1;
     
      ArrayList<String> arr2 = new ArrayList<>();
			String [] arr3 = {};
			String [] arr = s.split(" ");
		     
			for(String a : arr) {
		     	
				if(a.equals("")) {
		     		arr2.add(a);
		     	}else {
				
		     	char c = Character.toUpperCase(a.charAt(0));
		     	
		     	String d1 = a.toLowerCase();
		     	
		     	String d2 = c + d1.substring(1);
		     	
		     	arr2.add(d2);
		     	
		     	
		     	}
		     
			}

			for(;;) {
				if(s.charAt(s.length()-i) ==  ' ') {
					arr2.add("");
					i++;
				}else {
					i = 0;
					break;
				}	
			}
			
			arr3 = arr2.toArray(new String[arr2.size()]);
			answer = String.join(" ", arr3);
			
		 
	        return answer;
    }

    
   public static void main(String[] args) {
	  String answer = Solution.solution("for the what 1wha        t     ");
	System.out.println(answer);
    
    
	
}
}