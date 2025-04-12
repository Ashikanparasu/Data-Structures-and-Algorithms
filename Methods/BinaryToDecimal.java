

public class BinaryToDecimal {

    public static void BintoDec(int num){

        int pow =0;
        int decNum =0;

        while(num >0){
            int lasdig = num % 10;
            decNum = decNum +(lasdig * (int)Math.pow(2,pow));

            pow++;
            num = num/10;
        }
        System.out.println(decNum);

    }

    public static void main (String args[]){

BintoDec(101);

    }
    
}
