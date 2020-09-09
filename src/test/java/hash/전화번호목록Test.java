package hash;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 전화번호목록Test {
    전화번호목록 s = new 전화번호목록();
    @Test
    void solutionTest(){
        //Assert.assertEquals(false,s.solution(new String[] {"119", "97674223", "1195524421"}));
        Assert.assertEquals(true, s.solution(new String[] {"123","456","789"}));
        //Assert.assertEquals(false,s.solution(new String[] {"12","123","1235","567","88"}));
    }
}