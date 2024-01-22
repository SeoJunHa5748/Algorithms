package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheLastTwoElements {
	
	
	public static int[] solution(int[] num_list) {
        
		int[] answer = {};
        answer = new int [num_list.length+1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        
        if(num_list[num_list.length-1] - num_list[num_list.length-2] > 0  ) {
        	answer[num_list.length]	= num_list[num_list.length-1] - num_list[num_list.length-2];
        }else {
        	answer[num_list.length]	= num_list[num_list.length-1] *2;
        }
        return answer;
    }
public static void main(String[] args) throws IOException{
	int [] a = {5,41,85,1,1,58,1,51,1};
	int [] answer =solution(a);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char [] arr = {'f','s','s'};
	int aa = br.read(arr);
	System.out.println(aa);
	for(int b : answer) {
		System.out.println(b);
	
	
	}
}
}



