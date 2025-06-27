

public class QueueLinkedlist {

    static class Node{

    int data;
    Node next;
    

    public  Node(int Data){
        this.data = Data;
        this.next = null;

    }}

    static class Queue {

    
    static Node head;
    static Node tail;

    static public boolean isEmpty(){
        return head == null && tail == null;
    }

    public static void add(int Data){
        Node NewNode = new Node(Data);
        if (head == null){
            head = tail = NewNode;
            return;
        }

        tail.next = NewNode;
        tail = NewNode;
        return;
        
    }

    public static int remove(){
        if (isEmpty()){
            System.out.println("Queue Empty");
            return -1;
        }

        int num = head.data;

        if (head == tail){
            head = tail =null;
        }
        else{
            head = head.next;
        }
        return num;
    }
    
    public static int peek(){
         if (isEmpty()){
            System.out.println("Queue Empty");
            return -1;
        }
        return head.data;
    }
    }
    
    public static void main (String args[]){

        Queue Q = new Queue();
        Q.add(10);
        Q.add(20);
        Q.add(30);
        System.out.println(Q.isEmpty());
        System.out.println(Q.remove());
        System.out.println(Q.peek());
    }

    
}
