package basic;

public class CompareTo {
	 public int solution(int a, int b) {
	        int answer = 0;
	        String c = Integer.toString(a)+Integer.toString(b);
	        int c1 = Integer.parseInt(c);
	        int c2 = 2*a*b;
	        if(c1>=c2) {
	        	answer = c1;
	        }else if(c1<c2) {
	        	answer = c2;
	        }
	        return answer;
	    }
}
