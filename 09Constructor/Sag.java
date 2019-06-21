//constr is called auto when obj is created and has no return type
//it inits obj

public class Sag
{
    //public Sag(){  } : this is default constructor
    private int a,b,c;
    public Sag(){
        this.a = 1;
        this.b = 2;
        this.c = 3;
    }

    public Sag(int a, int b, int c){   //parameterized C
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String [] args)
    {
        Sag s1 = new Sag();
        Sag s2 = new Sag(6,7,8);
        System.out.println(s1.a);
        System.out.println(s2.a);
    }
}