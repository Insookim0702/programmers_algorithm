package 정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Key로정렬 {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("바나나",2));
        fruits.add(new Fruit("사과",5));
        fruits.add(new Fruit("당근",3));
        Collections.sort(fruits);
        fruits.stream().forEach(a-> System.out.println(a.toString()));
    }
}
class Fruit implements Comparable<Fruit>{
    private String name;
    private int score;

    public Fruit(String name, int score){
        this.name = name;
        this.score =score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Fruit other) {
        if (this.score < other.score){
            return -1;
        }
        return 1;
    }
}
