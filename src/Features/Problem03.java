package Features;

import static java.lang.System.out;

import java.util.Scanner;

import Attribute.FileManager.FileManager;

public class Problem03 {
    public static Scanner readFile(FileManager fileManager, String fileName) {
        return fileManager.readFile(fileName);
    }

    public static void writeFile(FileManager fileManager, String result, String fileName) {
        fileManager.writeFile(result, fileName);
    }

    public static String getData(int userInput) {
        String result = "";
        return result;
    }

    public static void problem03_main(int mainMenuInput) {
        out.println("Problem03");
    }
}
