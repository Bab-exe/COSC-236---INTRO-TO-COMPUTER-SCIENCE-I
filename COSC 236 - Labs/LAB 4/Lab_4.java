import java.util.*;

public class Lab_4{


    //1
    public static int maximum(Scanner input){

        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        
        if (a > b && a > c)
            return a ;

        else if (b > a && b > c)
            return b;

        else
            return c ;
    }

    //2
    public static void isEven(Scanner input){
        if (input.nextInt() % 2 == 0)
            System.out.println("I am a even number");
        
        else 
             System.out.println("I am a odd number");
        
        return;
    }

    //3
    public static void triangle(Scanner input){

        double side_A = input.nextInt(), side_B = input.nextInt(), side_C = input.nextInt();

        if (side_A  == side_B && side_A == side_C)
            System.out.println("I am a equilateral triangle");
        
        else if (side_A == side_B || side_B == side_C || side_A == side_C)
            System.out.println("I am a isosceles triangle");

        else 
            System.out.print("I am a scalene triangle");
    }

    //4 
    public static void ofprintAcronym(Scanner input){

        input.nextLine();
        String text = input.nextLine();
        String[] text_parts = text.split(" ");

        for (String t: text_parts)
            System.out.print(t.charAt(0));
        
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Which method do u want to run");
        int method = input.nextInt();

        //question 1 
        if (method == 1){
            // question 1   
            System.out.println("Provide Three Integers As Output ");
            int max = maximum(input); 

            System.out.print("Max: " + max);
        }

        //question 2
        else if (method == 2){
            System.out.println("Provide the number to check if even/odd");
            isEven(input);
        }

        //question 3
        else if (method == 3){
            
            System.out.println("Provide the 3 Sides of a triangle");
            triangle(input);
        }

        else {
            // question 4 
            System.out.println("Provide the String");
                ofprintAcronym(input);
        }

    }
}