import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) throws Exception {

        System.out.println("\n******new1.txt*******************************************************");

        File f = new File("new1.txt");
        Scanner scan = new Scanner(f);
        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }

        System.out.println("\n******new2.txt********************************************************");

        FileReader fr = new FileReader("new2.txt");
        int i;
        while( (i= fr.read()) != -1){
            System.out.print( (char)i );
        }
        fr.close();
    }
}
