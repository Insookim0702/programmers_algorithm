package hash;

import java.util.*;
import java.util.stream.Collectors;

public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {

        //2020.09.10(목) 오전 11:19 ~
        Map<String, Integer> genresPlaysTotal = new LinkedHashMap<>();
        Queue<String> que = new LinkedList();
        for(int i =0; i < genres.length; i++){
            genresPlaysTotal.put(genres[i], genresPlaysTotal.getOrDefault(genres[i],0)+plays[i]);
        }
        Map<String, Integer> result = sortMapByValue(genresPlaysTotal);
        for(Map.Entry<String, Integer> entry : result.entrySet()){
            que.add(entry.getKey());  //que = {"pop", "classic"}
        }


        Map<String, List<Sing>> map = new HashMap<>();
        for(int i =0; i < genres.length; i++){
            if(map.get(genres[i]) == null){
                map.put(genres[i], new LinkedList<Sing>());
                map.get(genres[i]).add(new Sing(i, plays[i]));
            }else{
                map.get(genres[i]).add(new Sing(i, plays[i]));
            }
            //map.entry = {"pop",[[1, 300],[2, 400]]}
            //map.put(genres[i], map.getOrDefault(genres[i], new LinkedList<Sing>()).add(new Sing(i,plays[i])));
        }
        Set<String> genresName = map.keySet();
        for(String g : genresName){
            List<Sing> s = map.get(g);
            Collections.sort(s);
            //{"pop", [[2, 400],[1, 200],[3, 40]]}
            //{"classic", [[1, 1300],[3, 300], [2, 140]]}
        }
        List<Integer> answerList = new LinkedList();
        while(!que.isEmpty()){
            List<Sing> genre1 = map.get(que.poll());
            int size = genre1.size();
            if(size >= 2){
                for(int i =0; i< 2; i++){
                    answerList.add(genre1.get(i).singNo);
                }
            }
            if(size < 2){
                answerList.add(genre1.get(0).singNo);
            }
        }
        int[] answer = new int[answerList.size()];
        int count =0;
        for(int i : answerList){
            answer[count] = i;
            count++;
        }

        return answer;
    }
    public static LinkedHashMap<String, Integer> sortMapByValue(Map<String, Integer> map){
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, ((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
    class Sing implements Comparable<Sing>{
        int singNo;
        int plays;

        Sing(int singNo, int plays){
            this.singNo = singNo;
            this.plays = plays;
        }

        @Override
        public int compareTo(Sing s) {
            if(this.plays < s.plays){
                return 1;
            }else if(this.plays == s.plays){
                return 0;
            }else{
                return -1;
            }
        }
    }
}
