package Attribute.FileManager.AbstractClass;

import java.io.FileWriter;
import java.util.Scanner;

public abstract class FileClass {
    protected Scanner fileReader;
    private String fileName;

    protected FileWriter fileWriter;
    private String result;

    FileClass() {

    }

    protected FileClass(Scanner fileReader, String fileName, FileWriter fileWriter, String result) {
        this.setFileReader(fileReader);
        this.setFileName(fileName);
        this.setFileWriter(fileWriter);
        this.setResult(result);
    }

    public Scanner getFileReader() {
        return fileReader;
    }

    public void setFileReader(Scanner fileReader) {
        this.fileReader = fileReader;
    }

    public String getfileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileWriter getfileWriter() {
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

    public abstract Scanner readFile(String fileName);

    public abstract void writeFile(String fileName, String result);
}
