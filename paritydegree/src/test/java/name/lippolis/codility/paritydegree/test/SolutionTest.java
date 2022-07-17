package name.lippolis.codility.paritydegree.test;

import name.lippolis.codility.paritydegree.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test24() {
        assertEquals(3, new Solution().solution(24));
    }

    @Test
    void test64() {
        assertEquals(6, new Solution().solution(64));
    }

}
