package kakaoTest;

import org.omg.CORBA.INTERNAL;

import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;

public class test2 {

    public String solution(String[] orders, int[] course) {
        List<String> answerList = new LinkedList<>();
        for (int tot = 0; tot < course.length; tot++) {
            LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
            for (String order : orders) {
                int n = order.length();
                boolean[] visited = new boolean[n];
                String[] arr = order.split("");
                for (int i = course[tot]; i <= course[tot]; i++) {
                    combination(arr, visited, 0, n, i, map);
                }
            }

            Map<String, Integer> result = sortMapByValue(map);
            int maxValue = 0;
            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                if (maxValue != 0 && maxValue != entry.getValue()) {
                    break;
                }
                if(entry.getValue() > 1){
                    answerList.add(entry.getKey());
                    maxValue = entry.getValue();
                }
            }
            for (Map.Entry<String, Integer> entry : result.entrySet()) {
                System.out.println(entry.getKey() +" : "+entry.getValue());
            }
        }


        String[] answer = new String[answerList.size()];
        for(int i =0; i< answer.length; i++){
            answer[i] = answerList.get(i);
        }
        Arrays.sort(answer);
        //삭제
        String answerString = "{";
        for(int i =0; i< answer.length; i++){
            answerString += answer[i] + ", ";
        }
        return answerString +"}";
    }

    public static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, ((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    //조합 메서드
    public void combination(String[] arr, boolean[] visited, int start, int n, int r, LinkedHashMap<String, Integer> map) {
        if (r == 0) {
            String orderUnit = "";
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    orderUnit += arr[i];
                }
            }
            map.put(orderUnit, map.getOrDefault(orderUnit, 0) + 1);
            print(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1, map);
            visited[i] = false;
        }
    }

    // 배열 출력
    static void print(String[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            Arrays.sort(arr);
            if (visited[i]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
