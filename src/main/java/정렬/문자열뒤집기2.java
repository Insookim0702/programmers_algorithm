package 정렬;

import java.util.Scanner;

public class 문자열뒤집기2 {
    //11:23 ~ 11:32
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int g0 =0;
        int g1 =0;
        char pre = n.charAt(0);
        if (n.charAt(0) == '0'){
            g0 +=1;
        }else{
            g1 +=1;
        }

        for (int i =1; i < n.length();i++){
            if (pre!=n.charAt(i)){
                pre = n.charAt(i);
                if (n.charAt(i) == '0'){
                    g0 +=1;
                }else{
                    g1 +=1;
                }
            }
        }
        System.out.println(Math.min(g0,g1));
    }
}
