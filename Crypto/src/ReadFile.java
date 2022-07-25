package Crypto.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    static ROT13 newCrypt = new ROT13();

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/lloyd/Desktop/projects/SimpleCrypt/sonnet18.txt");
        Scanner scan = new Scanner(file);

//        while(scan.hasNext()){
//            System.out.println(scan.nextLine());
//        }
        while (scan.hasNext()) {
            System.out.println(newCrypt.crypt(scan.nextLine()));
        }
    }
}
