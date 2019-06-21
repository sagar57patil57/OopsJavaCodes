/*//1D array

public class Sag
{
    public static void main(String [] args)
    {
        int[] arr;//this is only a refer to an array    //1
        arr = new int[10];  //arr points to array
        
        int[] myArr = new int[]{ 1,2,3 };               //2

        int[] theArr = { 1,2,3 };                       //3
        System.out.println(theArr.length);
    }
}*/

//2D array

public class Sag
{
    public static void main(String [] args)
    {
        int[][] mat = new int[4][];
        mat[0] = new int[5];
        mat[1] = new int[3];
        mat[2] = new int[1];
        mat[3] = new int[2];
        System.out.println(mat[2].length);
    }
}