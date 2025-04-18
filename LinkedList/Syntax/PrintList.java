

public class PrintList {

 

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


    
    public void addLast(int data){
        Node newNode = new Node(data);
        if ( tail == null){
            tail = newNode;
        }
        tail.next = tail;
        tail = newNode;
    }

    // Print Linked list

// 

    //


    public void printList(){
        Node temp = head;
  
        if  (temp == null){
            System.out.println("Empty");
        }

        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //

//

    //


    public static void main(String args[]){
        PrintList ll = new PrintList();
       
     ll.printList();
        

    }
    
}






    


    
