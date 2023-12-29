package baekjoonLevel5;
import java.util.*;
public class Main3003 {
public static void main(String[] args) {
	int [] arr = {1,1,2,2,2,8};
	int[] arr2 = new int[6];
	Scanner sc = new Scanner(System.in);
	
	for(int i = 0; i<arr2.length;i++) {
		int a = sc.nextInt();
		arr2[i] =a;
	}
			
	for(int i = 0; i<arr.length; i++) {
		
		int b = arr[i] - arr2[i];
		
		System.out.print(b+" ");
	}
}
}
