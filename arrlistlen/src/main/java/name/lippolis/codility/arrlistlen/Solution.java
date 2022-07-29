package name.lippolis.codility.arrlistlen;

public class Solution {

    public int solution(int[] a) {
        int i = 0, count = 1;
        while (a[i] != -1) {
            i = a[i];
            count++;
        }

        return count;
    }

}
