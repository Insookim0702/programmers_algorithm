package 정렬;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {
    @Test
    void solutionTest(){
        hindex1 s = new hindex1();
        //HIndex s = new HIndex();
        //Assert.assertEquals(3 , s.solution(new int[] {3, 0,6,1,5}));
        Assert.assertEquals(4 , s.solution(new int[] {10, 8, 5, 4, 3}));
        Assert.assertEquals(3 , s.solution(new int[] {25, 8, 5, 3, 3}));
        Assert.assertEquals(5 , s.solution(new int[] {8, 7, 7, 6, 5, 5, 3, 0, 0, 0}));
    }
}