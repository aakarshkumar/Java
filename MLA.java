import java.util.Scanner;
public class MLA
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the author's name as 'Last name, First name': ");
        String author = input.nextLine();
        System.out.print("Enter the year the book was published: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter the title of the book: ");
        String title =  input.nextLine();
        System.out.print("Enter the publisher of the book: ");
        String publisher = input.nextLine();
        System.out.println(author + ". " + title + ". \n" + publisher + ", " + year + ".");
    }
}
