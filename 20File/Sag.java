/*FILE CLASS

file class obj contains ref to metadata of file and doesnot refer to file
*/
import java.io.*;

public class Sag
{
    public static void main(String [] args) throws IOException
    {
        File f1 = new File("test1.txt");
        //f1.createNewFile();   //creates a file
        System.out.println(f1.exists());
        System.out.println(f1.length());
        System.out.println(f1.getName());

        //write
        //FileOutputStream fout = new FileOutputStream("test1.txt", true);    //true=>append mode
        //String s = "sagar is great";
        //char ch[] = s.toCharArray();
        //for(int i=0; i<s.length(); i++){
        //    fout.write(ch[i]);
        //}

        //read
        // FileInputStream fin = new FileInputStream("test1.txt");
        // int asciiVal;
        // do{
        //     asciiVal = fin.read();
        //     if(asciiVal!=-1){
        //         System.out.print((char)asciiVal);
        //     }
        // }while(asciiVal!=-1);

        //buffered input    uses temp buffer for fast writing
        FileWriter fw = new FileWriter("test1.txt");
        BufferedWriter bf= new BufferedWriter(fw);
        bf.write("shut up");
        bf.close();
    }
}