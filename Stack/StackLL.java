

public class StackLL {
    
    public  class Node{
        int data;
        Node next;

        public Node (int Data){
            this.data = Data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

   public  boolean isEmpty(){

    return head == null;
   }

    public  void push (int val){
        Node newNode = new Node(val);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
       

    }

    public  int remove(){
        if(head == null){
            return -1;
        }

        int val = head.data;
        head = head.next;
        return val;
    }

    public  int pull(){
        if(head == null){
            return -1;
        }

        return head.data;
    }

    public static void main(String [] args){

        StackLL s = new StackLL();
        s.push(1);
        s.push(2);
        s.push(3);

       System.out.println( s.isEmpty());

       while(!s.isEmpty()){
    System.out.println(s.remove());
}


    }
}
