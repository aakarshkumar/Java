import java.util.Scanner;
public class BirthYear
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the current year: ");
        int year = input.nextInt();
        System.out.print("Please enter your birth year: ");
        int birthYear = input.nextInt();
        System.out.print("Please enter your pet's birth year: ");
        int petBirthYear = input.nextInt();
        int age = year - birthYear;
        int petAge = year - petBirthYear;
        System.out.println("Your age: "+age+"\nYour pet's age: "+petAge+"\nYour pet's age in dog years: "+(petAge*7));
    }
}
