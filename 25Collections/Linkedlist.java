import java.io.*; 
import java.util.*;

public class Linkedlist
{
    public static void main(String [] args)
    {
        LinkedList<String> arrli = new LinkedList<String>();
        arrli.add("sagar");
        arrli.add("man");
        arrli.addFirst("patil");
        arrli.addLast("monster");
        arrli.removeLast();    //index 1
        arrli.forEach((n) -> print(n));
        boolean x = arrli.contains("patil");  //search
        System.out.println("Len: " + arrli.size() + "\n" + x);

        arrli.set(2, "replace index2");
        arrli.get(0);//index 0
        arrli.forEach((n) -> print(n));
    }

    public static void print(String n){
        System.out.println(n);
    }
}