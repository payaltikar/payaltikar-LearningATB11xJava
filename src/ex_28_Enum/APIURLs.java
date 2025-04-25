package ex_28_Enum;

public class APIURLs {
//    vwo("https://app.vwo.com"),
//    katalon("https://katalon.com"),
//    google("https://google.com");

    private String url;

    APIURLs(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }


}