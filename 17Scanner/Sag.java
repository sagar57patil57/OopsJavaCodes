import java.util.Scanner;

public class Sag
{
    public static void main(String [] args)
    {
        System.out.println("Enter Name and age");
        Scanner sc = new Scanner(System.in);    //std input stream 
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Hi : " + name + " - " + age);
    }
}