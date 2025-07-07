import java.util.Scanner;

public class condtional_stmts {

    public static void main(String[] args) {
        System.out.println("program Started");

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();

        if (age <= 2) {
            System.out.println("You are an Infant");
        } else if (age > 3 && age < 10) {
            System.out.println("You are an Baby");

        } else if (age >= 10 && age < 15) {
            System.out.println("You are an Boy");

        } else if (age >= 15 && age <= 21) {
            System.out.println("You are an Teen");

        } else if (age > 21 && age <= 35) {
            System.out.println("You are an Adult");

        } else if (age > 35 && age <= 50) {
            System.out.println("You are an Man");
        }else if (age > 60) {
            System.out.println("You are an Old man");
        }else  {
            System.out.println("You are not even born");
        }

    }
}
