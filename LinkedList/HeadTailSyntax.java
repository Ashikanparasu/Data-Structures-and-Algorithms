public class HeadTailSyntax {
 

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
        public static void main(String args[]){
           
            HeadTailSyntax ll = new HeadTailSyntax();
            ll.head = new Node(1);
            ll.tail = new Node(2);
        }
        
    }
    

