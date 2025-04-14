package ex_22_OOPs_Encapsulation;

public class Lab02_EX2_Bank {
    public static void main(String[] args) {
        Bank b1=new Bank("HDFC",5000000);
        System.out.println(b1.getBankBal());
        b1.setBankBal(8000000,"Authorized") ;
        System.out.println(b1.getBankBal());

    }
}
class Bank{
    private String BankName="BOI";
    private long BankBal=10000000;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public long getBankBal() {
        return BankBal;
    }
// instead of boolean we can use other data types also for making limited and authorized access
    public void setBankBal(long bankBal,String cashier) {
       if(cashier.equals("Authorized")){
           BankBal = bankBal;
       }else{
           System.out.println("Not allowed to change balance - unauthorized access");
       }
    }

    public Bank(String name, long Bal){
        this.BankName=name;
        this.BankBal=Bal;
    }
}

