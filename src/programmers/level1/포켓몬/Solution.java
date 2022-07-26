package programmers.level1.포켓몬;

import java.util.stream.IntStream;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
public class Solution {
    public int solution(int[] nums) {
        int[] distinctNums = IntStream.of(nums).distinct().toArray();

        return Math.min(distinctNums.length, nums.length / 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = { 3, 1, 2, 3 };

        System.out.println(solution.solution(nums));
    }
}
