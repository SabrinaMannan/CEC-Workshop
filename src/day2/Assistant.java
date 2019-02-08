package day2;

import java.util.Scanner;

public class Assistant {

    public static void main(String[] args) {
        Scanner samsung = new Scanner(System.in);

        String name;
        name=samsung.nextLine();


        System.out.print("Hello ");
        System.out.println(name);
        samsung.close();
    }
}