package name.lippolis.codility.binarygap.test;

import name.lippolis.codility.binarygap.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test101001000() {
        assertEquals(2, new Solution().solution(328));
    }

    @Test
    void test10101001000001() {
        assertEquals(5, new Solution().solution(10817));
    }

    @Test
    void test10101000010001() {
        assertEquals(4, new Solution().solution(10769));
    }

}
