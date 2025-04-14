public class Overriding {
    
    public static void main(String args []){

        Deer dr = new Deer();
        dr.eat();
    }

    static class Animal{
        void eat (){
            System.out.println("Eat");
        }
    }

    static class Deer extends Animal{

        void eat(){
            System.out.println("Eat Grass");
        }
    }

}
