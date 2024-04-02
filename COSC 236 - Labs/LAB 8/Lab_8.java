import java.util.*;

class Lab_8{
    /** 1. Write a method named isSorted that accepts an array of ints as a parameter. It should return true if the list is in sorted (non-decreasing) order and false otherwise. You can't use Arrays.sort() to solve this. */
    static boolean isSorted(int[] arr){
        
             for (int left=0; left < arr.length-1;left++)
                //left should always be smaller than right; right is left+1
                if (arr[left] > arr[left+1])
                    return false;
        
        return true;
    }
    
    /**2.  Implement a program that removes a specified element from the array, returns and prints the modified array. */
    static int[] Remove(int[] arr,final int BLACKLIST){
        int[] copy_arr = new int[arr.length-1];

        int index=0;
        for (int value: arr){
            if (value == BLACKLIST)
                continue;

            copy_arr[index] = value;
            index++;
        }
        


        return copy_arr;
    }
    /** 3. Count Vowels in a String: Write a static method named vowelCount that accepts a String as a parameter. It should return an array of integers representing the counts of each vowel in the String. The array should contain 5 elements: the first for the count of 'As', the second for 'Es', the third for 'Is', the fourth for 'Os', and the fifth for 'Us'. Assume the string contains no uppercase letters. For example, the call vowelCount("i think, therefore i am") should return the array {1, 3, 3, 1, 0}.
    */
    static int[] vowelCount(String str){
        str = str.toLowerCase();
        int[] vowel = new int[5];

        final int 
        A = 0, 
        E = 1, 
        I = 2, 
        O = 3, 
        U = 4;

        for (int index = 0;index < str.length();index++)
            switch(str.charAt(index)){
                case 'a': vowel[A] += 1;
                break;

                case 'e': vowel[E] += 1;
                break;

                case 'i': vowel[I] += 1;
                break;

                case 'o': vowel[O] += 1;
                break;

                case 'u': vowel[U] += 1;
                break;
            }
        
        return vowel;
    }

    public static void main(String[] args) throws Exception{
        Scanner Console = new Scanner(System.in);
        
        System.out.println("Which Method Do You Want To Run?");
            final int METHOD = Console.nextInt();

        switch (METHOD){
            case 1: //finished
                System.out.println(isSorted(Prompt_Array(Console)));
            break;

            case 2:  //finished
                int[] arr = Prompt_Array(Console);

                System.out.println("Provide the element you want to remove");
                    final int BLACKLIST = Console.nextInt();

                System.out.println(Arrays.toString(Remove(arr,BLACKLIST)));
            break;

            
            case 3: // finished
                Console.nextLine();
                System.out.println("\nProvide the String");
                    final String STR = Console.nextLine();

                System.out.printf("The Vowel Array: %s",Arrays.toString(vowelCount(STR)));
            break;

            default:
                Console.close();
                throw new IllegalArgumentException("Method " +  METHOD + " doesnt exist");
        } 

        
    }

    static int[] Prompt_Array(Scanner Console){
            System.out.println("\nProvide the array size:");
                final int SIZE = Console.nextInt();
        
            int[] arr = new int[SIZE]; 
            
            System.out.println("Provide the array elements:");
        
            for (int i=0;i<SIZE;i++)
                arr[i] = Console.nextInt();

            return arr;
    }
}