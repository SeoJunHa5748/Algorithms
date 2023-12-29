package baekjoonLevel1;
import java.util.*;
public class Main1008 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	int A;
	int B;
	
	while(true){
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A > 0 && B < 10) {
			break;
		
		}else {
			continue;
		}
	}

	System.out.println((double) A/B);
}
}
