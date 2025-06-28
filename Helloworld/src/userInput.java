import java.util.Scanner;

public class userInput {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  your employee ID:");
        int empId = scanner.nextInt();

        System.out.print("Enter your Sex (M/F): ");
        char Sex = scanner.next().charAt(0);
        // to avoid the input buffer in the scanner stream
        scanner.nextLine();
        System.out.print("Enter your Designation: ");
        String designation = scanner.nextLine();

        System.out.print("Enter your basic Pay:");
        double basicPay = scanner.nextDouble();

        double pf_contribution = 0.00;
        pf_contribution = (basicPay * 12)/100;




        scanner.close();

        System.out.println("your Employee id is :" +empId);
        System.out.println("your Sex  is : " +Sex);
        System.out.println("your designation  is : " +designation);
        System.out.println("your Basicpay  is : " +basicPay);
        System.out.println("your pf_contributon is: " +pf_contribution);

    }
}
