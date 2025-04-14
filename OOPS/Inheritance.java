public class Inheritance {
    

    public static void main (String args[]){


        Fish Shark = new Fish ();
        Shark.eat();
    }

    static class Animal {
        String color;
        void eat(){
            System.out.println("eats");
        }

        void breath(){
            System.out.println("breathes");

        }
    }
    static class Fish extends Animal{
        int fins;

        void swin(){
            System.out.println("Swin");
        }
    }
}
