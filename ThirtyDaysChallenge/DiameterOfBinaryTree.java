package ThirtyDaysChallenge;

import apple.laf.JRSUIUtils.Tree;

/*
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree 

          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.


Algorithm :-

Let's calculate the depth of a node in the usual way: max(depth of node.left, depth of node.right) + 1. While we do, a path "through" this node uses 1 + (depth of node.left) + (depth of node.right) nodes. Let's search each node and remember the highest number of nodes used in some path. The desired length is 1 minus this number.


*/
class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value = value;
    }
}
public class DiameterOfBinaryTree {

    public static int ans;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(diameterOfBT(root));

    }

    public static int diameterOfBT(TreeNode root) {
        ans = 1;
        indepth(root);
        return ans -1;
    }

    public static int depth(TreeNode node) {
        if(node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans,L+R+1);
        return Math.max(L, R) +1;
    }

    public static void indepth(TreeNode node) {
        if(node == null) throw new IllegalArgumentException();
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans,L+R+1);
        //return Math.max(L, R) +1;
    }



}