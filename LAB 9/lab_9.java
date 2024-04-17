import java.util.*;

class lab_9{
    /** 1.
     * a method that accepts an array of integers (size and elements from the console) and rearranges its elements so that all even values appear before all odds. For example, if the array is [5, 4, 2, 11, 9, 10, 4, 7, 3], then after the method has been called, one acceptable ordering of the elements would be [4, 2, 10, 4, 5, 11, 9, 7, 3]. The exact order of the elements does not matter, so long as all even values appear before all odd values. The array might contain no even elements or no odd elements. */
    static int[] Method1(int[] arr){System.out.println();
       
        int temp;
        //todo
        for (int l = 0; l < arr.length;l++){
            for (int r = l+1;r<arr.length;r++){
                if (arr[l] % 2 != 0 && arr[r] % 2 == 0){
                    //swap

                    temp = arr[r];
                    arr[r] = arr[l];
                    arr[l] = temp;
                }

            }
                

            
            
            
            
        }
                  
        return arr;
    }

     /** 2.
      * Create a program that prompts the user to specify the size of two arrays and takes input from the console to assign values to both array indices. Find and print the common elements between the two arrays. If there are no common elements, the program should print a message indicating that there are no common elements.
      */
    static void Method2(Scanner Console){System.out.println();
        System.out.print("Array 1");
            int[] arr1 = Prompt_Array(Console);

        System.out.print("\nArray 2");
            int[] arr2 = Prompt_Array(Console);

        System.out.println("\nCommon Elements");

        int commons = 0;
        for (int value1: arr1)
            for (int value2: arr2)
                if (value1 == value2){
                    commons += 1;
                    System.out.println(value1);
                }

         if (0 ==  commons)
                System.out.println("There are no common elements");
       

       
        
    }

    /** 3.
     * Write a program that prompts the user to enter the number of rows and columns for a 2D array. Then, take input from the console to assign values to each element of the array. Next, prompt the user to enter a column index and calculate the sum of all elements in that column. Finally, print the sum.
     */

    static void Method3(Scanner Console){System.out.println();
        System.out.print("\nEnter the number of rows: ");
            final int ROW = Console.nextInt();

        System.out.print("Enter the number of columns: ");
            final int COLUMN = Console.nextInt();
    
        int[][] arr = new int[ROW][COLUMN]; 
        
        System.out.println("\nEnter the elements of the array");
        for (int row = 0 ; row< ROW;row++){
            for (int column = 0;column<COLUMN;column++)
                arr[row][column] = Console.nextInt();
            
            System.out.println();
        }

        // //to display
        // for (int a[]: arr)
        //     System.out.println(Arrays.toString(a));

        int sum=0;

        System.out.print("Enter the column index to calculate the sum: ");
            final int COLUMN_INDEX = Console.nextInt();

        for (int i = 0;i<ROW;i++)
            sum += arr[i][COLUMN_INDEX];
            
        System.out.printf("\nSum of Elements in Column %d: %d",COLUMN_INDEX,sum );
    }

    public static void main(String ... args){
        Scanner Console = new Scanner(System.in);
        
        System.out.println("Which Method Do You Want To Run?");
            final int METHOD = Console.nextInt();
        switch (METHOD){
            case 1: //todo
                //int[] x = {5, 4, 2, 11, 9, 10, 4, 7, 3,2};

                int[] x = {1, 2,3,4,5,6,7,8,9};
                System.out.println(Arrays.toString(x));
                System.out.println(Arrays.toString(Method1(x)));
                /*4, 2, 10, 4, 5, 11, 9, 7, 3 */
            break;

            case 2: Method2(Console); //finished
            break;
 
            case 3: Method3(Console); //finished
            break;

            default:
                Console.close();
                throw new IllegalArgumentException("Method " +  METHOD + " doesnt exist");
        }     
        
       
        
       
    };

        
    

    static int[] Prompt_Array(Scanner Console){
        System.out.print("\nProvide the array size: ");
            final int SIZE = Console.nextInt();
    
        int[] arr = new int[SIZE]; 
        
        System.out.println("Provide the array elements:");
    
        for (int i=0;i<SIZE;i++)
            arr[i] = Console.nextInt();

        return arr;
    }
    
    
    
}