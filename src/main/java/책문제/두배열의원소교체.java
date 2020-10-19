package 책문제;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 두배열의원소교체 {
    public static void main(String[] args) {
        //11:48 ~ 12:06
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[n];
        for(int i =0; i< n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i =0; i< n;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b, Collections.reverseOrder());

        for (int j =0; j< k;j++){
            if (a[j] < b[j]){
                a[j] = b[j];
            }else
                break;
        }
        Integer sum = 0;
        for (int num : a){
            sum += num;
        }
        System.out.println(sum);
    }
}


/*
5 3
1 2 5 4 3
5 5 6 6 5
*/