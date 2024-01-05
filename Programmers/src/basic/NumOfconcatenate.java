package basic;

public class NumOfconcatenate {
	public int solution(int[] num_list) {
        StringBuilder br = new StringBuilder();
        StringBuilder br2 = new StringBuilder();    
		int answer = 0;
		for(int a : num_list) {
			if(a%2 ==0) {
				br.append(Integer.toString(a));  
			}else {
				br2.append(Integer.toString(a));
			}
		}
        String a =br.toString();
        String b =br2.toString();
        answer = Integer.parseInt(a)+Integer.parseInt(b);
        
        return answer;
    }
}
