package ex_20_OOPs_Inheritance.Single_Inheritance.java;

public class TestCase2 extends Lab02_Common_to_All{
    void runningTC2(){
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}

