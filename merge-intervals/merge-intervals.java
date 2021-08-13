class Solution {

  public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, Comparator.comparing(o -> ((int[]) o)[0]).thenComparing(o -> ((int[]) o)[1]));
    List<int[]> result = new ArrayList<>();
    for (int i = 0; i < intervals.length; i++) {
      int[] curr = intervals[i];
      while (i < intervals.length - 1 && curr[1] >= intervals[1 + i][0]) {
        curr[1] = Math.max(intervals[++i][1], curr[1]);
      }
      result.add(curr);
    }
    return result.toArray(new int[result.size()][]);
  }
}