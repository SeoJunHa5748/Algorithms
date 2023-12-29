package baekjoonLevel4;
import java.util.*;
public class Main11720 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String b = sc.next();
	int c = 0;
	
	for(int i = 0 ; i < a; i++) {
		c += ((int)(b.charAt(i))-48);
	}
	System.out.println(c);		
}
}
