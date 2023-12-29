package baekjoonLevel4;

import java.util.Scanner;

public class Main9086 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int d = sc.nextInt();
	String [] c = new String[d];
	for(int i = 0; i <= d-1; i++) {
		String a = sc.next();	
		c[i] = a;
	}
	
	for(int i = 0; i <= d-1; i++) {
		String [] arr = c[i].split("");
		
		System.out.println(arr[0]+arr[arr.length-1]);
		
	}

}
	}
