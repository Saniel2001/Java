import java.util.Scanner;

public class Temperature{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        float celsius = sc.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%f degrees Celsius is %.2f degree fahrenheit:", celsius, fahrenheit);
    }
}