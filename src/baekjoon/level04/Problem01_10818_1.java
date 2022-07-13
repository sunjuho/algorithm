package baekjoon.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem01_10818_1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String n = br.readLine();
		StringTokenizer st = new StringTokenizer(n, " ");
		int max = -1000000; // 비교해서 최댓값이 담길 수.
		int min = 1000000; // 비교해서 최솟값이 담길 수.

		for (int i = 0; i < num; i++) {
			if (st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				if (max < a)
					max = a;
				if (min > a)
					min = a;
			}

		}
		System.out.println(min + " " + max);
    }
}
