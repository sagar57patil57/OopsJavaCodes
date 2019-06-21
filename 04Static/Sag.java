/*//static var

public class Sag
{    
    int x;  //instance var :made for every obj
    static int counter = 0; //global for all obj i.e. an obj will not have counter as its property 
    // it can be accessed before any objects of its class are created, and without reference to any object
    public static void main(String[] args)
    {
        Sag.counter++;  //access b4 creating any objs
        Sag obj1 = new Sag();
        obj1.x = 2; //but obj1 doesnot have counter so cant access
        Sag.counter++;
        System.out.println(Sag.counter);    //remember In className.something : something is always static
    }
}*/

/*//static fun

public class Sag
{    
    int x;
    static int counter = 0; 
    
    public static void myFun(){     //only static fun and className. can access static var
        System.out.println("I am static fun");
        counter = 20; 
    }
    
    public static void main(String[] args)
    {
        Sag.myFun();
        System.out.println(Sag.counter);
    }
}*/


/*//static blocks are used to init static vars

public class Sag
{    
    int x;
    static int counter = 0,k; 
    static{
        counter++;
        k = counter*23;
    }
    
    
    public static void main(String[] args){
        System.out.println(Sag.k);
    }
}
*/


//static class
//only nested classes can be static
//A static class is a class that can't be instantiated. The sole purpose of the class is to provide blueprints of its inherited classes.

class Test{
    static public void help(){
        System.out.println("I am static fun");
    }

    static class Example{
        public static String country = "England";
    }
}

public class Sag
{
    public static void main(String[] args){
        Test.help();
        System.out.println(Test.Example.country);
    }
}
