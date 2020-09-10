package hash;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 베스트앨범Test {
    @Test
    void solutionTest(){
        베스트앨범 s = new 베스트앨범();
        Assert.assertEquals(new int[] {4,1,3,0} , s.solution(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}));
    }
}