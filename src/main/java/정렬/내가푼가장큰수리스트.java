package 정렬;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class 내가푼가장큰수리스트 {
    public String solution(int[] numbers) {
        List<Integer> list = new LinkedList<>();
        for(int i : numbers){
            list.add(i);
        }

        Collections.sort(list, (a,b)-> {
            String as = String.valueOf(a);
            String bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as+bs), Integer.parseInt(bs+as));
        });

        String answer = "";
        for(int i : list){
            answer+= i +"";
        }
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
