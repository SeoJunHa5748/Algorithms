package baekjoonLevel3;


import java.util.Scanner;

public class Main10811 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int basketNum = sc.nextInt();
		int ballinput =sc.nextInt();
		
		int [] basket = new int[basketNum];
		
		for(int i2 = 0; i2 <=basket.length-1; i2++) {
			basket[i2] = i2+1;
		}
		
		
		
		
		
		for(int i = 0; i<=ballinput-1; i++) {
			int startBasket =sc.nextInt()-1;
			int endBasket =sc.nextInt()-1;
			
			while(true){
				int tmp = 0;
				tmp = basket[startBasket];
				basket[startBasket] = basket[endBasket];
				basket[endBasket] = tmp;
				
				startBasket++;
				endBasket--;
				
				if(startBasket>=endBasket) {
					
					break;
				}
			}
			
			
		}
		for(int a : basket) {
			System.out.print(a + " ");
		}
	}
	}


