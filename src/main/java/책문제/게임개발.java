package 책문제;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.Scanner;

public class 게임개발 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] directArr = {{1, 0}, {0, -1}, {0, 1}, {-1, 0}};
        int[] ch = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            ch[i] = sc.nextInt();
        }
        int[][] graph = new int[n][m];
        for (int j = 0; j < n; j++){
            for (int k = 0; k < m; k++){
                graph[j][k] = sc.nextInt();
            }
        }
        int result = 1;
        graph[ch[0]][ch[1]] = 2;
        while(true){
            if(check(ch,n,m,graph)){
                break;
            }
            int x = ch[0];
            int y = ch[1];

            for(int i = 0; i< 4; i++){
                int nx = x + directArr[ch[2]][0];
                int ny = y + directArr[ch[2]][1];
                if(ch[2]+1 >= 3){
                    ch[2] =0;
                }else {
                    ch[2] += 1;
                }
                if (nx <= -1 || nx >= n || graph[nx][ny] == 1 || graph[nx][ny] == 2 || ny <= -1 || ny >= m){
                    continue;
                }
                ch[0] = nx;
                ch[1] = ny;
                graph[nx][ny] = 2;
                result += 1;
            }
        }
        System.out.println(result);
    }

    private static boolean check(int[] ch,int n, int m, int[][] graph) {
        int x = ch[0];
        int y = ch[1];
        int[][] directArr = {{1, 0}, {0, -1}, {0, 1}, {-1, 0}};
        for (int i =0; i< 4; i++){
            int nx = x + directArr[ch[2]][0];
            int ny = y + directArr[ch[2]][1];
            if(ch[2]+1 >= 3){
                ch[2] =0;
            }else {
                ch[2] += 1;
            }
            if (nx >= 0 && nx <= n && graph[nx][ny] == 0 && ny >= 0 && ny <= m){
                return false;
            }
        }
        return true;
    }
}
