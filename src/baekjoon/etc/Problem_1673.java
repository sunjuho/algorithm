package baekjoon.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1673 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		try {
			while (true) {

				st = new StringTokenizer(br.readLine(), " ");

				int eatenChicken = Integer.parseInt(st.nextToken()); // 100
				int needed = Integer.parseInt(st.nextToken()); // 3

				int haveDojang = eatenChicken; // 100

				while (haveDojang >= needed) {

					eatenChicken += (haveDojang / needed);
					haveDojang = (haveDojang / needed) + (haveDojang % needed);

				}
				System.out.println(eatenChicken);

			}

		} catch (NullPointerException e) {
			// br.readLine()에 입력값이 없으면, 윈도우에서 Ctrl+z로 지정.
			System.exit(0);
		} catch (Exception e) {
			e.toString();

		}
    }
}
