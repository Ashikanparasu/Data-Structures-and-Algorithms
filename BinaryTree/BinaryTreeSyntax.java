

public class BinaryTreeSyntax {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int Data){
            this.data = Data;
            this.left = null;
            this.right = null;

        }

    }
    static class BinaryOperator {
        static int index = -1;

        public static Node buildTree(int arr[]){
            index++;

            if(arr[index] == -1){
                return null;
            }

            Node newNode = new Node (arr[index]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);
            return newNode;
        }

        public static void Preorder(Node root){
            if(root == null){
                return ;
            }
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }

        public static void Inorder(Node root){
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);

        }

        public static void Postorder(Node root){
            if(root == null){
                return;
            }

            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryOperator.buildTree(arr);
        System.out.println("Binary Tree has been built successfully.");
        System.out.println("Root Node: " + root.data);
        System.out.println("Left Child of Root: " + (root.left != null ? root.left.data : "null"));
        System.out.println("Right Child of Root: " + (root.right != null ? root.right.data : "null"));  

        BinaryOperator.Inorder(root);
        System.out.println();
        BinaryOperator.Postorder(root);

    }

}
