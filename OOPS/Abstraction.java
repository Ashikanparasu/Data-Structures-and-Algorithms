public class Abstraction {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.walk();
    }}
    



abstract class Animal {

    String Color;
    Animal(){
        Color = "White";

    }
     void eat(){
        System.out.print("Animal Eat");
     }

     abstract void walk();
}

class Horse extends Animal{
    void ChangeColor(){
        Color = "DARk";
    }
    void walk (){
        System.out.println("Walks on 4 legs");

    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walks In 2 Leg");
    }
}