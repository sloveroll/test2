package Ch3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.valueOf(br.readLine().trim());

		for (int i = 0; i < n; i++) {
			String text = br.readLine();
			String[] word = text.split(" ");
			int a = Integer.valueOf(word[0]);
			int b = Integer.valueOf(word[1]);
			bw.write((a + b) + "\n");
		}

		bw.flush();
		bw.close();
	}

}
