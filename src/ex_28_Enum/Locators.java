package ex_28_Enum;

public class Locators {
    public static Locators page_button;

//    page_button("#btn"),
//    page_input("#input1");

    private String locators;

    Locators(String locators){
        this.locators = locators;
    }

    String getLocators(){
        return this.locators;
    }

}
