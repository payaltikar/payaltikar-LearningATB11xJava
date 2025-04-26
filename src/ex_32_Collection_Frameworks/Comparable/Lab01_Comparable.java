package ex_32_Collection_Frameworks.Comparable;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lab01_Comparable {
    public static void main(String[] args) {
        Student s1=new Student("tinu",101);
        Student s2=new Student("cinu",109);
        Student s3=new Student("pinya",107);

        List Studentlist=new ArrayList();
        Studentlist.add(s1);
        Studentlist.add(s2);
        Studentlist.add(s3);

        Collections.sort(Studentlist);
        System.out.println(Studentlist);
    }
}
class Student implements Comparable <Student>{
    private String SName;
    private int id;


    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String SName, int id) {
        this.SName = SName;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Name: " + this.SName + " id: "+ this.id + "\t" ;
    }


    public int compare(Student o) {
        return this.id -o.id;
    }

    @Override
//    public int compareTo(Student o) {
//        return this.id-o.id;
//    }
    public int compareTo(Student o) {
        return this.SName.compareTo(o.SName);
    }
}
