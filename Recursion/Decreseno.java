
public class Decreseno {

    public static void printdec(int n){
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printdec(n-1);
    }


    public static void DecBase0 (int n){
        if (n == 0){
            return ;
        }

        System.out.print(n + " ");
        DecBase0(n-1);
    }
    public static void main(String args []){

      printdec(10); 
      System.out.println(); 
      DecBase0(10);
    }
    
}
