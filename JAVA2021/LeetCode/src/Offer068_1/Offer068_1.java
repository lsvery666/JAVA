package Offer068_1;

/*
二叉搜索树的最近公共祖先
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

 class Solution1 {
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if(root.val > p.val && root.val > q.val){
             return lowestCommonAncestor(root.left, p, q);
         }
         else if(root.val < p.val && root.val < q.val){
             return lowestCommonAncestor(root.right, p, q);
         }
         return root;
     }
 }


class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while(root != null) {
            if(root.val < p.val && root.val < q.val) // p,q 都在 root 的右子树中
                root = root.right; // 遍历至右子节点
            else if(root.val > p.val && root.val > q.val) // p,q 都在 root 的左子树中
                root = root.left; // 遍历至左子节点
            else break;
        }
        return root;
    }
}
