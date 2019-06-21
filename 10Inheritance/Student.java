package pack1;
import pack1.Person;

public class Student extends Person
{
    private int rollNo;

    public void setStudent(int roll){
        this.rollNo = roll;
    }
    public void getStudent(){
        System.out.println(this.rollNo);
    }
}