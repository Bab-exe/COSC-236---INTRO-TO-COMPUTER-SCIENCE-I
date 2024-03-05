import java.util.*;

public class Lab_5 {

    //question 1 
    public static void isVowel(Scanner input){
        System.out.print("\nEnter a character: ");
            char x = input.next().charAt(0);


        if (x == 'a' || x == 'e'|| x == 'i' || x == 'o' || x == 'u')
            System.out.print("It is a vowel");

        else 
            System.out.print("It is a consonent ");
    }



    //question 2 
    public static void prime(Scanner input){
        System.out.println("\nProvide The Integer:");
            float x = input.nextInt();

        for (int i = 2; i<x;i++){
            if (x % i == 0){
                System.out.println("Not Prime");
                return;
            }
        }

        System.out.println("Prime");
            
    }

    //question 3 
    public static void preFix(Scanner input){

        input.nextLine();
        
        System.out.print("\nEnter a string:\t");
            String x = input.nextLine();



        System.out.print("Enter a prefix:\t");
            String prefix = input.nextLine();



        if (x.startsWith(prefix)){
            System.out.println("Starts with prefix");
        }
        else {
            System.out.println("Does not start with prefix ");
        }
            



    }


    //question 4 
    public static void java(Scanner input){
        input.nextLine();


        String check = "Java";
        System.out.print("Enter a string:\t");
            String x = input.nextLine();

        if (x.contains(check)){
            System.out.printf("Found %s",check);
        }
        else {
             System.out.printf("No %s found",check);
        }
       

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Which Method do you want to run?");
        System.out.print("Method:\t");
            int method = input.nextInt();



        //question 1 
        if (method == 1){
            isVowel(input);
        }


        //question 2 
        else if (method == 2){
            prime(input);
        }

        //question 3 
        else if (method == 3){
            preFix(input);
        }

        //question 4
        else {
            java(input);
        }

            
      
        

  

        input.close();
        
            
        
    }
}
