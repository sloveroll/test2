package Ch3;

import java.util.*;

public class P03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int res = 0;

		for (int i = 1; i <= x; i++) {
			res += i;
		}
		System.out.println(res);
	}

}
