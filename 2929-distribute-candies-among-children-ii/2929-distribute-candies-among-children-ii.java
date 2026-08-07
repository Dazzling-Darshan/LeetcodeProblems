class Solution {
    public long distributeCandies(int n, int limit) {

        long ways = 0;

        for (int a = 0; a <= Math.min(limit, n); a++) {

            int remaining = n - a;

            int lower = Math.max(0, remaining - limit);

            int upper = Math.min(limit, remaining);

            if (lower <= upper) {
                ways += (upper - lower + 1);
            }
        }

        return ways;
    }
}