package basic;

public class EvenNumOddNum {
    public int solution(int n) {
        
    	int answer = 0;
        
    	if(n%2 != 0) {
        	
			for (int i = 0; i<=n; i++) {
				
				if(i%2 != 0) {
				answer += i;	
					
				}else {
					
				}
			}
	        	
			
	        
		}else {
			for (int i = 0; i<=n; i++) {
				
				if(i%2 == 0) {
				answer += (int) Math.pow(i, 2);	
					
				}else {
					
				}
			} 	
		
			}
        
        
        return answer;
    }

}
