package programmers.level1.신고_결과_받기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/92334
 */
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        // 결과 맵 초기화
        HashMap<String, Integer> resultMap = new HashMap<String, Integer>();
        HashMap<String, HashSet<String>> reporterMap = new HashMap<String, HashSet<String>>();
        for (String id : id_list) {
            reporterMap.put(id, new HashSet<>());
        }

        Arrays.stream(report).distinct()
                .forEach(r -> {
                    String s1 = r.split(" ")[0];
                    String s2 = r.split(" ")[1];
                    reporterMap.get(s2).add(s1);
                });

        for (String id : id_list) {
            HashSet<String> reporters = reporterMap.get(id);
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    resultMap.put(reporter, resultMap.getOrDefault(reporter, 0) + 1);
                }
            }
        }

        ArrayList<Integer> answerList = new ArrayList<>();
        for (String id : id_list) {
            answerList.add((Integer) resultMap.getOrDefault(id, 0));
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String id_list1[] = { "muzi", "frodo", "apeach", "neo" };
        String report1[] = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
        int k1 = 2;

        String id_list2[] = { "con", "ryan" };
        String report2[] = { "ryan con", "ryan con", "ryan con", "ryan con" };
        int k2 = 3;

        System.out.println(solution.solution(id_list1, report1, k1));
        System.out.println(solution.solution(id_list2, report2, k2));
    }
}
