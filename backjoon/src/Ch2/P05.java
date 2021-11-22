package Ch2;

import java.util.*;

public class P05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x == 0) {
			if (y < 45) {
				System.out.println(23 + " " + (60 + y - 45));
			} else if (y >= 45) {
				System.out.println(x + " " + (y - 45));
			}

		} else {
			if (y < 45) {
				System.out.println((x - 1) + " " + (60 + y - 45));
			} else if (y >= 45) {

				System.out.println(x + " " + (y - 45));
			}
		}
	}

}
