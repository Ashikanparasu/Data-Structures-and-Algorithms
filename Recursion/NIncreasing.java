

public class NIncreasing {
    public static void printn(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        printn(n-1);
        System.out.print(n + " ");
    }

    public static void main (String args[]){
        printn(10);
    }
    
}
