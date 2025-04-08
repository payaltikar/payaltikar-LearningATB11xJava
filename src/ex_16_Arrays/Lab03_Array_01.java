package ex_16_Arrays;
//Not only integer but any of the data type we can used as an array!!

public class Lab03_Array_01 {
    public static void main(String[] args) {
        String[] Names={"payal","ABC","CID","XYZ"};

        // simple way of printing
        System.out.println(Names.length);
        System.out.println(Names[0]);
        System.out.println(Names[1]);
        System.out.println(Names[2]);
        System.out.println(Names[3]);

        System.out.println("______");
        //Second way of printing using lop
        String names[]=new String[3];
        names[0]="ABC";
        names[1]="abcd";
        names[2]="EFGH";

        for(int i=0;i<names.length;i++) {
            System.out.println(names[i]);
        }

        System.out.println("______");

            boolean[] is_male_data = new boolean[2];
            is_male_data[0] =  true;
            is_male_data[1] =  false;

            for(int i=0;i<is_male_data.length;i++) {
                System.out.println(is_male_data[i]);
            }

    }
}
