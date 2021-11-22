package Ch4;

import java.util.Scanner;

public class P03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = 0;
		int c = 0;
		int z = 0;
		int count = 0;
		
		if (a < 10) {
			a *= 10;
		}
		
		int y = a;
		while (true) {
			b = y / 10;
			c = y % 10;
			z = c * 10 + ((b + c) % 10);
			y = z;
			count++;

			if (a == z) {
				System.out.println(count);
				break;
			}

		}

	}

}
