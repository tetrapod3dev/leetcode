/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

  public int maxProduct(TreeNode root) {
    List<Integer> sumList = new ArrayList<>(); 
    long total = sumTreeNode(root, sumList);
    long min = Math.abs(total - 2 * sumList.get(0));
    for (Integer integer : sumList) {
      min = Math.min(Math.abs(total - 2L * integer), min);
    }
    return (int) (((total - min) / 2) * ((total + min) / 2) % 1000000007);
  }

  private int sumTreeNode(TreeNode root, List<Integer> sumList) {
    if (root == null) {
      return 0;
    }
    int left = sumTreeNode(root.left, sumList);
    int right = sumTreeNode(root.right, sumList);
    int result = root.val + left + right; 
    sumList.add(result);
    return result;
  }
}