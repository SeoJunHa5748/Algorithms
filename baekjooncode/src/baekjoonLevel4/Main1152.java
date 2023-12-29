package baekjoonLevel4;
import java.util.*;
public class Main1152 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	String [] arr = a.split(" ");
	
	try {
	if(arr[0] =="") {
	System.out.println(arr.length-1);

	}else {
	System.out.println(arr.length);
	}
	
	}catch(Exception e) {
		System.out.println(arr.length);
	}
	
}}