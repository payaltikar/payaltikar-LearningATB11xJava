package ex_18_OOPs;

public class Lab03_OOP_P3 {
    public static void main(String[] args) {

        Animal A1=new Animal();
        A1.Breed="Lab";
        A1.Is_Predotor("As per Foodchain");

        Humans H1=new Humans();
        H1.job(500000);


    }

}

class Humans{
    String Name;
    int age;
    double salary;
    double job(double salary){
        return salary;
    }

}

class Animal{
    String Breed ;
    int age;

    void Can_run(){
        System.out.println("Running!!");
    }

    String Is_Predotor(String Feed){
        return Feed;
    }
}