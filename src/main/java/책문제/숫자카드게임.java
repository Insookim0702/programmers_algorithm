package 책문제;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자카드게임 {
    // 10:28~10:38
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer m = sc.nextInt();
        int[][] arr = new int[n][m];
        Integer maxValue = 0;
        for (int i = 0; i < n; i++) {
            Integer minValue = 100000;
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
                minValue = Math.min(minValue, arr[i][j]);
            }
            maxValue = Math.max(maxValue, minValue);
        }

        System.out.println(maxValue);
    }
}
