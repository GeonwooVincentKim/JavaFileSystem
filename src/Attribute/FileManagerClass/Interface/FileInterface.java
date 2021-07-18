package Attribute.FileManagerClass.Interface;

import java.util.Scanner;

public interface FileInterface {
    Scanner readFile(String fileName);

    void writeFile(String result, String fileName);
}
