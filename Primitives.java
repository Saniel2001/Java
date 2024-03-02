import java.util.Scanner;

public class Primitives{
    public static void main(String[] args){
        // There are roughly 6 primitive datatypes
        //int, float, double, long, char, boolean
        // int num = 10;
        // float marks = 98.67f;
        // double largeDecimalNumber = 234345.3453453;
        // long largeInteger = 234234234234234L;
        // char myChar = 'A';
        // boolean check = true;
        Scanner sc = new Scanner(System.in);
        
        // int roll = sc.nextInt();
        // System.out.println(roll);

        // String name = sc.nextln();
        // System.out.println(name);

        // float marks = sc.nextFloat();
        // System.out.printf(marks);

        // double x = sc.nextDouble();
        // System.out.println(x);

        // long y = sc.nextLong();
        // System.out.println(y);

        // Typecasting
        // int num = (int)56.89f;
        // System.out.println(num);

        // Automatic type promotion in expression
        // int a = 257;
        // byte b = (byte)a;   // Implicit conversion of int to byte 
        //                     // a byte can store 256 values so when we are storing the value 257
        //                     // 257  is too big for byte so 257 % 256 = 1 is stored
        //                     // So the value of byte becomes 1
        // System.out.println("Value of Byte : " + b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;

        // int d = (a * b) / c;    // while performing the multiplication operation it easily exceeds the value that can be stored in a byte datatype
        //                         // Thus, while doing the intermediate operations the byte data is converted into integer datatypes which makes these operations possible
        // System.out.println(d);

        byte b = 47;
        char d = 'a';
        short s = 1098;
        int j = 78373;
        float h = 5.87f;
        double k = 0.123456;
        double result = (h * b) + (j/d) - (k - d);
        System.out.println((h * b) + " " + (j/d) + " " + (k - d));
        System.out.println(result);

    }
}