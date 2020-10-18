package kakaoTest;

import hash.스파이의상;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test2Test {
    @Test
    void solutionTest(){
        test2 s = new test2();
        Assert.assertEquals("{AC, ACDE, BCFG, CDE, }", s.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[] {2,3,4}));
        Assert.assertEquals("{ACD, AD, ADE, CD, XYZ, }", s.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[] {2,3,5}));
        Assert.assertEquals("{WX, XY, }", s.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[] {2,3,4}));
    }
}