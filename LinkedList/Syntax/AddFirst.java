

public class AddFirst {

 

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

        // Add First 

    // 

        //


        public void addFirst(int data){
            Node newNode = new Node(data);
            if ( head == null){
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }
        //
    
    //

        //
        public static void main(String args[]){
           
            AddFirst ll = new AddFirst();
            ll.head = new Node(1);
            ll.tail = new Node(2);

            ll.addFirst(5);

        }
        
    }
    


    

