package baekjoon.level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem04_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");

		
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				String result = Integer.toString((a + b));
				bw.write(result + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
    }
}
