package programmers.level1.없는_숫자_더하기;

import java.util.ArrayList;
import java.util.List;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */
public class Solution {
    public int solution(int[] numbers) {
        int[] base = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<Integer> baseList = new ArrayList<>();
        for (int n : base) {
            baseList.add(n);
        }

        List<Integer> numbersList = new ArrayList<>();
        for (int n : numbers) {
            numbersList.add(n);
        }

        baseList.removeAll(numbersList);

        int answer = 0;
        for (int n : baseList) {
            answer += n;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numbers = { 5, 8, 4, 0, 6, 7, 9 };

        System.out.println(solution.solution(numbers));

    }
}
