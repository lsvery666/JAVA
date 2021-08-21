/**
 * AVLTree是BST，所以节点值必须是可比较的
 * 它是一棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树。
 */
public class AVLTree<E extends Comparable<E>> {
    private class Node {
        public E e;
        public Node left;
        public Node right;
        public int height;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
            this.height = 1;
        }
    }

    private Node root;
    private int size;

    public AVLTree() {
        root = null;
        size = 0;
    }

    //获取某一结点的高度
    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 获取节点的平衡因子
     *
     * @param node
     * @return
     */
    private int getBalanceFactor(Node node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    //判断树是否为平衡二叉树
    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(getBalanceFactor(node)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    /**
     * 右旋转
     */
    private Node rightRotate(Node rotNode){
        Node left = rotNode.left;
        Node leftRight = left.right;
        left.right = rotNode;
        rotNode.left = leftRight;
        // 更新height
        rotNode.height = Math.max(getHeight(rotNode.left), getHeight(rotNode.right)) + 1;
        left.height = Math.max(getHeight(left.left), getHeight(left.right)) + 1;
        return left;
    }

    /**
     * 左旋转
     */
    private Node leftRotate(Node rotNode){
        Node right = rotNode.right;
        Node rightLeft = right.left;
        right.left = rotNode;
        rotNode.right = rightLeft;
        // 更新height
        rotNode.height = Math.max(getHeight(rotNode.left), getHeight(rotNode.right)) + 1;
        right.height = Math.max(getHeight(right.left), getHeight(right.right)) + 1;
        return right;
    }

    private Node balance(Node node){
        //计算平衡因子
        int balanceFactor = getBalanceFactor(node);
        if(balanceFactor > 1){
            if(getBalanceFactor(node.left) > 0) {
                // LL
                return rightRotate(node);
            }else if(getBalanceFactor(node.left) < 0){
                // LR
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }else if(balanceFactor < -1) {
            if(getBalanceFactor(node.right) < 0) {
                // RR
                return leftRotate(node);
            }else if(getBalanceFactor(node.right) > 0){
                // RL
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    
    // 向二分搜索树中添加新的元素(key, value)
    public void add(E e){
        root = add(root, e);
    }

    // 向以node为根的二分搜索树中插入元素(key, value)，递归算法
    // 返回插入新节点后二分搜索树的根
    private Node add(Node node, E e){
        if(node == null){
            size ++;
            return new Node(e);
        }
        if(e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if(e.compareTo(node.e) > 0)
            node.right = add(node.right, e);
        //更新height
        node.height = Math.max(getHeight(node.left),getHeight(node.right)) + 1;
        return balance(node);
    }

    private Node getNode(Node node, E e){
        if(node == null || e.compareTo(node.e) == 0){
            return node;
        }else{
            return e.compareTo(node.e) < 0 ? getNode(node.left, e) : getNode(node.right, e);
        }
    }

    private Node minimum(Node node){
        return node.left == null ? node : minimum(node.left);
    }

    public E remove(E e){
        Node node = getNode(root, e);
        if(node != null){
            root = remove(root, e);
            return node.e;
        }
        return null;
    }

    private Node remove(Node node, E e){
        
        Node retNode;
        if( e.compareTo(node.e) < 0 ){
            node.left = remove(node.left , e);
            retNode = node;
        }
        else if(e.compareTo(node.e) > 0 ){
            node.right = remove(node.right, e);
            retNode = node;
        }
        else{
            if(node.left == null && node.right == null){
                size --;
                return null;
            }else if(node.left != null && node.right != null){
                // 待删除节点左右子树均不为空的情况
                // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
                // 用这个节点顶替待删除节点的位置
                Node successor = minimum(node.right);
                successor.right = remove(node.right, successor.e);
                successor.left = node.left;
                retNode = successor;
            }else{
                retNode = node.right == null ? node.left : node.right;
            }
        }
        
        //更新height
        retNode.height = 1+Math.max(getHeight(retNode.left),getHeight(retNode.right));
        //更新size
        size --;
        //维护平衡
        return balance(retNode);
    }

    public void inorder() {
        inorder(root);
    }
    
    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.e);
        inorder(node.right);
    }

    public static void main(String[] args) {
        AVLTree<Integer> avlTree = new AVLTree<>();
        avlTree.add(1);
        avlTree.add(5);
        avlTree.add(10);
        avlTree.add(4);
        avlTree.add(3);
        avlTree.add(6);
        avlTree.add(7);
        avlTree.add(9);
        avlTree.inorder();
        System.out.println("=========");
        avlTree.remove(3);
        avlTree.remove(5);
        avlTree.inorder();
    }
    
}
