package baekjoon.level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/11653

정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 */
public class Problem03_11653 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int i = 2;
        while (i <= num) {

            if (num % i == 0) {
                System.out.println(i);
                num /= i;
            } else {
                i++;
            }
        }
    }

}
