package baekjoonLevel3;
import java.util.*;
public class Main1546 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	double total =0;
	int[] arr = new int[a];
	
	for(int i = 0; i<=arr.length-1; i++) {
		int b = sc.nextInt();
		arr[i] =b;
	}
	int max = arr[0];
	for(int i = 0; i<=arr.length-1; i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	for(double c : arr) {
		double d = c/max*100;
		
		total += d;
		}
	
	System.out.println(total/a);
}
}
