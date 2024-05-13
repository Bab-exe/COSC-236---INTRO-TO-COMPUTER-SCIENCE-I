import java.util.Scanner;

public class Lab12 {


    /** 1. calculates the factorial of a given positive integer as an input from the console.
     */
    static int factorial(int n){
        
        if (n != 1) return n * factorial(n-1);

        return 1;
    }

  
    /** 2. recursively calculates the Fibonacci sequence up to a given term. */
    static int fibonacci(final int limit,int first,int second,int i){
        int third = first + second;
        if (i < limit) {
            
            System.out.print(third + " ");
            return fibonacci(limit, second, third, i + 1);
        }

        return third;

    }

    /** 3. recursive function to find the sum of digits of a positive integer as input from the console. */
    static int sum(int n){
        if (n == 0) return 0;

        return sum(n/10) + n%10;
    }
    

    

    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in); 
        
        System.out.println("Which Method Do You Want To Run?");
            final int METHOD = Console.nextInt();

        System.out.print("\nProvide A Positive Number: \t");
            final int NUMBER = Console.nextInt();

        System.out.println();

        try {
            switch (METHOD){
                case 1:  System.out.printf("Factorial of %d is: %d",NUMBER,factorial(NUMBER));
                break;

                case 2: 
                    System.out.printf("Fibonacci sequence up to term %d: 0 1 ",NUMBER);
                        fibonacci(NUMBER-2,0,1,0);                    
                break;

                case 3: System.out.printf("Sum of digits of %d is: %d",NUMBER,sum(NUMBER));
                break;

                default: throw new IllegalArgumentException("\nMethod " +  METHOD + " doesnt exist");
            }     
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            Console.close();
        }
            
       
    }

   
}

