public class stringCharAt {

    public static void Printletter(String name){
        for(int i =0; i< name.length(); i++){
            System.out.print(name.charAt(i) + " ");
        }
    }
    public static void main(String[] args) {
        String Fullname = "Ashik Anparasu";

        System.out.println(Fullname.charAt(0));

        Printletter(Fullname);

    }
    
}
