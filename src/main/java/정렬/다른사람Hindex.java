package 정렬;

import java.util.Arrays;

public class 다른사람Hindex {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = (int)Math.min(citations[i], citations.length -i);
            if(max < min) max = min;
        }
        return max;
    }
}
