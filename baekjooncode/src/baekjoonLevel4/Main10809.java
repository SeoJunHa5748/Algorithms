package baekjoonLevel4;
import java.util.*;
public class Main10809 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] arr = new int [26];
	for(int i = 0; i <=arr.length-1; i++) {
		arr[i] = -1;
	}
	String a = sc.next();
	String [] arr1 = a.split("");
	for (int i = 0; i<=arr1.length-1; i++) {
		int c =(int)(arr1[i].charAt(0)-97);
		if(arr[c]== -1) {
		arr[c] = i;
		}else {
			continue;
		}
		
	}
for(int d : arr) {
	System.out.print(d + " ");
}
}
}
