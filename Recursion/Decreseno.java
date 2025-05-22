
public class Decreseno {

    public static void printdec(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n-1);
    }
    public static void main(String args []){

      printdec(10);  
    }
    
}
