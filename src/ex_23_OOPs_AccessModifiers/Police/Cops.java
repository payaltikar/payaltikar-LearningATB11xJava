package ex_23_OOPs_AccessModifiers.Police;

public class Cops {
    private int Gun;
    private String CopName;

    public int getGun() {
        return Gun;
    }

    public void setGun(int gun,String Id) {
        if(Id.equals("Authorized")){
            Gun = gun;
        }else{
            System.out.println("not allwed to use gun with bulllets!! ");
        }
    }

    public String getCopName() {
        return CopName;
    }

    public void setCopName(String copName) {
        CopName = copName;
    }
// Para constructor
    protected Cops(int Bullet,String CopName){
         this.Gun=Bullet;
         this.CopName =CopName;
     }

    //method
    public void CanIShoot(){
        System.out.println("Shooting..");
    }
}

