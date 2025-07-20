import java.util.*;
public class ValidParentheses {

    public static Boolean valid(String a){

        Stack <Character> s = new Stack<>();

        for(int i =0; i<a.length(); i++){
            if(a.charAt(i)=='('|| a.charAt(i)=='[' || a.charAt(i)=='{' ){
                s.push(a.charAt(i));
            }else{
                if(s.isEmpty()){

                    return false;
                }

                if((s.peek() == '(' && a.charAt(i)=='(') 
                || (s.peek() == '[' && a.charAt(i)=='[') 
                || (s.peek() == '{' && a.charAt(i)=='{')){

                    s.pop();
                }else{
                    return false;
                }

            }
            
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String [] args){

        String str = "[]{})";
        System.out.print(valid(str));



    }
    
}
