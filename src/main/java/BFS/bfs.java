package BFS;

import com.sun.codemodel.internal.JForEach;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static boolean visited[] = new boolean[9];

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<Integer>());
        }
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);
        graph.get(2).add(1);
        graph.get(2).add(7);
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);
        graph.get(4).add(3);
        graph.get(4).add(5);
        graph.get(5).add(3);
        graph.get(5).add(4);
        graph.get(6).add(7);
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);
        graph.get(8).add(1);
        graph.get(8).add(7);
        for (ArrayList<Integer> a : graph){
            System.out.println(a);
        }


        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        visited[1] =true;
        while(!que.isEmpty()){
            Integer poll = que.poll();
            System.out.println(poll);
            for (int i : graph.get(poll)){
                if (!visited[i]){
                    que.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

}
