import java.util.Scanner;

public class IT25103041Lab9Q4 {

    // a) Calculate the final mark
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // b) Find the grade
    public static char findGrades(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    // c) Print student details
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println("Name: " + name);
        System.out.printf("Final Mark: %.2f%n", finalMark);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    // d) Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter details of Student " + i);

            System.out.print("Enter name: ");
            String name = input.nextLine();

            System.out.print("Enter assignment mark: ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter exam paper mark: ");
            double examMark = input.nextDouble();
            input.nextLine();

            double finalMark = calcFinalMark(assignmentMark, examMark);

            char grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }

        
    }
}