package Tree_interview;

public class isSymmetrical {
    // 判断一颗二叉树是否是对称二叉树
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) {
            return true;
        }
        if (pRoot.left == null && pRoot.right == null) {
            return true;
        }

        return isMirror(pRoot.left, pRoot.right);
    }

    boolean isMirror(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isMirror(p.left, q.right) && isMirror(p.right, q.left);
    }
}
