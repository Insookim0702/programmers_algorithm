package kakaoTest;

import hash.완주하지못한선수;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test1Test {
    @Test
    void solutionTest(){
        test1 s = new test1();
        Assert.assertEquals("bat.y.abcdefghi" , s.solution("...!@BaT#*..y.abcdefghijklm"));
        Assert.assertEquals("z--", s.solution(	"z-+.^."));
        Assert.assertEquals(	"aaa" , s.solution(		"=.="));
        Assert.assertEquals(	"123_.def" , s.solution(			"123_.def"));
        Assert.assertEquals(		"abcdefghijklmn" , s.solution(	"abcdefghijklmn.p"));
    }
}