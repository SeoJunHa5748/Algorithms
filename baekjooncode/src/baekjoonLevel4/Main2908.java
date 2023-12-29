package baekjoonLevel4;
import java.util.*;
public class Main2908 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	String b = sc.next();
	int a1 = get(a);
	int a2 = get(b);
	System.out.println(Math.max(a1, a2));
	
	

}

static int get(String c) {
	char[] tmp = {c.charAt(2),c.charAt(1),c.charAt(0)};
	String d = new String(tmp);
	int e = Integer.parseInt(d);
	return e;
	
}
}
