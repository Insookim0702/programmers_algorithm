package 정렬;

import java.util.Collections;
import java.util.PriorityQueue;

public class 가장큰수 {
    public String solution(int[] numbers) {
        PriorityQueue<String> pque = new PriorityQueue<>(Collections.reverseOrder());
        int n =numbers.length;
        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        perm(numbers, output, visited, 0, n, n, pque);
        return pque.poll();
    }
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r, PriorityQueue<String> pque) {
        if (depth == r) {
            String value = "";
            for (int i = 0; i < r; i++) {
                value += output[i];
            };
            pque.add(value);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r, pque);
                visited[i] = false;
            }
        }
    }

    // 배열 출력
    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
