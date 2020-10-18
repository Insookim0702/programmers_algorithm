package 책문제;

import java.util.Arrays;
import java.util.Scanner;

public class 왕실의나이트 {
    public static void main(String[] args) {
        //11:53 ~ 12:13
        Scanner sc = new Scanner(System.in);
        String[] alpha ={"0","a","b","c","d","e","f","g","h"};
        int dx[] = {-2,-2,2,2,1,-1,1,-1};
        int dy[] = {1,-1,1,-1,-2,-2,2,2};
        String n = sc.next();
        int x = Integer.parseInt(n.split("")[1]);
        int y = 0;
        for (int i =0; i <=8;i++){
            if (alpha[i].equals(n.split("")[0])){
                y = i;
            }
        }
        int count = 0;
        for (int j = 0; j < 8;j++){
            int nx = x + dx[j];
            int ny = y + dy[j];
            if (nx >=1 && nx <=8 && ny >=1 && ny <= 8){
                count += 1;
            }
        }
        System.out.println(count);



    }
}
