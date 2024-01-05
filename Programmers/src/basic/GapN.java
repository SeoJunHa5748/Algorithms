package basic;

public class GapN {
	public static int[] solution(int[] num_list, int n) {
        int[] answer = {};
        double n2 = n;
        int i2 = 0;
        
        answer = new int[(int)Math.ceil((num_list.length/n2))];
        
        for(int i = 0 ; i<num_list.length; i +=n) {
        	answer[i2] = num_list[i];
        	i2++;
        }
        return answer;
    }
public static void main(String[] args) {
	int [] arr = {4, 2, 6, 1, 7, 6};
	solution(arr,2);
}
}
