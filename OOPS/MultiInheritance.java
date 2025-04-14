public class MultiInheritance {
    
    public static void main(String args[]){

        type TT = new type ();

        TT.count = 5;
        System.out.println(TT.count);

    }

    static class animal {
        int count;

    }

    static class Mamel extends animal{
        String Name ;
    }

    static class type extends Mamel{
        String Type;
    }
}
