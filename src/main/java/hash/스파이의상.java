package hash;

import java.util.*;

public class 스파이의상 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1],0)+1);
        }
        Set<String> strings = map.keySet();
        for(String set : strings){
            answer *= map.get(set)+1;
        }
        return answer-1;
    }
}
