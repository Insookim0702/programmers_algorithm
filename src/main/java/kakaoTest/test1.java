package kakaoTest;

import java.util.regex.Pattern;

public class test1 {
    public String solution(String new_id) {
        String answer = "";
        //1단계
        String step1 = new_id.toLowerCase();
        //2단계
        String step2 = step1.replaceAll("[^a-z0-9-_.]", "");
        String step3 = step2;
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }
        String step4 = step3;
        if (step4.startsWith(".")) {
            step4 = step4.substring(1, step4.length());
        }
        if (step4.endsWith(".")) {
            step4 = step4.substring(0, step4.length() - 1);
        }
        String step5 = step4;
        if (step5.equals("")) {
            step5 = "a";
        }
        String step6 = step5;
        if (step6.length() >= 16) {
            step6 = step6.substring(0, 15);
            if (step6.endsWith(".")) {
                step6 = step6.substring(0, step6.length() - 1);
            }
        }

        String step7 = step6;
        if (step7.length() <= 2) {
            while (step7.length() < 3) {
                step7 += step7.charAt(step7.length()-1);
            }
        }
        return step7;
    }
}
