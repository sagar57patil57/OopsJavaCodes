import java.io.*; 
import java.util.*;

public class ArrList
{
    public static void main(String [] args)
    {
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        arrli.add(2);
        arrli.add(1);
        arrli.add(4);
        arrli.remove(1);    //index 1
        arrli.forEach((n) -> print(n));
        boolean x = arrli.contains(2);  //search
        System.out.println("Len: " + arrli.size() + "\n" + x);
    }

    public static void print(int n){
        System.out.println(n);
    }
}