package uasTerminalApp.helpers;

import java.util.Scanner;

public class UserRequest {
    public static String request(String node) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(node + " : ");
        String fill = scanner.nextLine();
        return fill;
    }

}
