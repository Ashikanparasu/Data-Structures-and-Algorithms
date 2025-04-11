
import java.util.ArrayList;

public class OperationInArrayList {
   
    
    public static void main(String args[]){
        ArrayList <Integer> List = new ArrayList <>();
        ArrayList <String> List1 = new ArrayList <> ();
        ArrayList <Boolean> List2 = new ArrayList <> ();


        // Add 

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);

        List.add(1,9);

        System.out.println(List);


        // GET USING INDEX 

        int Element = List.get(2);
        System.out.println(Element);


        // REMOVE USING INDEX

        List.remove(2);
        System.out.println(List);


        // SET ELEMENT

        List.set(2,10);
        System.out.println(List);

        // CONTAINS ELEMENT TRUE OR FALSE

        System.out.println(List.contains(10));


    }
}
