package 정렬;

import java.util.Scanner;

public class 문자열뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.next();
        int g0 = 0;
        int g1 = 0;
        char pre = '1';
        // 첫 번째 원소에 대해서 처리
        if (val.charAt(0) == '0') {
            g0 += 1;
        }
        else {
            g1 += 1;
        }
        for (int i =0; i<val.length();i++){
            char num = val.charAt(i);
            if (pre == num){
                continue;
            }else{
                if(num =='0'){
                    g0++;
                }else{
                    g1++;
                }
                pre = num;
            }
        }
        System.out.println(Math.min(g0, g1));
    }
}
