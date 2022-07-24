package programmers.level1.소수_만들기;

import java.util.Arrays;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12977
 */
public class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // 1 ~ 1000까지의 중복되지 않는 3개의 원소로 만들 수 있는 최댓값 2997.
        boolean[] isPrime = new boolean[2998];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i < 2997; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < 2997; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 배열의 원소를 더하면서 소수이면 result++;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int j2 = j + 1; j2 < nums.length; j2++) {
                    if (isPrime[nums[i] + nums[j] + nums[j2]]) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = { 1, 2, 7, 6, 4 };

        System.out.println(solution.solution(nums));

    }
}
