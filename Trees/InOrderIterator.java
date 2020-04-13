package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderIterator {

    Stack<BinaryTreeNode> stk = new Stack<>();


    public InOrderIterator(BinaryTreeNode root) {
        while(root != null){
            stk.push(root);
            root = root.left;
        }
    }

    public boolean hasNext(){
        return !stk.isEmpty();
    }


    public BinaryTreeNode getNext() {
        if(stk.isEmpty()){
            return null;
        }

        BinaryTreeNode rVal = stk.pop();
        BinaryTreeNode temp = rVal.right;

        while(temp!= null) {
            stk.push(temp);
            temp = temp.left;
          }
      
          return rVal;
    }

    public static String inorderUsingIterator(BinaryTreeNode root) {
        InOrderIterator iter = new InOrderIterator(root);
        String result = "";
        while (iter.hasNext()) {
          result += iter.getNext().data + " "; 
        }
        return result;
      }

      public static void main(String[] args) {
    
        List<Integer> input = new ArrayList<Integer>();
        input.add(100);input.add(50);input.add(200);input.add(25);input.add(75);input.add(125);input.add(300);
        input.add(12); input.add(35); input.add(60);
        BinaryTreeNode root = BinaryTreeNode.createBST(input);
        System.out.print("Inorder Iterator = ");
        System.out.println(inorderUsingIterator(root));
      }

}