import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class LabExam{
    /** 1. a java method that prints inverted triangle pattern based on an input from the
console. For an input of 5 the following output will be printed */
    static void Method1(Scanner Console){
        System.out.print("Enter The Limit for inverted triangle: ");
            final int LIMIT = Console.nextInt();

        for (int i = LIMIT;i>=1;i--){
            for (int j = 1;j<=i;j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    /** 2. a java method that takes an integer input from the console and prints all the
numbers that are divisible by 7 up to that number */
    static void Method2(Scanner Console){

        System.out.print("Enter An Integer: ");
            final int NUMBER = Console.nextInt();

        System.out.printf("Numbers divisible by 7 up to %d:\n",NUMBER);

        for (int i = 7;i<=NUMBER;i+=7)
            System.out.println(i);
    }
    
    /** 3. a method that prompts the user to enter an integer to determine the size of an array.
Then, take input from the console to assign values to the array indices. Then provide a
target integer input from the console and check if that specific element is in the array or
not. If the element is there in the array, the method should return a string “Found!”
otherwise “Not found! */
    static String Method3(Scanner Console){

        System.out.print("Enter The Size Of The Array: ");
            final int SIZE = Console.nextInt(); 

        int[] arr = new int[SIZE];

        System.out.println("Enter The Elements Of The Array:");

        for (int i = 0 ; i < SIZE; i++)
            arr[i] = Console.nextInt();

        Console.nextLine();

        System.out.print("\nEnter the target element to search: ");
            final int TARGET = Console.nextInt();

        for (int val: arr)
            if (val == TARGET) return "Found!";
    
        return "Not found!";
    }
    
    /** a method that reads a text file named word.txt and identifies how many lines are
there in the text file.  */

    static void Method4(File file){
        int lines = 0;
        try {
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()){
                lines++;
                reader.nextLine();
            }

            System.out.printf("The number of lines in the file(%s) is: %d",file.getName(),lines);
        
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("File Not Found!"); 
        }
        

       
        
    }
    public static void main(String[] args){
        Scanner Console = new Scanner(System.in);

        System.out.print("Choose a method to run: ");
            final int METHOD = Console.nextInt();

            
        System.out.println();
        Console.nextLine();
        try {

            switch (METHOD){
                case 1: Method1(Console);
                    break;

                case 2: Method2(Console);
                    break;

                case 3: System.out.println(Method3(Console));
                    break;

                case 4: Method4(new File("word.txt"));
                    break;

                case 5: 
                    //question 5
                    System.out.print("Enter the title of the book: ");
                        final String TITLE = Console.nextLine();

                    System.out.print("Enter the author of the book: ");
                        final String AUTHOR = Console.nextLine();

                    System.out.print("Enter the ISBN of the book: ");
                        final int ISBN = Console.nextInt();

                    Book book = new Book(TITLE, AUTHOR, ISBN);
                        System.out.println(book.toString());
                    break;

                default: System.out.println("Method " + METHOD + "doesnt exist");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            Console.close();
        }

        
        


        
        
    }


    
}