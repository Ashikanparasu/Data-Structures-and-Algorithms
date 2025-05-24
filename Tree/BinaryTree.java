

public class BinaryTree {
    public static class Node {
        int Data;
        Node Left;
        Node Right;

        public Node(int data){
            this.Data = data;
            this.Left = null;
            this.Right = null;
        }
    }

    static class BinaryTreeOperations {
        static int index = -1;
        public static  Node buildTree(int arr[]){
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



    public static void main(String args[]) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTreeOperations treeOps = new BinaryTreeOperations();
        Node root = treeOps.buildTree(arr);
        System.err.println(root.Data);
        
        // You can add methods to traverse or manipulate the tree here
    }
       

    // Add methods for inserting, deleting, searching, etc. as needed
}
