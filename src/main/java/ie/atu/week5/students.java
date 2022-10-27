package ie.atu.week5;

import java.util.Scanner;
public class students {
    public static void main(String[] args) {
        //created first instances by having the user input their name, email and course
        System.out.println("Please enter first student name : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Details stuDetail = new Details();
        stuDetail.setName(name);
        System.out.println("You entered : " + stuDetail.getName());

        System.out.println("Please enter your first email : ");
        String email = input.nextLine();
        stuDetail.setEmail(email);
        System.out.println("You entered : " + stuDetail.getEmail());

        System.out.println("Please enter your first course : ");
        String course = input.nextLine();
        stuDetail.setCourse(course);
        System.out.println("You entered : " + stuDetail.getCourse());

        //created second instance
        Details stuDetail2 = new Details();
        System.out.println("Please enter a second student name : ");
        String name2 = input.nextLine();
        stuDetail2.setName(name2);
        System.out.println("You entered : " + stuDetail2.getName());

        System.out.println("Please enter a second student email : ");
        String email2 = input.nextLine();
        stuDetail2.setEmail(email2);
        System.out.println("You entered : " + stuDetail2.getEmail());

        System.out.println("Please enter a second student course : ");
        String course2 = input.nextLine();
        stuDetail2.setCourse(course2);
        System.out.println("You entered : " + stuDetail2.getCourse());

        //Created 3rd instance using a constructor
        // the constructor puts all the details into one line instead of using continous get/set
        System.out.println("Please enter your third student name : ");
        String name3 = input.nextLine();
        System.out.println("Please enter your third student email : ");
        String email3 = input.nextLine();
        System.out.println("Please enter your third student course : ");
        String course3 = input.nextLine();
        Details stuDetail3 = new Details(name3, email3, course3);
        System.out.println("You entered : " + stuDetail3.getName());
        System.out.println("You entered : " + stuDetail3.getEmail());
        System.out.println("You entered : " + stuDetail3.getCourse());


    }
}
