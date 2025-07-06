public class FirstOcurrance {


    public static int search(int arr[],int key,int idx){
        if(idx == arr.length -1 ){
            return -1;
        }

        if (arr[idx]==key){
            return idx;
        }

        return search(arr,key,idx+1);
    }

    public static void main(String[] args){
        int array[] ={1,4,5,6};
        System.out.println(search(array,5,0)); 
    }
    
}
