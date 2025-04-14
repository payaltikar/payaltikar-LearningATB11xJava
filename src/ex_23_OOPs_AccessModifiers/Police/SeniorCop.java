package ex_23_OOPs_AccessModifiers.Police;

public class SeniorCop {
    public static void main(String[] args) {
        Cops c1=new Cops(100,"Abc");
        System.out.println(c1.getCopName());
        // if I am not an authorized person then I can't chnge value here
        c1.setGun(150,"Authorized") ;
        System.out.println(c1.getGun());
        c1.CanIShoot() ;
    }
}
