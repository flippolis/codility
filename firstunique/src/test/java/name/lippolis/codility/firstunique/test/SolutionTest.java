package name.lippolis.codility.firstunique.test;

import name.lippolis.codility.firstunique.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void test1() {
        Assertions.assertEquals(5, new Solution().solution(new int[] { 4, 10, 5, 4, 2, 10 }));
    }

    @Test
    void test2() {
        Assertions.assertEquals(4, new Solution().solution(new int[] { 1, 4, 3, 3, 1, 2 }));
    }

    @Test
    void test3() {
        Assertions.assertEquals(-1, new Solution().solution(new int[] { 6, 4, 4, 6 }));
    }

}
