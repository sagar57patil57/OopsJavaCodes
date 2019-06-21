//return type doesnt matter

class A{
    public void eat(int x){
        System.out.println("A is eating "+x+"apples");
    }
}

class B extends A{
    public void eat(int x, int y){
        int z = x+y;
        System.out.println("B is eating "+z+"apples");
    }
}

public class SagLoad
{
    public static void main(String [] args)
    {
        B obj1 = new B();
        obj1.eat(1);    //from A
        obj1.eat(2,4);  //from B
    }
}