package ex_28_Enum;

import java.awt.*;

public class Colors {
//    RED("#FF0000"),
//    GREEN("#61FF33"),
//    BLUE("#3377FF"),
//    YELLOW("#4477FF");


    private String hexCode;
    Colors(String hexCode){
        this.hexCode = hexCode;
    }

    String getHexCode(){
        return this.hexCode;
    }


}
