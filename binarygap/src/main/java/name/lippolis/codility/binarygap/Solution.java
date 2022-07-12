package name.lippolis.codility.binarygap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public int solution(int n) {
        String nb = Integer.toBinaryString(n);
        int bg = 0;

        Pattern pattern = Pattern.compile("1(0*)1");
        Matcher matcher = pattern.matcher(nb);
        while (matcher.find()) {
            if (matcher.groupCount() > 0) {
                String group = matcher.group(1);

                if (bg < group.length()) {
                    bg = group.length();
                }
            }

            if (matcher.end() < nb.length() && nb.charAt(matcher.end()) != '1') {
                matcher = matcher.region(matcher.end() - 1, nb.length());
            }
        }

        return bg;
    }

    public static void main(String[] args) {
        int s = new Solution().solution(32);
        System.out.println("Solution: " + s);
    }

}
