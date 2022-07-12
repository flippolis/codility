package name.lippolis.codility.binarygap.test;

import name.lippolis.codility.binarygap.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void test101001000() {
        assertTrue(2 == new Solution().solution(328));
    }

}
