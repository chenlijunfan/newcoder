package jianzhioffer;

import java.util.Arrays;

/**
 * @author chenlijun
 * @date 2019-10-26 12:16
 * <p>
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */
public class ReConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        // pre[0] == 根节点  in[0] == 最底层左节点
        if (pre.length == 0 || in.length == 0) return null;
        TreeNode tree = new TreeNode(pre[0]);
        //中序遍历的根节点左边是左子树，右边是右子树，计算根节点在中序遍历中的位置
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (tree.val == in[i]) {
                index = i;
            }
        }
        tree.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index + 1), Arrays.copyOfRange(in, 0, index));
        tree.right = reConstructBinaryTree(Arrays.copyOfRange(pre, index + 1, pre.length), Arrays.copyOfRange(in, index + 1, in.length));
        return tree;
    }
}
