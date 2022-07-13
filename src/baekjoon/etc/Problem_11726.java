package baekjoon.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11726 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int a = 1;
		int b = 2;
		int sum = 3;
		int n = Integer.parseInt(br.readLine());
        
		if (n < 3) {
			System.out.println(n);
		} else {
            for (int i = 3; i < n; i++) {
                a = b;
				b = sum;
				sum = (a + b)%10007;
                //여기서 나누지 않고 출력문에서 나누려고 할 경우, int sum에서 오버플로가 발생해서 값이 이상해짐.
			}
			System.out.println(sum);
		}
    }
}
