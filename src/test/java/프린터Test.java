
import org.junit.jupiter.api.Test;
import org.junit.Assert;

import static org.junit.Assert.*;


class 프린터Test {

    @Test
    public void solution() {
        프린터 s = new 프린터();
        //Assert.assertEquals(1, s.solution(new int[]{2, 1, 3, 2},2));
        Assert.assertEquals(5, s.solution(new int[]{1, 1, 9, 1, 1, 1},0));
    }

}