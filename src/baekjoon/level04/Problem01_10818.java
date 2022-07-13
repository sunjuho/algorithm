package baekjoon.level04;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem01_10818 {
    public static void main(String[] args) {
        // n개의 정수.
        // min과 max 출력.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        sc.close();
        
		ArrayList<Integer> num = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			num.add(sc.nextInt());
		}
		num.sort(null);
		System.out.println(num.get(0)+" "+num.get((n-1)));
    }
}
