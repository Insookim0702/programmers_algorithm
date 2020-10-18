package 책문제;

import java.util.Scanner;

public class 시각 {
    //11:37 ~ 11:47
    public static void main(String[] args) {
        System.out.println(24*60*60);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int h =0; h <= n;h++){
            if (String.valueOf(h).contains("3")){
                count += 60 * 60;
                continue;
            }
            for (int m =0; m <=59; m++){
                if (String.valueOf(m).contains("3")){
                    count +=60;
                    continue;
                }
                for (int s = 0; s<=59;s++){
                    if (String.valueOf(s).contains("3")){
                        count +=1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
