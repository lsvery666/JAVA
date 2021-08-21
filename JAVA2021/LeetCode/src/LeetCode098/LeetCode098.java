package LeetCode098;

/**
 * 验证二叉搜索树
 */

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/**
 *递归
 */
class Solution1 {

    public boolean isValidBST(TreeNode root) {

        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long low, long high){
        if(root == null){
            return true;
        }
        return low < root.val && root.val < high && isValidBST(root.left, low, root.val) && isValidBST(root.right, root.val, high);
    }

}

/**
 * 中序遍历
 */
class Solution2{
    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        boolean l = isValidBST(root.left);
        if(l && root.val > pre) {
            pre = root.val;
            return isValidBST(root.right);
        }
        return false;
    }

}