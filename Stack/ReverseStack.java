import java.util.Stack;
public class ReverseStack {

    public static void pushAtBottomm(Stack<Integer> s, int val){
        while(s.isEmpty()){
            s.push(val);
            return;
        }

        int top = s.pop();
        pushAtBottomm(s,val);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s1){

        

        while(s1.isEmpty()){
            return;
        }

        int top = s1.pop();
        reverseStack(s1);
        pushAtBottomm(s1,top);

        

    }

    public static void main(String [] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        reverseStack(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
}
