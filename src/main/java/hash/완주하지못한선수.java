package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 완주하지못한선수 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String participantName : participant){
            map.put(participantName, map.getOrDefault(participantName, 0)+1);
        }
        for(String completionName : completion){
            map.put(completionName, map.get(completionName)-1);
        }
        Set<String> name = map.keySet();
        for(String n : name){
            if(map.get(n) !=0){
                answer = n;
            }
        }
        return answer;
    }
}
