import java.util.Scanner;

public class TP01 {
    
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        double celcius0 = input.nextDouble();
        double celciuso = input.nextDouble();

        double fahrenheit0 = (celcius0 * 9/5) + 32;
        double fahrenheito = (celciuso * 9/5) + 32;

        double kelvin0 = celcius0 + 273.15;
        double kelvino = celciuso + 273.15;

        System.out.println(fahrenheit0 + " F, " + fahrenheito + " F"); 
        System.out.println(kelvin0 + " K, " + kelvino + " K");

        input.close();
    }
}