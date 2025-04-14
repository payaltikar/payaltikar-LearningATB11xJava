package ex_23_OOPs_AccessModifiers.Police;

public class JuniorCop {
    public static void main(String[] args) {
        Cops J1=new Cops(100,"xyz");
        System.out.println(J1.getCopName());
        // if I am not an authorized person then I can't chnge value here
        J1.setGun(150,"xyz") ;
        System.out.println(J1.getGun());
        J1.CanIShoot() ;
    }
}
