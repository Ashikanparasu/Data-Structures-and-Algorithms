public class HierarchialInHeritance {
    
    public static void main(String args[]){


    }

    static class Animal{

        String color;

        void eat(){
            System.out.println("Eats");

        }

        void breath (){
            System.out.println("Breaths");

        }
    }

    static class Mammal extends Animal{

        void walk(){
            System.out.println("Walk");
        }


    }

    static class Fish extends Animal {
        void swim(){
            System.out.println("Swim");
        }
    }

}
