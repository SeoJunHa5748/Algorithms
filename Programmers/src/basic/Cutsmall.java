package basic;

import java.util.Arrays;



public class Cutsmall {
    public static int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        System.arraycopy(num_list, 5, answer, 0, num_list.length-5);
        
        return answer;
    }
public static void main(String[] args) {
	int [] arr = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
	solution(arr);
}
}
