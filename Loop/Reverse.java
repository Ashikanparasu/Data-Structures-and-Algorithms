public class Reverse {

    public static void main(String args[]) {

        int num = 19012006;

        while (num != 0) {
            int last = num % 10;
            System.out.print(last + " ");
            num = num / 10;
        }
    }
}
