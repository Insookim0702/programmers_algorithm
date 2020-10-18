package kakaoTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test3 {
    public int[] solution(String[] info, String[] query) {
        List<Participant> participantsList = new ArrayList<>();
        for (String i : info) {
            String[] p = i.split(" ");
            participantsList.add(new Participant(p[0], p[1], p[2], p[3], Integer.parseInt(p[4])));
        }
        Queue<Query> queryQue = new LinkedList<>();
        for (String q : query) {
            String[] element = q.split(" and ");
            String[] s = element[3].split(" ");
            queryQue.add(new Query(element[0], element[1], element[2], s[0], Integer.parseInt(s[1])));
        }
        int[] answer = new int[queryQue.size()];
        int size = 0;
        while (!queryQue.isEmpty()) {
            int count = 0;
            Query q = queryQue.poll();
            for (Participant p : participantsList) {
                if (q.score <= p.score) {
                    if (!q.lang.equals(p.lang) && !q.lang.equals("-")) {
                        continue;
                    }
                    if (!q.part.equals(p.part) && !q.part.equals("-")) {
                        continue;
                    }
                    if (!q.experience.equals(p.experience) && !q.experience.equals("-")) {
                        continue;

                    }
                    if (!q.food.equals(p.food) && !q.food.equals("-")) {
                        continue;
                    }
                } else {
                    continue;
                }
                count++;
            }
            answer[size] = count;
            size++;
        }

        return answer;
    }


    class Participant {
        private String lang;
        private String part;
        private String experience;
        private String food;
        private int score;

        Participant(String lang, String part, String experience, String food, int score) {
            this.lang = lang;
            this.part = part;
            this.experience = experience;
            this.food = food;
            this.score = score;
        }
    }

    //"java and backend and junior and pizza 100"
    class Query {
        private String lang;
        private String part;
        private String experience;
        private String food;
        private int score;

        Query(String lang, String part, String experience, String food, int score) {
            this.lang = lang;
            this.part = part;
            this.experience = experience;
            this.food = food;
            this.score = score;
        }
    }
}
