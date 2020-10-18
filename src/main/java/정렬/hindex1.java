package 정렬;

import java.util.Arrays;

public class hindex1 {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        Arrays.sort(citations);
        int finalI = len - 1;
        for (int i = citations[len - 1]; i >= 0; i--) {
            int h = i;
            int[] more = Arrays.stream(citations).filter(value -> value >= h).toArray();
            if(more.length < h){
                continue;
            }

            if (len-more.length <= h) {
                return h;
            }
            finalI--;
        }
        return answer;
    }
}
