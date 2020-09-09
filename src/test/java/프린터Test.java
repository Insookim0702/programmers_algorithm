
import StackQueue.프린터;
import StackQueue.프린터2;
import StackQueue.프린터3;
import org.junit.jupiter.api.Test;
import org.junit.Assert;


class 프린터Test {

    @Test
    public void solution() {
        프린터3 s = new 프린터3();
        Assert.assertEquals(1, s.solution(new int[]{2, 1, 3, 2},2));
        Assert.assertEquals(2, s.solution(new int[]{2, 1, 3, 2},3));
        Assert.assertEquals(5, s.solution(new int[]{1, 1, 9, 1, 1, 1},0));
        Assert.assertEquals(1, s.solution(new int[]{1, 1, 9, 1, 1, 1},2));
        Assert.assertEquals(3, s.solution(new int[]{1, 1, 1, 1, 1, 1},2));
        Assert.assertEquals(2, s.solution(new int[]{1, 1},1));
        Assert.assertEquals(2, s.solution(new int[]{1, 1},1));
    }

}