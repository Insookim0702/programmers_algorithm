package 정렬;

import java.util.ArrayList;
import java.util.Scanner;

public class 곱하기혹은더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String str = sc.next();
        sum = str.charAt(0) -'0';
        System.out.println(str.charAt(0) -0);
        for (int i = 1; i< str.length();i++){
            int num = str.charAt(i) - '0';
            if (num <= 1 || sum <=1){
                sum += num;
            }else {
                sum *= num;
            }
        }
        /*
        for(String a : sc.next().split("")){
            if (a.equals("0") || a.equals("1") || sum == 0 || sum == 1){
                sum = sum + Integer.parseInt(a);
            }else{
                sum = sum * Integer.parseInt(a);
            }
        }*/
        System.out.println(sum);

    }
}
