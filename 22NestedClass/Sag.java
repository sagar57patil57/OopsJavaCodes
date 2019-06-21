/*
You cannot use the static keyword with a class unless it is an inner class. 
A static inner class is a nested class which is a static member of the outer class. 
It can be accessed without instantiating the outer class, using other static members
*/

//nested class can be static or non-static
//if static: then inner class can be accessed as Outer.Inner
//it can access only static members and data of outer class

//if non-static: then inner class has to make ref var of outer class then make new obj of inner class stored in the refer var of outer class
//it can access any members and data of outer class


//STATIC INNER CLASS
/*
class Outer{
    static int x=3;
    int y=6;
    static class Inner{
       static void inner_fun(){
        System.out.println("Static Data: " + x);
       }
       //System.out.println("Cannot access non-static Data: " + y);   //Invalid 
    }
}

public class Sag
{
    public static void main(String [] args)
    {
        Outer.Inner obj1 = new Outer.Inner();   //FOCUS since Inner is static it can be accessed by className.Inner
        obj1.inner_fun();
    }
}*/


//NON-STATIC

class Outer{
    static int x=3;
    int y=6;
    class Inner{
        void inner_fun(){
        System.out.println("Static Data: " + x);
        System.out.println("Non-static Data: " + y);
        }
    }
}

public class Sag
{
    public static void main(String [] args)
    {
        Outer out = new Outer();
        Outer.Inner inn = out.new Inner();
        inn.inner_fun(); 
    }
}