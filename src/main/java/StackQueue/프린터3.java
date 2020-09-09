package StackQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터3 {
    public int solution(int[] priorities, int location) {
        int answer =0;
        Queue<Integer> que = new LinkedList<>();
        for(int pri : priorities){
            que.add(pri);
        }
        Arrays.sort(priorities);
        int size = priorities.length-1;
        int l = location;
        while(!que.isEmpty()){
            int priority = que.poll();
            if(priority == priorities[size - answer]){
                answer++;
                if(l == 0){
                    return answer;
                }else{
                    l--;
                }
            }else{
                que.add(priority);
                if(l == 0){
                    l = que.size()-1;
                }else{
                    l--;
                }
            }
        }
        return answer;
    }
}
