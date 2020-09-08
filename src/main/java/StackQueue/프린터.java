package StackQueue;

import java.util.LinkedList;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        if(priorities.length == 1){
            return 1;
        }
        int answer = 0;
        int size = 0;
        LinkedList<Paper> que = new LinkedList<Paper>();
        for(int i : priorities){
            que.add(new Paper(size++,i));
        }

        while(!que.isEmpty()) {
            Paper paper = que.removeFirst();
            for(Paper item : que){
                if(paper.priority < item.priority){
                    que.addLast(paper);
                    paper = null;
                    break;
                }
            }
            if(paper != null){
                answer++;
                if(paper.location == location){
                    return answer;
                }
            }

        }
        return answer;
    }

    class Paper{
        int location;
        int priority;
        public Paper(int location, int priority){
            this.location = location;
            this.priority = priority;
        }
    }
}
