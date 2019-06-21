class A{
    int z=1;
    public void fun1(){
        System.out.println("I am parent");
    }
}

class B extends A{
    int z=2;
    public void fun2(){
        int z=3;
        z=z+this.z+super.z; //here 3+2+1
        System.out.println("I am child " + z);
        super.fun1();   //parent called with super
    }
}

public class Sag
{
    public static void main(String [] args)
    {
        B obj1 = new B();
        obj1.fun2();
    }
}