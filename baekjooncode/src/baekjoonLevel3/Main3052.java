package baekjoonLevel3;
import java.util.*;
public class Main3052 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	for(int i = 0; i<10; i++) {
		int b = sc.nextInt();
		arr[i] = b%42;
	}
	
	int c =  1;
	
	Arrays.sort(arr);
	
	for(int d : arr) {
		System.out.println(d);
	}
	int result = arr[0];
	for(int a  = 1; a <= arr.length-1; a++) {
		
		if(result != arr[a]) {
			c++;
			
		if (arr[a] == arr[a-1]) {
			c--;	
		}
		
		}
	}
	
System.out.println(c);
}
}
