package baekjoon.level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/10872

0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 */
public class Problem01_10872 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(factorial(Integer.parseInt(br.readLine())));
    }

    static int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        }
        return 1;
    }
}
