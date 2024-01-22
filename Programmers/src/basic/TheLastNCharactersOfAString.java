package basic;

public class TheLastNCharactersOfAString {
	 
	public String solution(String my_string, int n) {
	        
			StringBuilder a = new StringBuilder();
	        
	        for(int i = my_string.length()-1; i>=my_string.length()-n-1; i--) {
	        	a.append(my_string.charAt(i));
	        }
		
			String answer = "";
	        a.reverse();
			answer = a.toString();
			return answer;
	    }
}
