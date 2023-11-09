// Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
import java.util.Scanner;
class InvestmentValue
{
    public static void main(String arg[])
    {
        System.out.println("The amount will become "+computeInvestment());
    }
    public static double computeInvestment()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter a amount for investing :- ");
        double principal  = s.nextDouble();
        System.out.print("\nEnter a interest rate :- ");
        double interestRate  = s.nextDouble();
        System.out.print("\nEnter a year :- ");
        double years  = s.nextDouble();

        double rate = interestRate / 100.0;
        // Calculate the future value
        double futureValue = principal * Math.pow(1 + interestRate, years);
        return futureValue;
    }
}

