//final var:    init only once
//final fun:    cannot be overriden
//final class:  cannot be a parent class

public class Sag
{
    private final int instanceVar;  //value can be assigned only once using either constructor,IIB or in the declaration itself
    
    {   //IIB
        instanceVar = 3;    //done
    }
    public static void main(String [] args)
    {
        System.out.println("Hello World");
    }
}