public class sumOfFirstNNumber {

    public static int sum(int n){
        if(n==1){
            return 1;
        }

        int Snm1 = sum(n-1);
        int Sum = n + Snm1;
        return Sum;
    }

    public static void main(String [] args){

        System.out.print(sum(5));
    }
    
}
