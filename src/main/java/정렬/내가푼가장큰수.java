package 정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 내가푼가장큰수 {
    public String solution(int[] numbers) {
        String[] str = new String[numbers.length];
        for(int i = 0; i < numbers.length;i++){
            str[i] = numbers[i] + "";
        }
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });

        String answer = "";
        for(String s : str){
            answer +=s;
        }
        return answer.charAt(0) =='0' ? "0" : answer;
    }
}
