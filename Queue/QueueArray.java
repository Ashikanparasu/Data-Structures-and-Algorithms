public class QueueArray {

    static int arr[];
    static int rear;
    static int size;

    public QueueArray(int Size){
        arr =  new int[Size];
        this.size = Size;
        rear = -1;

    }

    public static boolean isEmpty(){
        return rear == -1;
    }
    public static void add(int data){
        if( rear == size-1){
            System.out.println("Queue Full");
            return ;
        }

        rear++;
        arr[rear]=data;

    }

    public static void main (String args[]){

        QueueArray Q = new QueueArray(5);
        Q.add(10);
        Q.add(20);
        Q.add(30);
        System.out.println(Q.isEmpty());
    }

    
}
