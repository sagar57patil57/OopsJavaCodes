public class Sag{

    public <E> void printArray(E []array){
        for(E data:array){
            System.out.println(data);
        }
    }
    public static void main(String [] args)
    {
        Sag s = new Sag();
        String[] names = new String[] { "sagar", "raju", "patil" };
        Integer[] points = new Integer[] { 1, 5, 6 };
        s.printArray(names);
        s.printArray(points);
    }
}