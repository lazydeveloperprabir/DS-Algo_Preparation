package Trees;


/*
Given the roots of two binary trees, determine if these trees are identical or not. Identical trees have the same layout and data at each node. Consider the following two identical binary trees that have the same layout and data.

Identical Trees
Trees that have the same data don’t need to be identical trees. Trees that have the same data may not be structurally identical. For example, if you look at the two trees below, although they have the same data, they are not identical.

Non-identical treesAs their layout isdifferent.
Hints #
You can use Depth first traversal.
The solution can be implemented using recursion.
*/

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value = value;
    }
}

public class CheckTwoBinaryTreesareIdentical {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(100);
        root1.left = new TreeNode(50);
        root1.left.left = new TreeNode(25);
        root1.right = new TreeNode(200);
        root1.right.left = new TreeNode(125);
        root1.right.right = new TreeNode(350);

        TreeNode root2 = new TreeNode(100);
        root2.left = new TreeNode(50);
        root2.left.left = new TreeNode(25);
        root2.right = new TreeNode(200);
        root2.right.left = new TreeNode(125);
        root2.right.right = new TreeNode(350);

        System.out.println(areIdentical(root1, root2));

        TreeNode root3 = new TreeNode(100);
        root3.left = new TreeNode(50);
        root3.left.right = new TreeNode(25);
        root3.right = new TreeNode(200);
        root3.right.left = new TreeNode(125);
        root3.right.right = new TreeNode(350);


        TreeNode root4  = new TreeNode(100);
        root4.left = new TreeNode(50);
        root4.left.left = new TreeNode(25);
        root4.right = new TreeNode(200);
        root4.right.left = new TreeNode(125);
        root4.right.right = new TreeNode(350);

        System.out.println(areIdentical(root3, root4));


        
    }

    public static boolean areIdentical(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return true;
        }
        
        if(root1 != null && root2 != null){
            return ((root1.value == root2.value) && 
            areIdentical(root1.left, root2.left) && 
            areIdentical(root1.right, root2.right));
        }

        return false;
    }

}