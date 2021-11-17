class Solution {
    public int uniquePaths(int m, int n) {
        long min = Math.min(m, n) - 1;
        long max = Math.max(m, n) - 1;
        long total = min + max;
        long result = 1;
        for ( long i = total; i > max; i-- ) {
            result *= i;
        }
        for (long i = min; i > 0; i--) {
            result /= i;
        }
        return (int) result;
    }
}