public class SolidRhombus {

    public static void main(String args[]){

        char CH ='A';
        int n =5;
        for (int i = 1; i<=n ; i++){
            for(int space =1 ; space <= (n-i) ; space++){
                System.out.print(" ");


            }
            for(int star = 1 ; star<=n ; star++){
                System.out.print( CH + " ") ;
                CH ++;
            }
            System.out.println();
        }
    }
    
}
