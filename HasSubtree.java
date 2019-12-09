package Tree_interview;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
    this.val = val;
    }

 }
// 判断一棵数是否被另一棵子树包含
public class HasSubtree {
    public boolean sameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return (sameTree(root1.left, root2.left)
                && sameTree(root1.right, root2.right));
    }

    // 数的子结构
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean ret = false;
        if (root1.val == root2.val) {
            ret = sameTree(root1, root2);
        }
        if (!ret) {
            ret = HasSubtree(root1.left, root2);
        }
        if (!ret) {
            ret = HasSubtree(root1.right, root2);
        }
        return ret;
    }
}
