package basic;

public class StartN {
	    public static int[] solution(int[] num_list, int n) {
	        int i2 = 0;
	    	int[] answer = {};
	    	answer = new int[num_list.length-n+1];
	        
	    	for(int i = n; i<=num_list.length; i++) {
	        	answer[i2] = num_list[i-1];
	        	i2++;
	        }
	        
	        return answer;
	    }
public static void main(String[] args) {
	int [] arr = {5, 2, 1, 7, 5};
	int [] arr2 = solution(arr,2);
}
}