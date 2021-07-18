package Attribute.FileManager;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Attribute.FileManager.AbstractClass.FileClass;

import static java.lang.System.out;

public class FileManager extends FileClass {

    FileManager(Scanner fileReader, String fileName, FileWriter fileWriter, String result) {
        super(fileReader, fileName, fileWriter, result);
    }

    @Override
    public Scanner readFile(String fileName) {
        try {
            fileReader = new Scanner(fileName);
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("----------------");
            e.printStackTrace();
        }

        return fileReader;
    }

    @Override
    public void writeFile(String result, String fileName) {
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(result);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            out.println(e.getMessage());
            out.println("----------------");
            e.printStackTrace();
        } catch (Exception e) {
            out.println(e.getMessage());
            out.println("---------------");
            e.printStackTrace();
        }
    }
}
