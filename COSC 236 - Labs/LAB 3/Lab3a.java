//Blessing Abumere
import java.util.Scanner;

public class Lab3a {

    public static void mult_table(int x){
        int product;
        System.out.println("\nMultiplication table of " + x + ":");

        for (int i = 1; i <= 10;i++){
            product = i*x;
            System.out.println(x + "X" + i + "=" + product);
        }
    }
    public static double triangle(double height, double base){

        return (height * base ) / 2 ;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input for Multiplication Table:");
            int x = input.nextInt();

        System.out.println("Height and base of triangle are:");
            System.out.print("Height: ");
                double height = input.nextDouble();

            System.out.print("Base: ");     
                double base = input.nextDouble();


        mult_table(x);
        System.out.println("\nThe Area of the triangle is: " + triangle(height,base));

        input.close();
    }
}
