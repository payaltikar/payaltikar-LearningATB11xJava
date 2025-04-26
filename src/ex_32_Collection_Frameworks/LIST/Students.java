package ex_32_Collection_Frameworks.LIST;

public class Students {
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

    public Students(String SName, int id) {
        this.SName = SName;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Name: " + this.SName+ "\t"+ "id: "+ this.id;
    }
}
