// 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
// 则重建二叉树并返回
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode tn = this.reConstruct(pre,0,pre.length-1, in, 0, in.length-1);
        return tn;
    }
    public  TreeNode reConstruct(int[] pre, int startPreorder, int endPreorder,int[] in, int startInorder, int endInorder) {
        // base condition
        if (startPreorder > endPreorder || startInorder > endInorder) return null;
        // recurse condition 
        TreeNode rootNode = new TreeNode(pre[startPreorder]);
        int rootNodeIndex = startInorder;
        // find the index of root node in inorder-array
        while (in[rootNodeIndex] != rootNode.val) {
            rootNodeIndex ++;
        }
        rootNode.left = reConstruct(pre,startPreorder+1,startPreorder+rootNodeIndex-startInorder,in,startInorder,rootNodeIndex-1);
        rootNode.right= reConstruct(pre,startPreorder+rootNodeIndex-startInorder+1,endPreorder,in,rootNodeIndex+1,endInorder);
        return rootNode;
    }
}