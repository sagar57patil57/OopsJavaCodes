package mypack;
public class Student
{
    private int rollNo;
    private String name;
    public void setData(int x, String name){
        this.rollNo = x;
        this.name = name;
    }

    public void getData(){
        System.out.println(rollNo);
        System.out.println(name);
    }
}