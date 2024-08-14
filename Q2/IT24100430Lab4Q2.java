import java.util.Scanner;

public class IT24100430Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        int examMarks = input.nextInt();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks. Please enter a value between 0 and 100.");
            return;
        }

        System.out.print("Please enter the lab submission marks (out of 100): ");
        int labMarks = input.nextInt();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab submission marks. Please enter a value between 0 and 100.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        int examPercentage = input.nextInt();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
            return;
        }
        
        System.out.print("Please enter the percentage given for the lab submission: ");
        int labPercentage = input.nextInt();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
            return;
        }

        if (examPercentage + labPercentage != 100) {
            System.out.println("The sum of the exam and lab percentages must equal 100.");
            return;
        }

        double finalMarks = (examMarks * (examPercentage / 100.0)) + (labMarks * (labPercentage / 100.0));
        System.out.printf("The final marks are: %.2f\n", finalMarks);

    }
}
