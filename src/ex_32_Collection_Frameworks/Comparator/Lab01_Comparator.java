package ex_32_Collection_Frameworks.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab01_Comparator {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("car",21,50.00);
        Vehicle v2=new Vehicle("bike",30,80.00);
        Vehicle v3=new Vehicle("cycle",5,1000.00);

        List Vlist=new ArrayList();
        Vlist.add(v1);
        Vlist.add(v2);
        Vlist.add(v3);

        //Collections.sort(Vlist,new ModelComparator() );
        Collections.sort(Vlist,new VnameComparator() );
        System.out.println(Vlist);



    }
}

class ModelComparator  implements Comparator<Vehicle>{

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getModel()-o2.getModel();
    }
}
class VnameComparator  implements Comparator<Vehicle>{

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getVName().compareTo(o2.getVName());
    }
}

class Vehicle{
    private String VName;
    private Integer model;
    private Double prize;

    @Override
    public String toString() {
        return "Vehicle{" +
                "VName='" + VName + '\'' +
                ", model=" + model +
                ", prize=" + prize +
                '}';
    }

    public Vehicle(String VName, Integer model, Double prize) {
        this.VName = VName;
        this.model = model;
        this.prize = prize;
    }

    public String getVName() {
        return VName;
    }

    public void setVName(String VName) {
        this.VName = VName;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Double getPrize() {
        return prize;
    }

    public void setPrize(Double prize) {
        this.prize = prize;
    }

}