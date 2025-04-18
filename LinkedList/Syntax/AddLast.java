
public class AddLast {



 

    public static class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }

    public static Node head;

    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if ( head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add Last

// 

    //


    public void addLast(int data){
        Node newNode = new Node(data);
        if ( tail == null){
            tail = newNode;
        }
        tail.next = tail;
        tail = newNode;
    }
    //

//

    //
    public static void main(String args[]){
       
        AddLast ll = new AddLast();
        ll.head = new Node(1);
        ll.tail = new Node(2);

        ll.addFirst(5);

    }
    
}






    

