package 정렬;

import java.util.Arrays;

public class 삽입정렬 {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        for (int i =1; i < n ; i++){
            for (int j = i; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else break;
            }
        }
        Arrays.stream(arr).forEach(a -> System.out.println(a));

    }
}
