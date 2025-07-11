
public class BuildBST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int Data){
            this.data = Data;
        }}

        public static Node insert(Node root , int val){
            if(root == null){
                root = new Node(val);
                return root;
            }

            if(root.data > val){
                root.left = insert(root.left , val);
            }else{
                root.right = insert(root.right,val);
            }return root;
        }

        public static void inorder(Node root){
        if(root == null){
            return ;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public static boolean Search(Node root , int val){
        if(root == null){
            return false;
        }

        if(root.data == val){
            return true;
        }
        if(root.data>val){
            return Search(root.left,val);
        }
        else{
            return Search(root.right,val);
        }


    }

        public static void main(String [] args){
          
            int arr[] = {5,1,3,4,2,7};
            Node  root = null;

            for(int i = 0; i<arr.length;i++){

                root = insert(root,arr[i]);

            }

            inorder(root);
           System.out.println( Search(root,7));

        }
    }
    

