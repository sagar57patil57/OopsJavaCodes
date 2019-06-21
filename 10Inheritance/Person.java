package pack1;

public class Person
{
    private int age;
    private String name;

    public void setPerson(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void getPerson(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
}