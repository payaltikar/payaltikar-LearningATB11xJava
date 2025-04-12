package Task;

public class Task017_OOPs_Constructor_Creation {
    public static void main(String[] args) {
    Person p1=new Person();
    Person p2=new Person("Payal",23,"pune",706640,false);
    //The Name value ("Payal") is passed correctly, but never stored in the object's Name field. As a result, this.Name remains null in output
        p2.doHome();
        p2.Name="payal";
        p2.doHome();//there is a diffrence in output

    Person p3=new Person("maya",21,"pcmc",908087766);
    p3.walk();
    }
}
class Person{
    String Name;
    int age;
    String Address;
    long Phone;
    boolean Is_Male;

    void eat(){
        System.out.println(this.Name+ " is Eating!!");
    }
    void walk(){
        System.out.println(this.Name+" walking!!");
    }
    void sleep(){
        System.out.println(this.Name+ " is Sleeping!!");
    }
    void doHome(){
        System.out.println(this.Name+ " is Doing Homework!!");
    }

    //Default constructor

    Person(){
        //By Default values
        System.out.println("This is default constructor");
    }

    Person(String Name,int age,String Address,long Phone,boolean Is_Male){
        //Parametrized constructor
        System.out.println("This is default constructor");
    }


    Person(String Name,int age,String Address,long Phone){
        this.Name="xyz";
        this.age=22;
        this.Address="pcmc";
        this.Phone=9080868;
        this.Is_Male=false;
        //Parametrized constructor with fewer fields than above constructor
        System.out.println("This is default constructor");
    }
}