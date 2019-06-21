interface In1{  //only contains vars and fun without body(i.e. prototype)
    int x = 3;  //public, static, final complusory
    void fun(); //public, abstract
}
//interface DONT have CONSTRUCTOR BCOZ data is static

class A implements In1{ //so if we dont override fun of In1 then A will be abstract
    public void fun(){
        System.out.println("I overrided fun() in In1");
    }
}

public class Sag
{
    public static void main(String [] args)
    {
        A obj1 = new A();
        obj1.fun();
    }
}


//INTERFACE vs ABSTRACT

//I: all public
//A: not necessary

//I:contains only abstr fun
//A:contain any fun

//I:no constructor, var are final,static
//A:constr is allowed, var can be anything

//I:eg. Admission process
//A:eg. Area of shape() which will have children rect,sq,etc.