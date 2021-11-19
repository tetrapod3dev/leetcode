class Solution {
    public int hammingDistance(int x, int y) {
        int differ = x^y;
        int hammingDistance = 0;
        while (differ > 0) {
            hammingDistance += differ&1;
            differ >>= 1;
        }
        return hammingDistance;
    }
}