import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HW6 {

    /** 1.
     * Write a program that prompts the user to enter the number of rows and columns for a 2D array. Then, take input from the console to assign values to each element of the array. Identify the sum of the elements in the diagonal from left to right */
    static int DiagonalSum(Scanner Console){System.out.println();	
		return DiagonalSum(Prompt_Array2d(Console));
    } 
    static int DiagonalSum(int[][] arr){System.out.println();
		int sum =0,length_limit=0;

		for (int i=0;i<arr.length;i++){
			//if the length is smaller than length_limit its skipped
			if (arr[i].length <= length_limit)
				continue;

			//length limit should increase by 1 everytime cus diagonal formula is n ; [n,n] +... where n is increasing by 1 
			length_limit += 1;
			sum+= arr[i][i];
		}

		return sum;

    }
	
    /** 2.
     * Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter and returns true if it is a magic square. A square matrix is a magic square if it is square in shape (same number of rows as columns, and every row the same length), and all of its row, column, and diagonal sums are equal. For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a magic square because all eight of the sums are exactly 15. */
	static boolean isMagicSquare(int[][] arr){

		//vertical sum,horizontal sum,right diagonal sum
        int v_sum=0,h_sum=0,right_sum=0;

        //left diagonal sum
        final int LEFT_SUM = DiagonalSum(arr);

        boolean magic_square=true;

        try {
            int row=arr.length-1;
            while(row>=0 && magic_square){
                //reset var
                h_sum = 0;
                v_sum = 0;

                //horizontal sum
                for (int h : arr[row]){
                    h_sum += h;
                }

                //vertical sum
                for (int v=0;v<arr.length;v++){
                    v_sum += arr[row][v];
                }


                //right to left diagonal sum (can only be checked at end)
                right_sum += arr[row][row];

                magic_square = (v_sum == h_sum && v_sum == LEFT_SUM);

                row--;
            }
        }catch(IndexOutOfBoundsException e){
            //should only happen if rows and columns are not all the same
            return false;
        }
        
        
        return (magic_square && v_sum == right_sum) ;
	}

     /** 3.
      * 
      * Write a static method named plusScores that reads a file named Score.txt (attached below) that represents student records. Each student record takes up two lines of input. The first line has the student's name and the second line has a series of plus and minus characters.
      */
    static void plusScores() throws Exception{
        final String FILEPATH = "Score.txt";
        
        String output = "";
        String symbol_line;
        float plus_count;

        try {
            Scanner reader = new Scanner(new File(FILEPATH));
                reader.useDelimiter("\n");  
            
            while(reader.hasNext()){
                output += reader.next() + ": "; //name line

                symbol_line = reader.next(); //symbols line

                //reset for next
                plus_count = 0; 
                for (int i =  symbol_line.length()-1;i>=0;i--){
                    switch (symbol_line.charAt(i)){
                        case '+': plus_count+= 1;
                        break;

                        case '-':
                        break;

                        default:
                            throw (new Exception("2nd line can only have + or -"));
                    }
                }

                output += (plus_count / symbol_line.length() * 100) + "% plus" ;
                output += "\n";
            }

            reader.close();
        }catch(FileNotFoundException e){
            System.out.println(FILEPATH + " not found\n" + e.getMessage());
        }

        System.out.println(output);
        
    }
    public static void main(String[] args) {
		Scanner Console = new Scanner(System.in);
        System.out.println("Which Method Do You Want To Run?");
            final int METHOD = Console.nextInt();

        try {
            switch (METHOD){
            case 1: System.out.println("Sum Of elements in the diagonal (left to right): " + DiagonalSum(Console));
            break;

            case 2: System.out.println(isMagicSquare(Prompt_Array2d(Console)));
            break;

            case 3: plusScores();
            break;

            default:
                throw new IllegalArgumentException("\nMethod " +  METHOD + " doesnt exist");
        }     
         
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            Console.close();
        }
        
        


        

    
        
    }

	static int[][] Prompt_Array2d(Scanner Console){
        System.out.print("\nEnter The Number Of rows: ");
            final int ROW = Console.nextInt();

        System.out.print("Enter the number of columns: ");
            final int COLUMN = Console.nextInt();
    
        int[][] arr = new int[ROW][COLUMN]; 
        
        System.out.println("\nEnter the elements of the array");
        for (int row = 0 ; row< ROW;row++){
            for (int column = 0;column<COLUMN;column++){ 
                arr[row][column] = Console.nextInt();
            }
            System.out.println();
        }
        return arr;
    }
   
}