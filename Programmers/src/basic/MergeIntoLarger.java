package basic;

public class MergeIntoLarger {
	    
	
	public int solution(int a, int b) {
	        int answer = 0;
	       String c = Integer.toString(a);
	       String d = Integer.toString(b);
	       int a1 = Integer.parseInt(c+d);
	       int b1 = Integer.parseInt(d+c);
	       
	       answer =Math.max(a1, b1);
	        return answer;
	    }
}
