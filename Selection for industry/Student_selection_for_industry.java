import java.util.Scanner;

public class Student_selection_for_industry {
    public static void main(String args[])

    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Please Enter Your Name : ");
        String name = Sc.next();

        System.out.print("Enter Your GPA (0 to 10.0) :  ");
        float gpa = Sc.nextFloat();

        System.out.print("Enter How Many Certification You Complete (1 to 10) : ");
        int certificate = Sc.nextInt();
        System.out.print("Enter Preferred Programming Language : ");
        String pro_lang = Sc.next();
        System.out.print("Rate This Programming Language (1 to 10 ) :  ");
        int pro_rate = Sc.nextInt();

        if (gpa >= 3.0 && certificate >= 5 && pro_rate >= 5) {
            System.out.println("\n*** Congratulation " + name + " You Selected ***");
            System.out.println("\nSee Your Details ");
            System.out.println("Your GPA " + gpa);
            System.out.println("Number of Certification You Gain : " + certificate);
            System.out.println("Preferable Programming Language : " + pro_lang);
            System.out.println("You give Rate " + pro_rate + " Out of 10");

        } else {
            System.out.println("\n*** Sorry You Not Selected *** ");
            System.out.println("\nSee Your Details ");
            System.out.println("Your GPA " + gpa);
            System.out.println("Number of Certification You Gain : " + certificate);
            System.out.println("Preferable Programming Language : " + pro_lang);
            System.out.println("You give Rate " + pro_rate + " Out of 10");
        }

    }

}