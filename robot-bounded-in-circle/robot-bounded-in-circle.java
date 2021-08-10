class Solution {
    public boolean isRobotBounded(String instructions) {
    int[][] d = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    int dir = 0;
    int left = -1;
    int right = 1;
    int x = 0;
    int y = 0;
    for (int i = 0; i < instructions.length(); i++) {
      switch (instructions.charAt(i)) {
        case 'L':
          dir += left;
          if (dir < 0) {
            dir = dir + 4;
          }
          break;
        case 'R':
          dir += right;
          dir = dir % 4;
          break;
        default:
          x = x + d[dir][0];
          y = y + d[dir][1];
          break;
      }
    }
    dir = dir % 4;
    return dir != 0 || (x == 0 && y == 0);
    }
}