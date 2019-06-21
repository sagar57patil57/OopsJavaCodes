//In Inheritance, 
//Overridding is used if child wants to change implementation of parents fun

//no of args can be same
class A{
    public void eat(int x){
        System.out.println("I like Lion");
    }
}

class B extends A{
    public void eat(int x){ //eat overrides parents eat
        System.out.println("I like Tiger");
    }
}

public class SagRide
{
    public static void main(String [] args)
    {
        B obj1 = new B();
        obj1.eat(1);    //from B
    }
}