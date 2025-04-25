package Task;

public class Task018_OOPs_Encapsulation_Access_Modifiers {
    public static void main(String[] args) {
        Bank BOM=new Bank();
        System.out.println(BOM.BankName);
        BOM.getAccountsInBank();
        BOM.setAccountsInBank(100);
        BOM.getAccountsInBank();

    }


}



class Bank{
    String BankName;
    private int AccountsInBank;

    public int getAccountsInBank() {
        return AccountsInBank;
    }

    public void setAccountsInBank(int accountsInBank) {
        if(accountsInBank==100){
            this.AccountsInBank = accountsInBank;

        }else{
            System.out.println("you are not an authorized person");
        }
    }
}


class customer{
    private String Cname;

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    private int AccNo;

    customer(){} // DC
    customer(int AccNo){ //PC
        System.out.println("Account no"+ AccNo);
    }

    public void DisplayTransaction(){
        System.out.println("Transaction successful;");
    }

    public int CheckBal(int Bal){

        System.out.println("your Bank Balance : "+ Bal);
        return Bal;
    }

}