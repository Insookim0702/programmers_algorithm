package 책문제;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        if (this.score < student.score){
            return -1;
        }
        return 1;
    }
}
public class 성적이낮은순서로학생출력하기 {
    //11:36 ~ 11:43
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        for (int i =0; i< n;i++){
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        Collections.sort(students);

        students.stream().forEach(student -> System.out.println(student.toString()));
    }
}
