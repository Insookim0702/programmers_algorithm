package 정렬;

import java.util.Arrays;

public class K번째수 {
    public String solution(int[] array, int[][] commands) {
        //2020-09-11(금) 오전 11:50 ~
        int size = commands.length;
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            int[] tempArray = new int[commands[i][1] - commands[i][0] + 1];
            int index = 0;
            for (int k = commands[i][0]; k < commands[i][1]+1; k++) {
                tempArray[index] = array[k - 1];
                index++;
            }
            Arrays.sort(tempArray);
            answer[i] = tempArray[commands[i][2]-1];
        }
        return answer.toString();
    }
}
