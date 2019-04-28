package solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void deveRetornar4() {
        int[] arr = {0, 0, 1, 0, 0, 1, 0};
        Solution solution = new Solution();
        int retorno = solution.jumpingOnClouds(arr);
        Assert.assertEquals(4, retorno);
    }
}
