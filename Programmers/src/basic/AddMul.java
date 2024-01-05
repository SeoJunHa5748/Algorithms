package basic;

public class AddMul {
	public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
		int answer = 0;
        for(int a : num_list) {
        
        	sum += a;
        }
        
        for(int a : num_list) {
        	mul *= a;
        }
        answer = mul < sum*sum ? 1 : 0;
         return answer;
    }
}
