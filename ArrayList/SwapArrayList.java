import java.util.ArrayList;

public class SwapArrayList {
    public static void swap(ArrayList<Integer> List,int IN1,int IN2){
        int temp = List.get(IN1);
        List.set(IN1,List.get(IN2));
        List.set(IN2,temp);
        System.out.println(List);

    }
    
    public static void main (String args[]){

        ArrayList <Integer> List = new ArrayList <>();

        List.add(11);
        List.add(22);
        List.add(33);
        List.add(44);
        List.add(55);

        int idex1 = 1, index2 = 4;


        swap(List,idex1,index2);

    }
}
