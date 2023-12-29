package baekjoonLevel4;
import java.util.*;
public class Main2675 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List list = new ArrayList<>();
	List list2 = new ArrayList<>();
	int t = sc.nextInt();
	for(int i = 0; i<t; i++) {
		int r = sc.nextInt();
		String s =sc.nextLine();
		list.add(s);
		list2.add(r);
	}
	for(int i = 0 ; i<t; i++) {
		for(int i2 = 0; i2 < (int)list2.get(i); i++) {
			String a= (String)list.get(i);
			String [] b = a.split("");
			System.out.println(b[i]);
		}
	}
	
	
}
}

