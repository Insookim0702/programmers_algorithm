package 정규표현식;

import java.awt.*;
import java.util.regex.Pattern;

public class 튜토리얼 {
    public static void main(String[] args) {
        String pattern = "^[0-9]*$"; //숫자만
        String 영문자 = "^[a-zA-Z]*$";
        //소문자, 숫자, _-만 3글자 이상 16글자 이하로 들어갈 수 있는 패턴
        String 유저이름패턴 = "^[a-z0-9_-]{3,16}$";
        String 이메일패턴 = "^[a-zA-Z0-9.@%_+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";


        //유효성 검사
        boolean regex = Pattern.matches(pattern, "1234");
        boolean 가나다라 = Pattern.matches(유저이름패턴, "rkskek-_^");
        boolean check_name = Pattern.matches("^[가-힣]*$", "홍길동");
        boolean check_phoen = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", "010-1234-1234");
        boolean check_email = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", "test@email.com");

        System.out.println(regex);
        System.out.println("유저이름 : " + 가나다라);
        System.out.println("이메일"+check_email);
        System.out.println("이름"+check_name);
        System.out.println("전화번호"+check_phoen);
    }
}
