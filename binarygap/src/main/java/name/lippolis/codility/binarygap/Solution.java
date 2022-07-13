package name.lippolis.codility.binarygap;

public class Solution {

    public int solution(int n) {
        String nb = Integer.toBinaryString(n);
        int lnb = nb.length();
        int finalBinaryGap = 0;
        int localBinaryGap = 0;
        boolean foundOpening = false;

        for (int i = 0; i < lnb; i++) {
            if ('1' == nb.charAt(i)) {
                if (!foundOpening) {
                    foundOpening = true;
                } else {
                    if (finalBinaryGap < localBinaryGap) {
                        finalBinaryGap = localBinaryGap;
                    }
                    localBinaryGap = 0;
                }
            } else {
                localBinaryGap++;
            }
        }

        return finalBinaryGap;
    }

}
