package 정렬;

import java.util.Arrays;

public class 선택정렬 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i =0; i< n;i++){
            int minIndex = i;
            for (int j = i+1; j< n; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            //스와프
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        Arrays.stream(arr).forEach(a -> System.out.println(a));
    }
}
