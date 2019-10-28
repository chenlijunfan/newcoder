package jianzhioffer;


/**
 * @author chenlijun
 * @date 2019/10/23
 * 定一个二叉树和其中的一个结点，
 * * 请找出中序遍历顺序的下一个结点并且返回。
 * * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 **/
public class TreeGetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null)
            return null;
        //若有右子树,则它在在中序排序中的下个节点，必定是他最底层的左节点
        if (pNode.right != null) {
            TreeLinkNode right = pNode.right;
            while (pNode != null) {
                while (right.left != null) {
                    right = right.left;
                }
                return right;
            }
        }

        if (pNode.next == null){
            return null;
        }

        //若没有右子树,该节点是父节点的左节点或者右节点
        //若是左节点，则他的在中序排序中的下一个节点就是他的父节点
        if (pNode.next.left == pNode) {
            return pNode.next;
        }

        //若是右节点，则他的在中序排序中的下一个节点就是根节点
        TreeLinkNode pNext = pNode.next;
        while (pNext.next != null && pNext.next.right == pNext) {
            pNext = pNext.next;
        }
        return pNext.next;


    }


    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
}
