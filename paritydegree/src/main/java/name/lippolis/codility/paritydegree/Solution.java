package name.lippolis.codility.paritydegree;

public class Solution {

    public int solution(int n) {
        int k = 0;
        int p = 0;

        while (n >= Math.pow(2, p)) {
            if (n % Math.pow(2, p) == 0) {
                k = p;
            }
            p++;
        }

        return k;
    }

}
