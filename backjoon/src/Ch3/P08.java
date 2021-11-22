package Ch3;

import java.util.*;

public class P08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + x + " + " + y + " = " + (x + y));
		}
	}

}
