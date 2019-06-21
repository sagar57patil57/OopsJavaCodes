class Box{  //A class is a user defined blueprint from which objects are created
    private int len,bre,hei;
    
    public void get(){  //getter
        System.out.println("len: " + len);
        System.out.println("bre: " + bre);
        System.out.println("hei: " + hei);
    }   
    public void set(int l, int b,int h){    //setter
        this.len = l;
        this.bre = b;
        this.hei = h;
    } 
}

public class Sag
{
    public static void main(String[] args)
    {
        Box smallBox = new Box();   //smallBox is refer var and contains address
        smallBox.get(); //Objects have states and behaviors
        smallBox.set(1, 2, 3);
        smallBox.get();
    }
}