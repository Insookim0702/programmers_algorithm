package 정렬;

import java.util.Scanner;

public class 럭키스트레이트 {
    public static void main(String[] args) {
        //12:41 ~ 12:47
        Scanner sc  =  new Scanner(System.in);
        String n = sc.next();
        int f = 0;
        int e = 0;
        for (int i = 0; i <n.length()/2; i++){
            f+=n.charAt(i);
            e += n.charAt((n.length()/2)+i);
        }
        if (f==e){
            System.out.println("LUCKY");
        }else{
            System.out.println("READY");
        }

    }
}
