package baekjoonLevel3;
import java.util.*;
public class Main10810 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int basketNum = sc.nextInt();
	int [] basket = new int[basketNum];
	
	int ballinput =sc.nextInt();
	
	
	
	for(int i = 0; i<=ballinput-1; i++) {
		
		int startBasket =sc.nextInt();
		int endBasket =sc.nextInt();
		int ball =sc.nextInt();
		
		for(int i1 = startBasket; i1<=endBasket; i1++) {
			basket[i1-1] = ball;
		}
	}
	for(int a : basket) {
		System.out.print(a + " ");
	}
}
}
