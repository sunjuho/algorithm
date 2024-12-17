package programmers.level2.기능개발;

import java.util.Stack;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42586
 */
public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();

        int index = 0;
        int cnt = 0;
        for (int day = 1; index < progresses.length; day++) {
            cnt = 0;
            while (index < progresses.length && day * speeds[index] + progresses[index] > 99) {
                cnt++;
                index++;
            }
            if (cnt > 0) {
                stack.add(cnt);
            }

        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] progresses1 = { 93, 30, 55 };
        int[] speeds1 = { 1, 30, 5 };

        int[] progresses2 = { 95, 90, 99, 99, 80, 99 };
        int[] speeds2 = { 1, 1, 1, 1, 1, 1 };

        System.out.println(solution.solution(progresses1, speeds1));
        System.out.println(solution.solution(progresses2, speeds2));
    }
}
