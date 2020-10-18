package 정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class 정렬노트 {
    public static void main(String[] args) {
        int[] arr = {1, 432, 32, 14, 55, 2, 4, 2, 3};
        //[int]배열 오름차순 정렬
        Arrays.stream(arr).sorted().forEach(x -> System.out.println(x));
        System.out.println("===Integer");

        //[Integer]배열 내림차순 정렬
        Integer[] arry = {1, 432, 32, 14, 55, 2, 4, 2, 3};
        Arrays.sort(arry, Collections.reverseOrder());
        arrIntegerPrint(arry);

        String strArr[] = {"apple","banana", "melon", "peach"};
        //[String]배열 오름차순 정렬
        Arrays.sort(strArr);
        arrStringPrint(strArr);
        //[String]배열 내림차순 정렬
        Arrays.sort(strArr, Collections.reverseOrder());
        arrStringPrint(strArr);

        //객체 배열 정렬

    }

    private static void arrStringPrint(String[] strArr) {
        System.out.println("======");
        for (String i : strArr){
            System.out.println(i);
        }
    }

    private static void arrIntegerPrint(Integer[] arry) {
        for (int i : arry){
            System.out.println(i);
        }
    }
}

