package name.lippolis.codility.longestpassword;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public int solution(String s) {
        List<String> passwords = Arrays.asList(s.split(" "));
        AtomicInteger length = new AtomicInteger(-1);
        passwords.forEach(p -> {
            if (p.matches("[A-Za-z0-9]+")) {
                if (length.get() < p.length()) {
                    length.set(p.length());
                }
            }
        });

        return length.get();
    }

}
