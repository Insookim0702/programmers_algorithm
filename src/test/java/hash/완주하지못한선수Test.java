package hash;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class 완주하지못한선수Test {
    @Test
    void solutionTest(){
        완주하지못한선수 s = new 완주하지못한선수();
        Assert.assertEquals("leo", s.solution(new String[] {"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        Assert.assertEquals("vinko", s.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"},new String[] {"josipa", "filipa", "marina", "nikola"}));
        Assert.assertEquals("mislav", s.solution(new String[] {"mislav", "stanko", "mislav", "ana"},new String[] {"stanko", "ana", "mislav"}));
    }

}