//we can make anonymous class only inside a class, not as outer class
//it has only the fun which override the parent class fun

class Gretter{
    void fun(){
        System.out.println("heyy");
    }

    void nofun(){
        System.out.println("i will run in anonymous class bcoz i am not overriden");
    }
}

class India{
    //Gretter g = new Gretter(); means we can use other class's obj any other class
    Gretter g = new Gretter() { //{  } represents anonymous child class of Gretter class(same as inherited)
        void fun(){
            System.out.println("only overriden fun run in anonymous bcoz ref var is of Parent so it can access only parent methods which are overriden");
        }   
    };
}

public class Sag
{
    public static void main(String [] args)
    {
        India i1 = new India();
        i1.g.nofun();
        i1.g.fun();
    }
}
/**documentation comment */