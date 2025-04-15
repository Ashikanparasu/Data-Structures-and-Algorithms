public class BubbleSort {

    public static void main (String args[]){

        
                int array []= {5,4,1,3,2};
                basicbubble bb = new basicbubble();
                bb.BubbleSortt(array);
                System.err.println(array);

            }
        }

        class basicbubble{

            public  static void BubbleSortt(int arr[]){

                for(int turn =0; turn<arr.length-1; turn++){
                    for (int j = 0; j<arr.length-1; j++){

                        if (arr[j] > arr[j+1]){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;

                        }

                    }
                }
            }

           
        }


