package 책문제;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수법칙 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Integer maxPlus = ((int)m/k) * k;
        Integer secondMaxPlus = (int)m%k;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(value -> System.out.println(value));
        Integer maxValue = arr[n - 1];
        Integer secondMaxValue = arr[n - 2];
        Integer sum = (maxPlus * maxValue) + (secondMaxPlus*secondMaxValue);
        System.out.println(sum);
    }
}
