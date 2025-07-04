public class factorial {

    public static int fac (int n){
        if(n == 0){
            return 1;
        }

        int fnm1 =fac(n-1);
        int fn = n * fac(n-1);
        return fn;
    }

    public static void main(String [] args){
        System.out.print(fac(5));


         

        
    }
    
}
