package hash;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 스파이의상Test {
    @Test
    void solutionTest(){
        스파이의상 s = new 스파이의상();
        Assert.assertEquals(5, s.solution(new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        Assert.assertEquals(3, s.solution(new String[][] {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }
}