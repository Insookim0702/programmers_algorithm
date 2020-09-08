package StackQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터2 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<>();
        for (int i : priorities) {
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length - 1;

        while (!que.isEmpty()) {
            Integer priority = que.poll();
            if (priority == priorities[size - answer]) {
                answer++;
                l--;
                if(l < 0){
                    break;
                }
            }else{
                que.add(priority);
                l--;
                if(l < 0){
                    l = que.size()-1;
                }
            }
        }
        return answer;
    }
}
