package baekjoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_2446 {

	public static void main(String[] args) throws NumberFormatException, IOException {
        // 첫째줄부터 2n-1번째 줄까지 출력.

        // i는 줄. j는 칸.
        // i<=n번째 줄. 
        // (j<i)인 동안 공백.  i+j>2n일 때  줄바꿈.

        // i>n번째 줄
        // (i+j < 2n)인 동안 공백. j<=i인 동안 출력. J > i일 때 줄바꿈.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		// 2n-1개의 줄.
		for (int i = 1; i <= ((2 * n) - 1); i++) {
			// n번째 줄까지는.
			if (i <= n) {
				for (int j = 1; j <= ((2 * n) - 1); j++) {
					if (j < i) {
						System.out.print(" ");
					} else if ((i + j) > (2 * n))
						break;
					else
						System.out.print("*");
				}
			}

			if (i > n) {
				for (int j = 1; j <= ((2 * n) - 1); j++) {
					if (j + i < (2 * n)) {
						System.out.print(" ");
					} else if (j > i)
						break;
					else
						System.out.print("*");
				}
			}
			if (i<((2*n)-1)) {
			    System.out.println();
            }
		}
		br.close();
	}

}
