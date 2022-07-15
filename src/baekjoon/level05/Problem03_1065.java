package baekjoon.level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
https://www.acmicpc.net/problem/1065

어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 */
public class Problem03_1065 {
    public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

        if (num == 1000) {
            num--;
        } 

        if ( num < 100){
            System.out.println(num);

        } else{           

            int[] arr = new int[3];
            int cnt = 99;
            
            for (int i = 100; i <= num; i++) {
                int n = i;
                for (int j = 0; j < 3; j++) {
                    arr[j] = n % 10;
                    n /=10;
                }

                if(arr[2] - arr[1] == arr[1] - arr[0]){
                        cnt++;
                    }
            }
            System.out.println(cnt);;

        }   
        
    }

}
