
import java.util.HashSet;
import java.util.Set;

class Solution {

  public int lengthOfLongestSubstring(String s) {
    int result = 0;
    int start = 0;
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      char curr = s.charAt(i);
      if (set.contains(curr)) {
        while (s.charAt(start) != s.charAt(i)) {
          set.remove(s.charAt(start++));
        }
        start++;
      } else {
        set.add(curr);
      }
      result = Math.max(result, i - start + 1);
    }
    return result;
  }
}