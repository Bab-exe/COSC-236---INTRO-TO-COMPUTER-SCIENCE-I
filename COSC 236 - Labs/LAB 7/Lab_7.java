import java.util.*;


class Lab_7 {

    
    //1. Write a boolean type method that accepts a string as its parameter and returns true if the characters in the string appear sorted in alphabetical order. Use a while loop to write the code. 
    static boolean Part_1(Scanner input){
        System.out.println("\nProvide a String input");
            final String str = input.nextLine();
  
        int index = 0;

        while(index < str.length()-1){

            char a = str.charAt(index);
            char b = str.charAt(index+1);

            if (b < a)
                return false;
        
            index++;
        }

        return true;
    }

    //2. Write a method isPalindrome that accepts a string parameter and returns true if the string is a palindrome (reads the same forwards and backward), and false otherwise.
    static boolean isPalindrome(Scanner input){
        System.out.println("\nProvide a String input");
            final String str = input.nextLine();

        char left,right;

        int left_index = 0;
        int right_index = str.length()-1;

        do {
            left = str.charAt(left_index);
            right = str.charAt(right_index);

            if (left != right) 
                return false;
 
            left_index++;
            right_index--;
        }
        while(left == right && left_index < right_index); //left and right bound should be the same + the right index should always be bigger than the left



        return true;
    }

    //3. Write a method that keeps printing lines, where each line contains a random number of * characters between 3 and 15 inclusive, until it prints a line with 13 or more characters. For example, the output from your method might be the following. Notice that the last line has 15 * characters. use while/do while loop.
    static void Part_3(){
        Random random = new Random();

        final char symbol = '*';

        int random_limit;

        do {
            random_limit =  random.nextInt(16 - 3) + 3; // any numbers 3 to 15

            for (int i = 1;i<=random_limit;i++)
                System.out.print(symbol);

            System.out.println();
        }
        while(random_limit < 13); //keeps going while when random limit is under 13
        //while(random_limit != 15)

        System.out.printf("\nLine with 13 or more characters!",random_limit);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Which Method Would You Like To Run ");
            int method = input.nextInt();
            input.nextLine();

        boolean output;    

            switch (method){
            //done
            case 1:
                output = Part_1(input);
                System.out.printf("\nString contains letter in alphabetical order? %b",output);
            break;

            //done
            case 2:
                output = isPalindrome(input);
                System.out.printf("\nIs it a palindrome? %b",output);
            break;

            //done
            case 3: 
                Part_3();
            break;

            default: 
                System.out.printf("\n'%d' is not An Option",method);
            break;
        }

        input.close();
        

    }
}