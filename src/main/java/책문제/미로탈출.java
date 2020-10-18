package 책문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탈출 {
    //19:45 ~ 20:04
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        int[] dx = { 1, 0, -1, 0};
        int[] dy = { 0, 1, 0, -1};

        String[][] graph = new String[n][m];
        for (int i= 0; i< n; i++){
            graph[i] = sc.next().split("");
        }
        Queue<int[]> que = new LinkedList<int[]>();
        que.offer(new int[]{0,0});
        graph[0][0] = "0";
        result+=1;
        while(!que.isEmpty()){
            int[] poll = que.poll();
            int x = poll[0];
            int y = poll[1];
            for (int i =0 ; i <4;i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (graph[nx][ny].equals("1")) {
                        que.offer(new int[]{nx,ny});
                        graph[nx][ny] = "0";
                        result+=1;
                        if (nx ==n-1 && ny == m-1){
                            if (!que.isEmpty()){
                                que.clear();
                            }
                            break;
                        }
                        break;
                    }
                }
            }
        }


                        for (int j = 0; j <n;j++){
            for (int k = 0; k < m; k++){
                System.out.print(graph[j][k]+ ", ");
            }
            System.out.println();
        }
        System.out.println(result);
    }
}
/*
3 3
110
010
011


5 6
101010
111111
000001
111111
111111
*/
