package baekjoonLevel3;
import java.util.*;
public class Main2562 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] arr = new int[9];
	for(int i = 0; i <= arr.length-1; i++) {
		int a = sc.nextInt();
		arr[i] = a;
	}
	int max = arr[0];
	int maxlo =0;
	
	for(int i1 = 0; i1 <= arr.length-1; i1++) {
		if(arr[i1] > max) {
		 max = arr[i1];
		 maxlo =i1;
		}
	}
System.out.println(max);
System.out.println(maxlo +1);
}
}
