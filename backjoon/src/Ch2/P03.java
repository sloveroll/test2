package Ch2;

import java.util.*;

public class P03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();

		if (i % 400 == 0) {
			System.out.println(1);
		} else if (i % 4 == 0 && !(i % 100 == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
