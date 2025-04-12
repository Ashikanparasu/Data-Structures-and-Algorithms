
import java.util.Scanner;
public class SyntaxWithParameters {

    public static void sum(int a ,int b){
        System.out.println(a+b);
    }

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);
        int sum1 = input.nextInt();
        int sum2 = input.nextInt();

        sum(sum1,sum2);


    }
    
}
