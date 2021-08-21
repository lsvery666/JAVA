import java.util.HashMap;
import java.util.Map;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    public TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(TreeNode node) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.val < node.val) {
                if (cur.right != null) {
                    cur = cur.right;
                } else {
                    cur.right = node;
                    return;
                }
            } else if (cur.val > node.val) {
                if (cur.left != null) {
                    cur = cur.left;
                } else {
                    cur.left = node;
                    return;
                }
            } else {
                System.out.println("Find same value in this tree.");
                return;
            }
        }
        root = node;
    }

    public boolean delete(TreeNode node) {

        TreeNode cur = root, father = root;
        boolean isRight = false;
        while(cur != null){
            if(cur.val < node.val){
                father = cur;
                cur = cur.right;
                isRight = true;
            }else if(cur.val > node.val){
                father = cur;
                cur = cur.left;
                isRight = false;
            }else{
                break;
            }
        }

        if(cur == null) {
            System.out.println("No such node in this tree.");
            return false;
        }

        TreeNode newCur = null;
        if (cur.left != null && cur.right != null) {
            // 寻找右树的值最小的节点
            TreeNode left = cur.right, tmp_father = cur;
            while (left.left != null) {
                tmp_father = left;
                left = left.left;
            }

            if (tmp_father.left.val == left.val) {
                tmp_father.left = left.right;
            } else {
                cur.right = null;
            }

            left.left = cur.left;
            left.right = cur.right;

            newCur = left;
        } else if(cur.left != null || cur.right != null){
            newCur = cur.left == null ? cur.right : cur.left;
        }

        if(cur == root){
            root = newCur;
        }else{
            if(isRight){
                father.right = newCur;
            }else{
                father.left = newCur;
            }
        }

        return true;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.val);
        inorder(node.right);
    }

    public void inorder() {
        inorder(root);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new TreeNode(5));
        bst.insert(new TreeNode(1));
        bst.insert(new TreeNode(10));
        bst.insert(new TreeNode(4));
        bst.insert(new TreeNode(3));
        bst.insert(new TreeNode(6));
        bst.insert(new TreeNode(7));
        bst.insert(new TreeNode(9));
        bst.inorder();
        System.out.println("=========");
        bst.delete(new TreeNode(7));
        bst.inorder();
    }

}
