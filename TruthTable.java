import java.util.Scanner;
public class TruthTable {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter boolean 1: ");
        boolean b1 = input.nextBoolean();
        System.out.print("Enter boolean 2: ");
        boolean b2 = input.nextBoolean();
        System.out.print("Enter boolean 3: ");
        boolean b3 = input.nextBoolean();
        System.out.print("Enter boolean 4: ");
        boolean b4 = input.nextBoolean();
        System.out.println("\nBased on the truth table, your result is \"" + output(b1, b2, b3, b4) + "\".\n");
        System.out.println("Here is the reference table: ");
        System.out.println("1 1 0 1\n" + "0 1 0 0\n" + "1 0 1 1\n" + "0 1 1 0");
    }
    public static boolean output(boolean b1, boolean b2, boolean b3, boolean b4) {
        if (!(b1 || b2)) {
            if (!(b3 || b4)) {
                return true;
            } else if(!b3 && b4)  {
                return true;
            } else if(b3 && !b4) {
                return false;
            } else if(b3 && b4) {
                return true;
            } else {
                return false;
            }
        } else if (!b1 && b2) {
            if (!(b3 || b4)) {
                return false;
            } else if(!b3 && b4)  {
                return true;
            } else if(b3 && !b4) {
                return false;
            } else if(b3 && b4) {
                return false;
            } else {
                return false;
            }
        } else if (b1 && !b2) {
            if (!(b3 || b4)) {
                return true;
            } else if(!b3 && b4)  {
                return false;
            } else if(b3 && !b4) {
                return true;
            } else if(b3 && b4) {
                return true;
            } else {
                return false;
            }
        } else if (b1 && b2) {
            if (!(b3 || b4)) {
                return false;
            } else if(!b3 && b4)  {
                return true;
            } else if(b3 && !b4) {
                return true;
            } else if(b3 && b4) {
                return false;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
/*
Get this truth table
row: b1 False, b2 False; b1 False, b2 True; b1 True, b2 False; b1 True, b2 True
column: b3 False, b4 False; b3 False, b4 True; b3 True, b4 False; b3 True, b4 True
1 1 0 1
0 1 0 0
1 0 1 1
0 1 1 0
 */
