package baekjoonLevel3;
import java.util.*;
public class Main5597 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] arr = new int[30];
	int c = 0;
	for (int i = 0; i <arr.length -2; i++) {
		int a = sc.nextInt();
		arr[a-1] +=1;
	}
	for(int b : arr) {
		c++;
		if(b==0) {
			System.out.println(c);
		}
	}

}
}
