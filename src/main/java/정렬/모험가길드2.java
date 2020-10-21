package 정렬;

import javax.sound.midi.SysexMessage;
import java.net.SecureCacheResponse;
import java.util.Arrays;
import java.util.Scanner;

public class 모험가길드2 {
    public static void main(String[] args) {
        //11:01 ~ 11:06
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(a -> System.out.println(a));
        System.out.println();

        int group_num = 0;
        int result = 0;
        for (int i =0; i< n;i++){
            group_num ++;
            if (group_num == arr[i]){
                result++;
                group_num=0;
            }
        }
        System.out.println(result);
    }
}
