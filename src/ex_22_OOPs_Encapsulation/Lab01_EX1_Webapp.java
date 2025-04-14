package ex_22_OOPs_Encapsulation;

public class Lab01_EX1_Webapp {
    public static void main(String[] args) {
        // Encapsulation it is process of bundling attribute and behaviour together
        // Data hiding / controlling process
        // Class--> Attribute + Behaviour(Here we are hiding Attribute and showing behaviour)
        // Attributes are controlled(protected) but we can access it with the of getter and setter

        SDETClub_login s1=new SDETClub_login("Payal",1234);
        System.out.println(s1.username);
        System.out.println(s1.password);
        s1.password=9086;
        System.out.println(s1.password);

        System.out.println("_____________");

        SafeSDETClub_login s2=new SafeSDETClub_login("admin",7066);
        s2.setUsername("Tikar");
        System.out.println(s2.getUsername());
        System.out.println(s2.getPassword());
        s2.setPassword(6672,false);
        System.out.println(s2.getPassword());

    }
}

// This class is for ex of how usr and pass can accessible to anyone if we r not using Encapsulation
class SDETClub_login{
    // if you are making attributes public then it is easily accessible
    public String username;
    public int password;

    SDETClub_login(String usr,int pass){
        this.username= usr ;
        this.password= pass;

    }
}

// This class is created to showing that how using Encapsulation works and make things protected and controlled accessible!!

class SafeSDETClub_login {

    private String username;
    private int password;

    // it is type 3 -parameterized constructor
    public SafeSDETClub_login(String usr, int pass) {
        this.username = usr;
        this.password = pass;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    // controlled accessed so that no one can modify the password

    public void setPassword(int password, boolean Isadmin) {
        if (Isadmin) {
            this.password = password;
        } else {
            System.out.println("Not allowed to change the password");
        }
    }
}


