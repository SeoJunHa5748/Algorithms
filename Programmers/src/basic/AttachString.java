package basic;

public class AttachString {
	  
	public static String solution(String my_string, int[] index_list) {

			String answer = "";
	        
			StringBuilder br = new StringBuilder();
	        
	        for(int a : index_list) {
	        	br.append(my_string.charAt(a));
	        }
	        answer = br.toString();
	        return answer;
	    }
public static void main(String[] args) {
	int [] arr = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
	solution("cvsgiorszzzmrpaqpe",arr);
}
}
