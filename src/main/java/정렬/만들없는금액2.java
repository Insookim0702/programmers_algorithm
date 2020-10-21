package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 만들없는금액2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //12:14 ~ 12:26
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i< n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int sum = 1;
        for (int j = 0; j< n;j++){
            if(sum >= arr[j]){
                sum+=arr[j];
            }

        }
        System.out.println(sum);

    }
}
