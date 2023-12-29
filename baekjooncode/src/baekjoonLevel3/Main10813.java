package baekjoonLevel3;

import java.util.Scanner;

public class Main10813 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int basketNum = sc.nextInt();
	int ballchange =sc.nextInt();
	
	int [] basket = new int[basketNum];
	
	for(int i1 = 0 ; i1<= basket.length -1; i1++) {
		
		basket[i1] = i1+1;
	}
	
	
	
	for(int i = 0; i<=ballchange-1; i++) {
		int tmp = 0;
		int firstBasket =sc.nextInt()-1;
		int endBasket =sc.nextInt()-1;
		
		tmp = basket[firstBasket];
		basket[firstBasket] = basket[endBasket];
		basket[endBasket] = tmp;
		
		}
	for(int a : basket) {
		System.out.print(a + " ");
	}
}
}



