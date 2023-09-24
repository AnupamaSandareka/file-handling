import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriting {

    public static void main(String[] args) throws IOException {

        //overwrite a file
        FileWriter fw1 = new FileWriter("new1.txt");

        //append a file
        FileWriter fw2 = new FileWriter("new2.txt",true);

        //create and write a file
        File f2 = new File("myfile.txt");
        FileWriter fw3 = new FileWriter(f2);

        fw1.write("Java File Handling.\n");
        fw2.write("Good Luck.\n");
        fw3.write(123); //ascii character 123= '{'
        fw1.close();
        fw2.close();
        fw3.close();
    }
}
