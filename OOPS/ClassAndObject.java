
public class ClassAndObject {

  public static  class Pen {
        String color;
        int tip;

        void setColor(String newColor){
            color = newColor;
        }

        void steTip(int newTip){
            tip = newTip;
        }
    }

    class Student{

        String name;
        int age;
        float percentage;

        void calcPer(int phy,int chem, int math){
            percentage = phy +chem+math/3;
        }
    }

    public static void main (String args[]){

        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);


    }
    
}
