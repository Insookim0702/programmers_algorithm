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
        for(int h = arr[0]; h > 0; h--){
        //for(int i : arr){
            int finalI = h;
            long more = Arrays.stream(arr).filter(n -> n >= finalI).count();
            if(more < h){
                continue;
            }
            if(Arrays.stream(arr).filter(n -> n < finalI).count() +more == arr.length){
                return h;
            }
        }
        return answer;
    }
}
