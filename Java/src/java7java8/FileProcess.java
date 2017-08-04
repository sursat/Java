package java7java8;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by prasad on 13/7/17.
 */
public class FileProcess {

    static File[] allFiles = new File(".").listFiles(new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.isFile();
        }
    });


    static File[] allFiles8 = new File(".").listFiles(File::isFile);

    public static void main(String[] args) {
        System.out.println("------------");
        for (File file:allFiles) {
            System.out.println(file.getName());
        }
        System.out.println("------------");
        System.out.println("------------");
        for (File file:allFiles8) {
            System.out.println(file.getName());
        }
        System.out.println("------------");
    }
}
