package 정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수5 {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            arr[i] = numbers[i]+"";
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        String answer = "";
        for(String s : arr){
            answer+= s;
        }
        return answer.charAt(0) == '0' ? "0" : answer;

    }
}
