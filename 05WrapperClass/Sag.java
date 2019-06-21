//A Wrapper class is a class whose object wraps or contains a primitive data types

//Need :-
//The classes in java.util package handles only objects and hence wrapper classes help in this case also
//Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types

public class Sag
{
    public static void main(String [] args)
    {
        //VALUEOF
        //public static Integer valueOf(int a)
        //public static Integer valueOf(String str)
        //public static Integer valueOf(String str, int base)
        Integer y = Integer.valueOf("123");  //valueOf is static fun thus className.function() is used       
        System.out.println(y);
        System.out.println(Integer.valueOf("101",2));   //bin to int obj
        //PARSEXXX
        int x = Integer.parseInt("123");
        System.out.println(x);
        //XXXValue : Integer to int
        Integer i1 = new Integer(89);
        int i2 = i1.intValue();
        System.out.println(i2);
    }
}