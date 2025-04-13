

public class Constructors {

    public static void main (String args[]){

        Student s1 = new Student("Ashik");
        System.out.println(s1.name);

    }

   static  class Student {
        String name;
        int roll;

        Student(String name) {
            this.name = name;
        }
    }
    
}
