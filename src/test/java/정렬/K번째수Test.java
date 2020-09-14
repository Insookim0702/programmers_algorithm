package 정렬;

import hash.베스트앨범;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class K번째수Test {
    @Test
    void solutionTest(){
        K번째수 s = new K번째수();
        Assert.assertEquals("{5,6,3}" , s.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}).toString());
    }
}