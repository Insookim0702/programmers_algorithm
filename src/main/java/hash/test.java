package hash;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Sing> list = new LinkedList<>();
        list.add(new Sing(0, 300));
        list.add(new Sing(1, 600));
        list.add(new Sing(2, 100));
        list.add(new Sing(3, 200));
        Collections.sort(list);
        for(Sing s : list){
            System.out.println(s.getSingNo());
        }
    }
}
class Sing implements Comparable<Sing>{
    private int singNo;
    private int plays;

    public int getSingNo() {
        return singNo;
    }

    public int getPlays() {
        return plays;
    }

    public void setSingNo(int singNo) {
        this.singNo = singNo;
    }

    public void setPlays(int plays) {
        this.plays = plays;
    }

    Sing(int singNo, int plays){
        this.singNo = singNo;
        this.plays = plays;
    }

    @Override
    public int compareTo(Sing sing) {
        if(this.plays < sing.plays){
            return 1;
        } else if(this.plays == sing.plays){
            return 0;
        } else{
            return -1;
        }
    }
}
