package ex_23_OOPs_AccessModifiers.Criminal;

import ex_23_OOPs_AccessModifiers.Police.Cops;

public class Thief {
    public static void main(String[] args) {
        // Aww In this case thief is also able to access Cops behaviour--> so thats why we need to make Cops as protected
        // so this is not allowed here after making Cops protected


//        Cops thief=new Cops(100,"IamAThief");
//        System.out.println(thief.getCopName());
//        // if I am not an authorized person then I can't chnge value here
//        thief.setGun(150,"XYZ") ;
//        System.out.println(thief.getGun());
//        thief.CanIShoot() ;
    }
}
