import java.util.*;

class HW5{
    /** 1.
     *  Write a method named isAllVowels that returns whether a String consists entirely of vowels (a, e, i, o, or u, case-insensitively). If every character of the String is a vowel, your method should return true. If any character of the String is a non-vowel, your method should return false. Your method should return true if passed the empty string, since it does not contain any non-vowel characters. Use a while/do-while loop to solve this. */
    static boolean isAllVowels(final String STR){
        boolean vowelCheck = true;

        char[] vowel = {
            'a','A',
            'e','E',
            'i','I',
            'o','O',
            'u','U',
            ' '
        };

        int index = 0;
        char s;
        do {
            vowelCheck= false;
            s = STR.charAt(index);

            for (char v: vowel)
                if (s == v){
                    vowelCheck = true;
                    break;
                }
            
            index++;            
        }
        while(vowelCheck && index < STR.length());

        return vowelCheck;
    }

    /**2. 
     * Write a method named makeGuesses that will guess (generate random) numbers between 1 and 50 inclusive until it makes a guess of at least 48. It should report each guess and at the end should report the total number of guesses made. Below is a sample execution: */
    static void makeGuesses(){      
        System.out.println();

        Random random = new Random();
        int generated_number,count=0;
        
        do {
            count++;
            generated_number = random.nextInt(51-1) + 1;
            System.out.printf("guess = %d\n",generated_number);
        }
        while (generated_number < 48);

        System.out.println("total guesses " + count);
    }
    
    /**3.
     * a method printBackwards that prints an array of integers in reverse order, in the following format.
        For the array {1, -3, 4, 7, 2}:*/
    static void printBackwards(int[] arr){
        System.out.println();
        for (int i = arr.length-1;i>=0;i--)
            System.out.printf("element [%d] is %d\n",i,arr[i]);      
    }
    /**4. 
     *a method named isUnique that takes an array of integers as a parameter and that returns a boolean value indicating whether or not the values in the array are unique (true for yes, false for no). The values in the list are considered unique if there is no pair of values that are equal. For example, if a variable called list stores the following values: */
    static boolean isUnique(int[] arr){ 
        System.out.println();   
        for (int i = 0;i<arr.length;i++)
            for (int b = 0;b<arr.length;b++){
                if (b == i)
                    continue;
                if (arr[i] == arr[b])
                    return false;
            }
 
        return true;
    }
    public static void main(String[] args) throws Exception{
        Scanner Console = new Scanner(System.in);
   
        System.out.println("(1) isAllVowels");
        System.out.println("(2) makeGuesses");
        System.out.println("(3) printBackwards");
        System.out.println("(4) isUnique");

        System.out.print("Method:\t"); 
            final int METHOD = Console.nextInt();

        Console.nextLine();
        switch (METHOD){
            case 1:
                System.out.print("\nString:\t");
                System.out.printf("isAllVowels() = %b",isAllVowels(Console.nextLine()));
            break;

            case 2: makeGuesses();
            break;

            case 3: printBackwards(Input_Array(Console));
            break;

            case 4: System.out.printf("isUnique() = %b",isUnique(Input_Array(Console)));
            break;

            
            default: throw new IllegalArgumentException("Method " + METHOD + " doesnt exist");
        }

        Console.close();
        
       
    }
    static int[] Input_Array(Scanner input){
            System.out.print("\nArray Length:\t");
                final int LENGTH = input.nextInt();

            System.out.println("Array Content:");
            int[] arr = new int[LENGTH];

            for (int i = 0;i<LENGTH;i++){
                System.out.printf(" index[%d]= ",i);

                arr[i] = input.nextInt();   
            }
                

            return arr;
        }

    static int[] Input_Array(int ... x){
        return x;
    }
    
}

