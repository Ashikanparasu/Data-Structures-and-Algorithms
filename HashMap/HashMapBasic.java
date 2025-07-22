import java.util.*;

public class HashMapBasic {

    public static void main(String [] args){

    
    HashMap<String ,Integer> Hm = new HashMap();

    Hm.put("Apple",1);
    Hm.put("Mango", 66);
    Hm.put("Orange",100);

    System.out.println(Hm);

    System.out.println(Hm.get("Apple"));

    System.out.println(Hm.size());

    Hm.clear();

    System.out.println(Hm.isEmpty());

    





    } 
}
