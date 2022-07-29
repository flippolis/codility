package name.lippolis.codility.longestpassword.test;

import name.lippolis.codility.longestpassword.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void test1() {
        assertEquals(7, new Solution().solution("test 5 a0A pass007 ?xy1"));
    }

    @Test
    public void testEmpty() {
        assertEquals(-1, new Solution().solution(""));
    }

    @Test
    public void testSingleSpace() {
        assertEquals(-1, new Solution().solution(" "));
    }

    @Test
    public void testSomeSpaces() {
        assertEquals(-1, new Solution().solution("       "));
    }

    @Test
    public void testOneBadPassword() {
        assertEquals(-1, new Solution().solution("fhe04$dhjd"));
    }

    @Test
    public void testSomeBadPasswords() {
        assertEquals(-1, new Solution().solution("%/£ * gds."));
    }

    @Test
    public void testOneGoodPassword() {
        assertEquals(10, new Solution().solution("re&8 b@dpassw0rd tHeg00done anotherb@done"));
    }

}
