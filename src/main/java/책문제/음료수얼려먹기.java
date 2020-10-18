package 책문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 음료수얼려먹기 {
    //19:20 ~ 19:44
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        String[][] graph = new String[n][m];
        for (int i = 0; i < n; i++) {
            graph[i] = sc.next().split("");
        }
        Queue<int[]> que = new LinkedList<int[]>();
        int result = 0;
        for (int xidx = 0; xidx < n; xidx++){
            for (int yidx = 0; yidx < m; yidx++){
                if (graph[xidx][yidx].equals("0")){
                    graph[xidx][yidx] ="1";
                    result +=1;
                    que.offer(new int[]{xidx, yidx});
                    while(!que.isEmpty()){
                        int[] poll = que.poll();
                        int x = poll[0];
                        int y = poll[1];
                        for (int i =0 ; i <4;i++){
                            int nx = x + dx[i];
                            int ny = y + dy[i];
                            if (nx >= 0 && nx <n && ny >=0 && ny < m){
                                if (graph[nx][ny].equals("0")){
                                    que.offer(new int[]{nx,ny});
                                    graph[nx][ny]="1";
                                }
                            }
                        }
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
4 5
00110
00011
11111
00000
        */
