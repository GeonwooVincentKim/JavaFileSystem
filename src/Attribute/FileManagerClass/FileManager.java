package Attribute.FileManagerClass;

import static java.lang.System.out;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Attribute.FileManagerClass.Interface.FileInterface;

public class FileManager implements FileInterface {
    private Scanner fileReader;
    private String fileName;

    private FileWriter fileWriter;
    private String result;

    FileManager() {

    }

    public Scanner getFileReader() {
        return fileReader;
    }

    public void setFileReader(Scanner fileReader) {
        this.fileReader = fileReader;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    FileManager(Scanner fileReader, String fileName, FileWriter fileWriter, String result) {
        this.setFileReader(fileReader);
        this.setFileName(fileName);
        this.setFileWriter(fileWriter);
        this.setResult(result);
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
