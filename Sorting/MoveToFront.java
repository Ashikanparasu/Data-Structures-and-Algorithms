public class MoveToFront {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 5, 3, 4, 5};
        int target = 5;

        int[] result = new int[arr.length];
        int index = 0;

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result[index] = arr[i];
                index++;
            }
        }

      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                result[index] = arr[i];
                index++;
            }
        }

        
        System.out.print("Updated array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
