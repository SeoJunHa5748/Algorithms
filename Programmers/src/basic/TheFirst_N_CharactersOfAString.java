package basic;


public class TheFirst_N_CharactersOfAString {
   
	public static String solution(String my_string, int n) {
        String answer = "";
        
        answer = my_string.substring(0, n);
        
        return answer;
    }

public static void main(String[] args) {
	String a=solution("Fsdfds",3);
	System.out.println(a);
}
}
