package 정렬;

import java.util.Arrays;
import java.util.Collections;

public class HIndex {
    //11:03분 풀이 시작 ~
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] arr = new Integer[citations.length];
        for(int k = 0; k < citations.length; k++){
            arr[k] = citations[k];
        }
        Arrays.sort(arr, Collections.reverseOrder());
        //for(int i = arr[0]; i > arr[arr.length-1]; i--){
        for(int i : arr){
            int finalI = i;
            long more = Arrays.stream(arr).filter(n -> n >= finalI).count();
            long less = Arrays.stream(arr).filter(n -> n <= finalI).count();
            if(more == less){
                return i;
            }
        }
        return answer;
    }
}
