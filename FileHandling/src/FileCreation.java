import java.io.File;
import java.io.IOException;
public class FileCreation {
    public static void main(String[] args) throws IOException {
        String filename = "new1.txt";

        File f1 = new File(filename);
        f1.createNewFile();

        File f2 = new File("new2.txt");
        f2.createNewFile();

        File f3 = new File(f1,"new3.txt");
        File f4 = new File("C:\\new4.txt");

        System.out.println("\n\n******************************f1***************************");
        System.out.println("name : "+f1.getName());
        System.out.println("path : "+f1.getPath());
        System.out.println("absolute path : "+f1.getAbsolutePath());
        System.out.println("parent : "+f1.getParent());
        System.out.println("exist : "+f1.exists());
        System.out.println("can read : "+f1.canRead());
        System.out.println("can write : "+f1.canWrite());

        System.out.println("\n\n******************************f2***************************");
        System.out.println("name : "+f2.getName());
        System.out.println("path : "+f2.getPath());
        System.out.println("absolute path : "+f2.getAbsolutePath());
        System.out.println("parent : "+f2.getParent());
        System.out.println("exist : "+f2.exists());
        System.out.println("can read : "+f2.canRead());
        System.out.println("can write : "+f2.canWrite());

        System.out.println("\n\n******************************f3***************************");
        System.out.println("name : "+f3.getName());
        System.out.println("path : "+f3.getPath());
        System.out.println("absolute path : "+f3.getAbsolutePath());
        System.out.println("parent : "+f3.getParent());
        System.out.println("exist : "+f3.exists());
        System.out.println("can read : "+f3.canRead());
        System.out.println("can write : "+f3.canWrite());

        System.out.println("\n\n******************************f4***************************");
        System.out.println("name : "+f4.getName());
        System.out.println("path : "+f4.getPath());
        System.out.println("absolute path : "+f4.getAbsolutePath());
        System.out.println("parent : "+f4.getParent());
        System.out.println("exist : "+f4.exists());
        System.out.println("can read : "+f4.canRead());
        System.out.println("can write : "+f4.canWrite());
    }
}