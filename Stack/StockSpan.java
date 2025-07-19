import java.util.*;
public class StockSpan {


    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> s =new Stack<>();
        s.push(0);
        span[0] = 1;

        for(int i = 1;  i<stock.length;i++){

            int curr = stock[i];

            while(!s.isEmpty() && curr > stock[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                span[i]= i+1;
            }else{
                int prev = s.peek();
                span[i]= i - prev;

            }
            s.push(i);
        }

    }



    public static void main(String [] args){

        int stock []= {100,80,60,70,60,85,100};
        int span [] = new int[stock.length];

        stockSpan(stock,span);

        for(int i =0; i<span.length;i++){
            System.out.print(span[i] + " ");
        }


    }
    
}
