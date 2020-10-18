package 탐색;

import org.omg.CORBA.INTERNAL;

import java.util.HashSet;

public class 소수찾기 {
    public int solution(String numbers) {
        int answer = 0;
        //숫자 분리
        String[] numarr = numbers.split("");
        HashSet<Integer> set = new HashSet<>();
        permutation("",numbers, set);
        return answer;
    }

    private void permutation(String prefix, String str, HashSet<Integer> set){
        int n = str.length();
        if(!prefix.equals("")){
            set.add(Integer.valueOf(prefix));
        }
        for(int i =0; i < n; i++){
            permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, n ), set);
        }
    }

}
