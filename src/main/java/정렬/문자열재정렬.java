package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 문자열재정렬 {
    public static void main(String[] args) {
       //15:13 ~ 15:20
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sum = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i =0; i< n.length();i++){
            if (Character.isDigit(n.charAt(i))){
                sum+=n.charAt(i) -'0';
            }else{
                list.add(String.valueOf(n.charAt(i)));
            }
        }
        String result ="";
        Collections.sort(list);
        System.out.println(sum);
        for (String l : list){
            result+=l;
        }
        System.out.println(result+sum);



    }
}
