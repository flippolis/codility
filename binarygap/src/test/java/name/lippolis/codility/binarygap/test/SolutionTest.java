package name.lippolis.codility.binarygap.test;

import name.lippolis.codility.binarygap.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    /**
     * Example 1: 1041=10000010001
     */
    @Test
    void test10000010001() {
        assertEquals(5, new Solution().solution(1041));
    }

    /**
     * Example 2: 15=1111
     */
    @Test
    void test1111() {
        assertEquals(0, new Solution().solution(15));
    }

    /**
     * Example 3: 32=100000
     */
    @Test
    void test100000() {
        assertEquals(0, new Solution().solution(32));
    }

    /**
     * Extremes: 1, 5=101, 2147483647=2^31-1
     */
    @Test
    void testExtremes() {
        assertEquals(0, new Solution().solution(1));
        assertEquals(1, new Solution().solution(5));
        assertEquals(0, new Solution().solution(2^31 - 1));
    }

    /**
     * Trailing zeros: 6=110, 328=101001000
     */
    @Test
    void testTrailingZeros() {
        assertEquals(0, new Solution().solution(6));
        assertEquals(2, new Solution().solution(328));
    }

    /**
     * Power of 2: 16=2^4, 1024=2^10
     */
    @Test
    void testPowerOf2() {
        assertEquals(0, new Solution().solution(2^4));
        assertEquals(0, new Solution().solution(2^10));
    }

    /**
     * Simple 1: 9=1001, 11=1011
     */
    @Test
    void testSimple1() {
        assertEquals(2, new Solution().solution(9));
        assertEquals(1, new Solution().solution(11));
    }

    /**
     * Simple 2: 19=10011, 42=101010
     */
    @Test
    void testSimple2() {
        assertEquals(2, new Solution().solution(19));
        assertEquals(1, new Solution().solution(42));
    }

    /**
     * Simple 3: 1162=10010001010, 5=101
     */
    @Test
    void testSimple3() {
        assertEquals(3, new Solution().solution(1162));
        assertEquals(1, new Solution().solution(5));
    }

    /**
     * Medium 1: 51712=110010100000000, 20=10100
     */
    @Test
    void testMedium1() {
        assertEquals(2, new Solution().solution(51712));
        assertEquals(1, new Solution().solution(20));
    }

    /**
     * Medium 2: 561892=10001001001011100100, 9=1001
     */
    @Test
    void testMedium2() {
        assertEquals(3, new Solution().solution(561892));
        assertEquals(2, new Solution().solution(9));
    }

    /**
     * Medium 3: 66561=10000010000000001
     */
    @Test
    void testMedium3() {
        assertEquals(9, new Solution().solution(66561));
    }

    /**
     * Large 1: 6291457=11000000000000000000001
     */
    @Test
    void testLarge1() {
        assertEquals(20, new Solution().solution(6291457));
    }

    /**
     * Large 2: 74901729=100011101101110100011100001
     */
    @Test
    void testLarge2() {
        assertEquals(4, new Solution().solution(74901729));
    }

    /**
     * Large 3: 805306373=11000000000000000000000000010
     */
    @Test
    void testLarge3() {
        assertEquals(25, new Solution().solution(805306373));
    }

    /**
     * Large 4: 1376796946=1010010000100000100000100010010
     */
    @Test
    void testLarge4() {
        assertEquals(5, new Solution().solution(1376796946));
    }

    /**
     * Large 5: 1073741825=1000000000000000000000000000001
     */
    @Test
    void testLarge5() {
        assertEquals(29, new Solution().solution(1073741825));
    }

    /**
     * Large 6: 1610612737=1100000000000000000000000000001
     */
    @Test
    void testLarge6() {
        assertEquals(28, new Solution().solution(1610612737));
    }

}
