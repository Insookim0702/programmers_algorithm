package 정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수3 {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];
        for(int i=0;i<nums.length;i++){
            nums[i] = numbers[i] + "";
        }
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        String ans = "";
        for(int i=0; i< numbers.length; i++){
            ans += nums[i];
        }

        return ans.charAt(0) == '0' ? "0" : ans;
    }
}
