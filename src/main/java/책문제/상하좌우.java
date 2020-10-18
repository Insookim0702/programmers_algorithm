package 책문제;

import com.sun.java.swing.action.AlignLeftAction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 상하좌우 {
    //11:09 ~ 11:34
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int y = 1;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            list.add(sc.next());
        }

        for (String direction : list) {
            if (direction.equals("U")) {
                x -= 1;
                if (x <= 0) {
                    x += 1;
                    continue;
                }
                continue;
            } else if (direction.equals("D")) {
                x += 1;
                if (x >= n) {
                    x -= 1;
                    continue;
                }
                continue;
            } else if (direction.equals("R")) {
                y += 1;
                if (y >= n) {
                    y -= 1;
                    continue;
                }
                continue;
            } else {
                y -= 1;
                if (y <= 0) {
                    y += 1;
                    continue;
                }
                continue;
            }
        }
        System.out.println(x + " " + y);
    }
}
