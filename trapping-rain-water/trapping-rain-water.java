class Solution {

  public int trap(int[] height) {
    int[] s = new int[height.length];
    int[] p = new int[height.length];
    s[0] = height[0];
    p[height.length - 1] = height[height.length - 1];
    int sum = -s[0];
    for (int i = 1; i < height.length; i++) {
      sum -= height[i];
      s[i] = Math.max(height[i], s[i - 1]);
      p[height.length - i - 1] = Math.max(height[height.length - i - 1], p[height.length - i]);
    }
    for (int i = 0; i < height.length; i++) {
      s[i] = Math.min(s[i], p[i]);
      sum += s[i];
    }
    return sum;
  }
}