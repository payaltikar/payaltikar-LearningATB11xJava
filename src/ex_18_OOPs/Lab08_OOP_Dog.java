package ex_18_OOPs;

public class Lab08_OOP_Dog {
    public static void main(String[] args) {
        Dog D1=new Dog();
        D1.Breed="Lab";
        D1.age=5;
        D1.Eat("Pedegree");
        D1.Run();
        System.out.println("I am a "+ D1.Breed+ " my name is Oggy");
    }

}
 class Dog{

    String Breed;
    int age;

    String Eat(String food){
        System.out.println(food);
        return food;
    }

    void Run(){
        System.out.println("Dog is running faster......");
    }
 }