package 정렬;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {
    @Test
    void solutionTest(){
        HIndex s = new HIndex();
        Assert.assertEquals(3 , s.solution(new int[] {3, 0,6,1,5}));
        Assert.assertEquals(3 , s.solution(new int[] {3, 30, 34, 5, 9}));
    }
}