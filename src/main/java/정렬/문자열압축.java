package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 문자열압축 {
    //15:45 ~
    public static void main(String[] args) {
        문자열압축 s = new 문자열압축();
        //System.out.println(s.solution("aabbaccc"));  //    	7
        System.out.println(s.solution("ababcdcdababcdcd"));  // 	9

    }

    private int solution(String s) {
        int answer =1000;
        ArrayList<String> list = new ArrayList<>();
        for (int step = 1; step < (s.length() / 2)+1; step++) {
            String result = "";
            String preValue = s.substring(0, step);
            int count = 1;
            int i;
            for (i = step; i < s.length(); i += step) {
                if (i+step >s.length()){

                    break;
                    //return Collections.min(list).length();
                }
                if (preValue.equals(s.substring(i, i + step))) {
                    count++;
                } else {
                    if (count ==1){
                        result += preValue;
                    }else{
                        result += count + preValue;
                    }
                    preValue = s.substring(i, i + step);
                    count = 1;
                }
            }
            if (count==1){

                String substring = s.substring(i, s.length());

                String e = result + preValue + substring;
                answer = Math.min(answer, e.length());
            }else{
                String e = result + count + preValue + s.substring(i, s.length());
                answer = Math.min(answer, e.length());
            }
        }
        return answer;
    }


}
