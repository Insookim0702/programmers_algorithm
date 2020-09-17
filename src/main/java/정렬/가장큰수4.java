package 정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수4 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        for(int i = 0; i< numbers.length; i++){
            str[i]= numbers[i]+"";
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + "" + o1 + "").compareTo(o1 + "" + o2 + "");
            }
        });
        for (String i : str){
            answer +=i;
        }


        return answer.charAt(0) =='0' ? "0" : answer;
    }
}
