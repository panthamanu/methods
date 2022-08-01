package conditionalStatements;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to six flags");
        System.out.println("please enter the height in cms to enter Rollercoaster");
        int height = scanner.nextInt();
        if(height>120){
            System.out.println("Congrajulations you can enter into Roller Coaster");
        }else
        {
            System.out.println("Sorry you are not eligible");
        }
    }

}