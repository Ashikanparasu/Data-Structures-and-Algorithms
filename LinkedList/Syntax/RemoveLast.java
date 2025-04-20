public class RemoveLast {


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
    
        public static int size;
    
        public void addFirst(int data){
            Node newNode = new Node(data);
            if ( head == null){
                head = newNode;
                size++;
                return;
            }
            newNode.next = head;
            head = newNode;
            size++;
        }
    
    
        
        public void addLast(int data){
            Node newNode = new Node(data);
            if ( tail == null){
                head = newNode;
                tail = newNode;
                size++;
            }
            else{
    
            tail.next = newNode;
            tail = newNode;
            size++;
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
    //Remove First 
    
    
     
        public void removeFirst(){
            if (size == 0){
               System.out.println("Empty");
            }
    
            head = head.next;
            size--;
        }
    
   // Remove Last
       public void removeLast(){
            if (size == 0){
                System.out.println("Empty");
            }
    
            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }
       
        public static void main(String args[]){
        
         RemoveLast   ll = new RemoveLast();
           
         ll.printList();
         ll.addFirst(4);
         ll.addFirst(3);
         ll.addFirst(2);
         ll.addFirst(1);
         ll.removeFirst();
        ll.removeLast();
         ll.printList();
         System.out.println(ll.size);
            
    
        }
        
    
}
    
    
    
    
    
        
    
    
        
    
    
    

