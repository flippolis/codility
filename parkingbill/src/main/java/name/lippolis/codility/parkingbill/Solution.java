package name.lippolis.codility.parkingbill;

public class Solution {

    public int solution(String e, String l) {
        int he = Integer.parseInt(e.substring(0, 2));
        int me = Integer.parseInt(e.substring(3, 5));

        int hl = Integer.parseInt(l.substring(0, 2));
        int ml = Integer.parseInt(l.substring(3, 5));

        // Initial fee.
        int cost = 2;

        if (he == hl) {
            cost = cost + 3;
        } else if (he == hl + 1) {
            cost = cost + 3;
            if (me < ml) {
                // Add another fraction of hour.
                cost = cost + 4;
            }
        } else {
            // Add cost for the first hour.
            cost = cost + 3;

            // Check whether the last hour is full or not.
            if (me < ml) {
                cost = cost + ( (hl - he) * 4 );
            } else {
                cost = cost + ( (hl - he - 1) * 4 );
            }
        }

        return cost;
    }

}
