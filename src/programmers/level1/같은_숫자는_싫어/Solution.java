package programmers.level1.같은_숫자는_싫어;

import java.util.ArrayList;


/*
https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(arr[0]);
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1]) {
                intList.add(arr[i]);
            }
        }

        return intList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int arr1[] = { 1, 1, 3, 3, 0, 1, 1 };
        int arr2[] = { 4, 4, 4, 3, 3 };
        System.out.println(solution.solution(arr1));
        System.out.println(solution.solution(arr2));
    }
}
