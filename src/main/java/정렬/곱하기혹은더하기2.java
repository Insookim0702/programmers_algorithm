package 정렬;

import java.util.Scanner;

public class 곱하기혹은더하기2 {
    public static void main(String[] args) {
        //11:14 ~ 11:20
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");
        int result = 0;
        for (String i : n){
            if (i.equals("0") || i.equals("1") || result == 0){
                result+=Integer.parseInt(i);
            }else{
                result *= Integer.parseInt(i);
            }
        }
        System.out.println(result);
    }
}
