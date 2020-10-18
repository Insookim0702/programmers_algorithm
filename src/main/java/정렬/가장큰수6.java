package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 가장큰수6 {
    public String solution(int[] numbers) {
        List<String> list = new ArrayList<>();
        for(int i : numbers){
            list.add(i+"");
        }
        Collections.sort(list, (a,b)->{
            return (b+a).compareTo(a+b);
        });

        String answer ="";
        for(String s : list){
            answer +=s;
        }
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
