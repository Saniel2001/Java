import java.util.Scanner;

public class Inputs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner is a class and sc is the object of the class and we are initializing the constructor of the Scanner class
        // System.out.println() --> in the standard output stream print something
        // System.in ==> take the input from keyboard whenever input is asked
        int input = sc.nextInt();  // nextInt()--> it will take an integer value as a input.
        String input1 = sc.next();   // it will take string value till space comes
                                // if we want to take complete sentence then use nextLine() instead of next().
        System.out.println(input);
        System.out.println(input1);
    }
}