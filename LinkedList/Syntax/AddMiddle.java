public class AddMiddle {


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
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    
    public void addLast(int data){
        Node newNode = new Node(data);
        if ( tail == null){
            head = newNode;
            tail = newNode;
        }
        else{

        tail.next = newNode;
        tail = newNode;
        }
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
    public void addMiddle(int index, int data){
        Node newNode = new Node(data);
        Node temp = head;

    
        int i =0;

        while(i< index-1){
            temp = temp.next;
            i++;

        }
        newNode.next = temp.next;
        temp.next = newNode;



    }


    public static void main(String args[]){
        AddMiddle ll = new AddMiddle();
       
     ll.printList();
     ll.addFirst(4);
     ll.addFirst(3);
     ll.addFirst(2);
     ll.addFirst(1);
     ll.addMiddle(2, 10);
    
     ll.printList();
        

    }
    
}






    


    

    
