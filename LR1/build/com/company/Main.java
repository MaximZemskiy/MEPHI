package com.company;

import org.apache.commons.codec.digest.DigestUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import java.util.List;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (args[0].equals("-i")) {
            Interactive mode1 = new Interactive();
	    String answer = null;
            do {
                System.out.println("\nStart hashing?\n" +
                            	"Type the file path or exit the program ");
                answer = in.nextLine();
                if (answer.equals("exit")) System.exit(0);
                else mode1.InteractiveHash(answer);
            } while (!answer.equals("exit"));
        } else {
            if (args[0].equals("-md5") | args[0].equals("-sha256")) {
                Simple mode2 = new Simple();
                if (args[1].equals("-f")) {
                    if (args.length > 2) {
                        for (int i = 2; i < args.length; i++) {
                            mode2.SimpleHash(args[0], args[i]);
                        }
                    } else UncorrectInput();
                } else UncorrectInput();
            } else UncorrectInput();
        } 
    }

    public static void UncorrectInput() {
        System.out.println("Failed request\n" +
                "Check the correctness of the request\n" +
                "java -jar Main.jar -md5 -f filename.txt\n" +
                "java -jar Main.jar -sha256 -f filename.txt\n");
        System.exit(0);
    }

    public static void UncorrectInput1() {
        
        System.exit(0);
    }

    public String FileRead(String path) {

        String content = null;
        File file = new File(path);

        try {
            content = FileUtils.readFileToString(file, "utf-8");
        } catch (IOException e) {
            System.out.println("Exception: " + "WRONG FILE PATH\n");
            UncorrectInput1();
        }
        return content;
    }
}      

