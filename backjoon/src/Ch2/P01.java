package Ch2;

import java.util.*;

public class P01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(i > j) {
			System.out.println(">");
		}
		
		if(i < j) {
			System.out.println("<");
		}
		
		if(i == j) {
			System.out.println("==");
		}
			
	}

}
