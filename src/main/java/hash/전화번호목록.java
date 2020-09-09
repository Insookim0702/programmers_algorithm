package hash;

public class 전화번호목록 {
    public static boolean solution(String[] phone_book) {
        for(int i=0;i<phone_book.length;i++){
            for(int k=0;k<phone_book.length;k++){
                if(i!=k && phone_book[i].startsWith(phone_book[k])){
                    return false;
                }
            }
        }
        return true;
    }
}
