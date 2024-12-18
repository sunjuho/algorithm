package programmers.level1.체육복;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */
public class Solution {

    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = Arrays.stream(lost).boxed().sorted().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().sorted().collect(Collectors.toList());

        // 여분이 있는 사람이 도둑맞은 경우 두 리스트에서 제거.
        List<Integer> retainList = new ArrayList<>();
        for (int l : lostList) {
            retainList.add(l);
        }
        retainList.retainAll(reserveList); // 교집합
        lostList.removeAll(retainList);
        reserveList.removeAll(retainList);

        for (int i = lostList.size() - 1; i >= 0; i--) {
            int l = lostList.get(i);
            int lostIndex = lostList.indexOf(l);
            int reserveIndex = 0;
            if (reserveList.contains(l + 1)) {
                reserveIndex = reserveList.indexOf(l + 1);
                lostList.remove(lostIndex);
                reserveList.remove(reserveIndex);
            } else if (reserveList.contains(l - 1)) {
                reserveIndex = reserveList.indexOf(l - 1);
                lostList.remove(lostIndex);
                reserveList.remove(reserveIndex);
            }
        }

        int answer = n - lostList.size();

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n1 = 5;
        int[] lost1 = { 2, 4 };
        int[] reserve1 = { 1, 3, 5 };
        System.out.println(solution.solution(n1, lost1, reserve1));

        int n2 = 5;
        int[] lost2 = { 2, 4 };
        int[] reserve2 = { 3 };
        System.out.println(solution.solution(n2, lost2, reserve2));
    }

}
