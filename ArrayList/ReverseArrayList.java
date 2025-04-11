import java.util.ArrayList;

public class ReverseArrayList {

    public static void main(String args[]){
        ArrayList <Integer> List = new ArrayList <> ();

        List.add(11);
        List.add(22);
        List.add(33);
        List.add(44);
        List.add(55);

        int i = List.size() - 1;
        for(i=i ; i>=0; i--){
            System.out.print(List.get(i)+ " ");
        }
    }
    
}
