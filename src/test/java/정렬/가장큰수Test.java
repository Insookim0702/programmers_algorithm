package 정렬;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 가장큰수Test {
    @Test
    void solutionTest(){
        가장큰수6 s = new 가장큰수6();
        Assert.assertEquals("6210" , s.solution(new int[] {6, 10, 2}));
        Assert.assertEquals("9534330" , s.solution(new int[] {3, 30, 34, 5, 9}));
        Assert.assertEquals("0" , s.solution(new int[] {0, 0, 0, 0, 0}));
    }
}