package programmers.level2.올바른_괄호;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12909
 */
public class Solution {
    boolean solution(String s) {
        int stack = 0;
        for (String c : s.split("")) {
            if (c.equals("(")) {
                stack++;
            } else {
                stack--;
            }
            if (stack < 0) {
                return false;
            }
        }

        return stack == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        System.out.println(solution.solution(s1));
        System.out.println(solution.solution(s2));
        System.out.println(solution.solution(s3));
        System.out.println(solution.solution(s4));

    }
}
