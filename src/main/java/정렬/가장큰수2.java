package 정렬;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 가장큰수2 {
    public String solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++){
            list.add(numbers[i]);
        }

        Collections.sort(list, (a, b) ->{
            String as = String.valueOf(a), bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });

        StringBuilder sb = new StringBuilder();
        for(Integer i : list){
            sb.append(i);
        }
        if(sb.charAt(0) =='0'){
            return "0";
        }

        return sb.toString();
    }
}
