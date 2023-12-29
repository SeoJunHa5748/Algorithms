package baekjoonLevel1;
import java.util.*;
public class Main2558 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	String B1 =Integer.toString(B);
	
	int a1 = A * (B1.charAt(2)-48);
	int a2 = A * (B1.charAt(1)-48);
	int a3 = A * (B1.charAt(0)-48);
	int a4  = (a1 +  (a2*10) + (a3*100));

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		
}}



