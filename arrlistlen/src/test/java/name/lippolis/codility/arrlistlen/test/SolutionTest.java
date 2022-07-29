package name.lippolis.codility.arrlistlen.test;

import name.lippolis.codility.arrlistlen.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testEmpty() {
        assertEquals(1, new Solution().solution(new int[] { -1 }));
    }

    @Test
    void test1() {
        assertEquals(4, new Solution().solution(new int[] { 1, 4, -1, 3, 2 }));
    }

    @Test
    void test2() {
        assertEquals(4, new Solution().solution(new int[] { 3, -1, 1, 2 }));
    }

}