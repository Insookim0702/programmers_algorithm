package StackQueue;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 주식가격Test {
    @Test
    void solutiontest(){
        주식가격 s = new 주식가격();
        Assert.assertEquals(new int[]{4, 3, 1, 1, 0}, s.solution(new int[] {1, 2, 3, 2, 3}));
    }
}