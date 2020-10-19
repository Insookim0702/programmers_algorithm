package 정렬;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 모험가길드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i =0; i < n;i++){
            que.add(sc.nextInt());
        }
        int  result = 0;
        ArrayList<Integer> groups = new ArrayList<>();
        while (!que.isEmpty()){
            groups.add(que.poll());
            if (groups.size() == Collections.max(groups)){
                result ++;
                groups.clear();
            }
        }
        System.out.println(result);
    }
}
