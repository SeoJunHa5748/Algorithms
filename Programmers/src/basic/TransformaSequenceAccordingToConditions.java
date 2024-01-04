package basic;
import java.util.*;
public class TransformaSequenceAccordingToConditions {
	
	public static int[] solution(int[] arr, int k) {
	        
		int[] answer = {};
		answer = new int[arr.length];
	        
		if(k%2 == 0) {
	        	
			for(int i = 0; i<arr.length; i++) {
	        		int a1 =arr[i]+k;
	        		answer[i] =a1;
	        	
			}
	        
		}else {
	        	
			for(int i = 0; i<arr.length; i++) {
	        		int a1 =arr[i]*k;
	        		answer[i] =a1;
	        	
			}
	        
		}
	        return answer;
	    }
public static void main(String[] args) {
	int [] a = {1,2,3,4,5};
	solution(a,7);
}
}

