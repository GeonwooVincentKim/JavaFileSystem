package Features;

import java.util.Scanner;
import Attribute.FileManager.FileManager;

import static java.lang.System.out;

import java.io.File;
import java.io.FileWriter;

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

    public static void printResult(String outputFile, FileManager fileManager, int arrayLength) {
        String getResult = getData(arrayLength);
        writeFile(fileManager, getResult, outputFile);
    }

    public static void problem03_main(int mainMenuInput) {
        out.println("Input the Number what you want\n1. File IO\n2. Input by your self");

        Scanner fileReader = null;
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        File file = new File(inputFile);
        FileWriter fileWriter = null;
        String getResult = "";

        FileManager fileManager = new FileManager(file, fileReader, inputFile, fileWriter, getResult);

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if (userInput == 1) {
            // out.println(userInput);
            out.println(userInput);
            fileReader = readFile(fileManager, inputFile);

            int arrayLength = Integer.parseInt(fileReader.nextLine());
            printResult(outputFile, fileManager, arrayLength);
        } else if (userInput == 2) {
            out.println(userInput);
            fileReader = new Scanner(System.in);

            int arrayLength = Integer.parseInt(fileReader.nextLine());
            printResult(outputFile, fileManager, arrayLength);
        }

        sc.close();
    }
}
