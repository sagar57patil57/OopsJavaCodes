public class Sag
{    public static void main(String[] args)
    {
        int x = 3;
        float y = (float)2.2;
        byte z = 1; //-128 to 127
        short a = 300; //-32k to +32k... 2 bytes i.e.16 bits
        long b = 200000000; //10^18

        //widening conversion (legal)
        y=x;

        //narrow conversion (illegal)
        //x=y;
    }
}