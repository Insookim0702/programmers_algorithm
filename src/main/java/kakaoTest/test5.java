package kakaoTest;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test5 {
    public String solution(String play_time, String adv_time, String[] logs) throws ParseException {
        String answer = "";
        Date currentTime = new Date();
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
        Date d1 = f.parse(play_time);
        Date d2 = f.parse(adv_time);
        long i = d2.getTime() - d1.getTime();



        return answer;
    }
}
