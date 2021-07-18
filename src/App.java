import static java.lang.System.out;

import java.util.Scanner;

import Features.Problem03;

public class App {
    public static void main(String[] args) throws Exception {
        out.print("Please input the Number\n1. Problem03\n2. Problem04\nOthers. Exit the Program : ");
        Scanner sc = new Scanner(System.in);
        int selectMainMenu = sc.nextInt();

        if (selectMainMenu == 1) {
            Problem03.problem03_main(selectMainMenu);
            out.println(selectMainMenu);
        } else if (selectMainMenu == 2) {
            out.println(selectMainMenu);
        } else {
            out.println(selectMainMenu);
            System.exit(0);
        }

        sc.close();
    }
}
