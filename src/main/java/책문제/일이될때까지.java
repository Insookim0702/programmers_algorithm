package 책문제;

import java.util.Scanner;

public class 일이될때까지 {
    //10:39~10:48
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer k = sc.nextInt();
        Integer count = 0;
        while(n!=1){
            if (n%k == 0){
                n = (Integer)n/k;
                count +=1;
                continue;
            }else{
                n -=1;
                count +=1;
                continue;
            }
        }
        System.out.println(count);
    }
}
