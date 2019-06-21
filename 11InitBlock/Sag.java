//Instance Init Block
//Initialization blocks are executed whenever the class is initialized and before constructors are invoked.
/*
public class Sag
{
    private int x;
    
    {   //IIB(instance) it will run for every obj b4 constr works
        x = x+1;
    }

    public Sag(){
        System.out.println(x);  //here x=1 bcoz of iib
        x = 5;
    }

    public static void main(String [] args)
    {
        Sag s1 = new Sag();
        System.out.println(s1.x);
    }
}*/



//Static Init Block
//In the entire program, the Static Initialization Block will execute only one time. There can be many Static Initialization Blocks in a specific class. 
//If we have many Static Initialization Blocks in Java then they are called in a manner in the order they are written in the program. 

public class Sag
{
    private static int x;
    
    static
    {   //SIB(static) it will run only once
        x = x+1;
    }

    public static void main(String [] args)
    {
        System.out.println(Sag.x);
    }
}