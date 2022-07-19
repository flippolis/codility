package name.lippolis.codility.firstunique;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public int solution(int[] a) {
        AtomicInteger num = new AtomicInteger(-1);

        Map<Integer, Integer> numWithCardinality = new HashMap<>();
        Map<Integer, Integer> uniqueWithPosition = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            Integer cardinality = numWithCardinality.get(a[i]);
            if (cardinality == null) {
                numWithCardinality.put(a[i], 1);
                uniqueWithPosition.put(a[i], i);
            } else {
                numWithCardinality.put(a[i], ++cardinality);
                uniqueWithPosition.remove(a[i]);
            }
        }

        if (!uniqueWithPosition.isEmpty()) {
            uniqueWithPosition.forEach((n, p) -> {
                if (num.get() == -1) {
                    num.set(n);
                } else {
                    if (uniqueWithPosition.get(num.get()) != null && p < uniqueWithPosition.get(num.get())) {
                        num.set(n);
                    }
                }
            });
        }

        return num.get();
    }

}
