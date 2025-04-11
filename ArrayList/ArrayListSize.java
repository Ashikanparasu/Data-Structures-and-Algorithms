import java.util.ArrayList;

public class ArrayListSize {

    public static void main(String args[]){
        ArrayList <Integer> List = new ArrayList <> ();

        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);

        System.out.println(List.size());

        for(int i = 0; i< List.size();i++){
            System.out.print(List.get(i)+ " ");
        }
    }
    
}
