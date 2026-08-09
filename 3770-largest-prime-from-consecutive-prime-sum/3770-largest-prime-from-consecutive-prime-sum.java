class Solution {
    public int largestPrime(int n) {
        int sum = 0;
        int ans = 0;

        for (int i = 2; ; i++) {
            if (isPrime(i)) {
                sum += i;

                if (sum > n) {
                    break;
                }

                if (isPrime(sum)) {
                    ans = sum;
                }
            }
        }

        return ans;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}