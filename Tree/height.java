
import java.util.function.BinaryOperator;

public class height {
    public static class Node{
        int Data;
        Node Left;
        Node Right;

        public Node(int data){
            this.Data = data;
            this.Left = null;
            this.Right = null;
        }
    }


    public class BinaryOperator {
       static index = -1;
 
        public static Node buildTree (int arr[]){
            index++;

            if(arr[index] == -1){
                return null;
                

            }
            Node newNode = new Node(arr[index]);
            newNode.Left = buildTree(arr);
            newNode.Right = buildTree(arr);
            return newNode;
        }
    }

    public class Height {
        public static Node height(Note root){
            if (root == null){
                 return 0;
            }
 
            int leftHeight = height(root.Left);`        
            int rightHeight = height(root.Right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
    
}
