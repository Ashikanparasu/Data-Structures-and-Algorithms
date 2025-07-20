import java.util.*;
public class ReverseString {

    public static String reverseString(String a){
        Stack <Character> s = new Stack <>();
        for (int i =0; i<a.length();i++){
            s.push(a.charAt(i));
        }

        StringBuilder b = new StringBuilder("");
        for(int i = 0; i <a.length();i++){
            b.append(s.pop());

        }
        return b.toString();
    }


    public static void main (String [] args){
        String a = "Ashik";
        System.out.println(reverseString(a));

    }
    
}
