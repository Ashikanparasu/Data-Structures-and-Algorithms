

public class StackLL {
    
    public static class Node{
        int data;
        Node next;

        public Node (int Data){
            this.data = Data;
            this.next = null;
        }
    }

   static Node head;
   static Node tail;

    public static void push (int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
        }

        newNode.next = head;
        head = newNode;
       

    }

    public static int pull(){
        if(head == null){
            return -1;
        }

        int val = head.data;
        head.next = head ;
        return val;
    }

    public static void main(String [] args){

        StackLL s = new StackLL();
        s.push(1);

    }
}
