package baekjoon.level03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem13_10951 {
    public static void main(String[] args) {
        // 줄마다 다 입력을 받아서 줄마다 따로 저장 후 줄마다 출력?

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		try {
			while (true) {
				st = new StringTokenizer(br.readLine(), " ");

				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				System.out.println(a + b);
			}
		} catch (NullPointerException e) {
			System.exit(0);
		} catch (Exception e) {
			e.toString();
		}
    }
}
