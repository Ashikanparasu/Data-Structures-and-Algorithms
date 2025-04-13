

public  class AccessModifiers {

    static class BankAccount{

        public String Username;
        private String password;

        public void setPassword(String pwd){
            password = pwd;
        }

    }
    


    public static void main (String args[]){

        BankAccount BA = new BankAccount();

        BA.Username = "Ashik A";
        BA.setPassword("Ashik1234");
        System.out.println(BA.Username);

    }
}
