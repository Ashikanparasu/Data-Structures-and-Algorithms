public class stringSubstring {

    public static String Substring(String Name , int Start ,int End){
        String SubString = "";
        for (int i = Start; i < End ; i ++){
            SubString += Name.charAt(i);
        }
        return SubString;
    }
    public static void main(String[] args) {
        
        String Name = "Ashik A";


        System.out.print(Substring(Name ,0,4));
        System.out.println(Name.substring(0,6));

    }
    
}
