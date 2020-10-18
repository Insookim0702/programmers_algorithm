package 탐색;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import 정렬.내가푼가장큰수리스트;

import static org.junit.jupiter.api.Assertions.*;

class 모의고사Test {
    @Test
    void solutionTest(){
        모의고사 s = new 모의고사();
        Assert.assertEquals("1," , s.solution(new int[] {1,2,3,4,5}));
        Assert.assertEquals("1,2,3," , s.solution(new int[] {1,3,2,4,2}));
    }

}