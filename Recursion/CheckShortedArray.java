public class CheckShortedArray {

    public static boolean check(int arr[], int n){
        if(n == arr.length-1){
            return true;
        }

        if(arr[n]> arr[n+1]){
            return false;
        }

        boolean t= check(arr,n+1);
        return t;
    }
    
    public static void main(String []args){
        int array [] = {1,2,3,4,5};
        System.out.print(check(array,0));
    }
}
