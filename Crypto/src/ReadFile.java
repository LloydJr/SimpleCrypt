package Crypto.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    static ROT13 newCrypt = new ROT13();

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/lloyd/Desktop/projects/SimpleCrypt/sonnet18.txt");
        Scanner scan = new Scanner(file);

        String fileContent = "";
//        while(scan.hasNext()){
//            System.out.println(scan.nextLine());
////            System.out.println(newCrypt.crypt(scan.nextLine()));
//
//        }
        while (scan.hasNext()) {
//            System.out.println(newCrypt.crypt(scan.nextLine()));
            fileContent = fileContent.concat(newCrypt.crypt(scan.nextLine() + "\n" ));
        }

        FileWriter writer = new FileWriter("/Users/lloyd/Desktop/projects/SimpleCrypt/sonnet18.enc");
        writer.write(fileContent);
        writer.close();
    }
}
