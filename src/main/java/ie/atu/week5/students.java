package ie.atu.week5;

import java.util.Scanner;
public class students {
    public static void main(String[] args) {
        System.out.println("Please enter first student name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("You entered : " + name);

        System.out.println("Please enter your first email : ");
        String email = input.nextLine();
        System.out.println("You entered : " + email);

        System.out.println("Please enter your first course : ");
        String course = input.nextLine();
        System.out.println("You entered : " + course);
    }
}
