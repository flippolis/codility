package name.lippolis.codility.parkingbill.test;

import name.lippolis.codility.parkingbill.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void test1000_1321() {
        assertEquals(17, new Solution().solution("10:00", "13:21"));
    }

    @Test
    void test1000_1001() {
        assertEquals(5, new Solution().solution("10:00", "10:01"));
    }

    @Test
    void test1000_1059() {
        assertEquals(5, new Solution().solution("10:00", "10:59"));
    }

    @Test
    void test1000_1115() {
        assertEquals(9, new Solution().solution("10:00", "11:15"));
    }

    @Test
    void test1030_1220() {
        assertEquals(9, new Solution().solution("10:30", "12:20"));
    }

    @Test
    void test1030_1250() {
        assertEquals(13, new Solution().solution("10:30", "12:50"));
    }

    @Test
    void test0942_1142() {
        assertEquals(9, new Solution().solution("09:42", "11:42"));
    }

}
