import java.util.*;
import java.io.*;

class Lab10{

    static final String INPUT_FOLDER = "Input Files";
    static final String OUTPUT_FOLDER = "Output Files";

    /** 1. {@code reads word.txt}
    
     * 
     * a method that accepts a Scanner as a parameter. The method takes a string input from the console and searches for that specific word in the given text file named word.txt. If the word is found in the file, the method should return "found"; otherwise, it should return "not found."
     * 
     */
    static String Method1(Scanner Console){System.out.println();
        
        final String FILENAME = INPUT_FOLDER + "\\word.txt"; 

        System.out.println("Which word do you want to look for?");
            final String WORD = Console.nextLine();

        /*reading */
        try {
            File file = new File(FILENAME);
                Scanner reader = new Scanner(file);
                
                while(reader.hasNextLine()){
                    if (reader.next().equals(WORD)){
                        reader.close();
                        return "found";
                    }
                        
                }
                
            
            reader.close();
        }catch(FileNotFoundException e){    
            return "file not found";
        }
 
        
        return "not found";
    }
    
    /** 2. 
     * {@code reads Grades.txt}
     * 
     * Given a file named Grades.txt of letter grades (e.g., A, B, C, D, F), write a method that reads the grades and prints a histogram of stars indicating the frequency of each letter grade.
     */
    static void Method2(){System.out.println();
        final String FILEPATH = INPUT_FOLDER + "\\Grades.txt";

        final char SYMBOL = '*';
        
        String A = "A: ";
        String B = "B: ";
        String C = "C: ";
        String D = "D: ";
        String F = "F: ";

        /* reading */
        try {
            File file = new File(FILEPATH);

                Scanner reader = new Scanner(file);
            
                while(reader.hasNextLine()){
                    switch (reader.next().charAt(0)){
                        case 'A': A += SYMBOL;
                        break;
                        
                        case 'B': B += SYMBOL;
                        break;

                        case 'C': C += SYMBOL;
                        break;

                        case 'D': D += SYMBOL;
                        break;

                        case 'F': F += SYMBOL;
                        break;       
                    }
                }
                reader.close();

        }catch(FileNotFoundException e){
            System.out.println("Grades.txt" + " was not found\n" + e.getMessage());
        }
        
        System.out.println("Grade Histogram:");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(F);
    }

    /** 
     * 3. 
     * 
     * {@code reads reading.txt} 
     * {@code creates/writes wordNumber.txt}
     * Write a program that reads the content of a reading.txt and counts the total number of words in it. The program should then write this count to another file named wordNumber.txt.
     */
    static void Method3(){System.out.println();
        final String FILEPATH = INPUT_FOLDER + "\\reading.txt";

        final String OUTPUT_FILE = OUTPUT_FOLDER + "\\wordNumber.txt";
        int wordcount = 0;

        /* reading */
        try {
            File file = new File(FILEPATH);

            Scanner reader = new Scanner(file);
            
            while(reader.hasNext()){
                reader.next();
                wordcount++;
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println(FILEPATH + " was not found");
        } 
       
        /* writing */
        try {
            //creating output file
            PrintStream writer = new PrintStream(new File(OUTPUT_FILE));

            writer.println("Word count: \t" + wordcount);
                writer.close();
        }catch(FileNotFoundException e){
            //this shouldnt happen
            System.out.println(e.getMessage());
        }


        System.out.println("Wrote to " + OUTPUT_FILE);
        
    }

    /** 4.
     * {@code reads reading.txt}
     * {@code creates/writes reversed.txt}
    *  A method that reads reading.txt and that writes to another file called reversed.txt the same file's contents with successive pairs of lines reversed in order. The program should print the first pair of lines in reverse order, then the second pair in reverse order, then the third pair in reverse order, and so on. Therefore your method should produce the following input/output:
    */
    
    static void Method4(){System.out.println();
        final String FILEPATH = INPUT_FOLDER + "\\reading.txt";
        final String OUTPUT_PATH = OUTPUT_FOLDER + "\\reversed.txt" ;

        try {
            Scanner reader = new Scanner(new File(FILEPATH));
            PrintStream writer = new PrintStream(new File(OUTPUT_PATH));

            reader.useDelimiter("\n");

            String line1,line2;
            while (reader.hasNextLine()) {
                line1 = reader.nextLine();
                if (reader.hasNextLine()) 
                    line2 = reader.nextLine();
                else 
                    line2 = "";
                

                writer.println(line2 + "\n" + line1);
                
            }
            System.out.println("wrote to reversed.txt");
            
            writer.close();
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println(FILEPATH + " File Not Found\n " + e.getMessage());
        }
       
    }

    /** 5.
     * a method that reads coin.txt, which contains the results of sets of coin flips that are either heads (H) or tails (T) in either upper or lower case, separated by at least one space. Your method should consider each line to be a separate set of coin flips and should output to the console the number of heads and the percentage of heads in that line, rounded to the nearest tenth. If this percentage is more than 50%, you should print a "You win" message. For example, consider the following input file:
     */
    static void Method5(){System.out.println();
        final String FILEPATH = INPUT_FOLDER + "\\coin.txt";

        try {
            Scanner reader = new Scanner(new File(FILEPATH));
            String str;
            float heads_count,tails_count,percentage;

            while(reader.hasNextLine()){
                str = reader.nextLine();
                
                heads_count = 0;
                tails_count = 0;
                for (int i = 0; i<str.length();i++){
                    switch (str.charAt(i)){
                        case 'H': case 'h': 
                            heads_count += 1;
                        break;

                        case 'T': case 't': 
                            tails_count += 1;
                        break;
                    }
                }

                percentage = (heads_count / (heads_count + tails_count) ) * 100;
                System.out.print((int)(heads_count) + " heads ");
                System.out.printf("(%.1f%%)%n",percentage);
                    if (percentage >= 50)
                        System.out.println("You Win!");
                
                System.out.println();
                
            }

            reader.close();
        }catch (FileNotFoundException e){
            System.out.println(FILEPATH + " not found\n" + e.getMessage());
        }
    }

    public static void main(String[] args){

        File file = new File(OUTPUT_FOLDER);
            //making output directory
            if (!file.exists())
                file.mkdir();
                
        Scanner Console = new Scanner(System.in);
        
        System.out.println("Which Method Do You Want To Run?");
                final int METHOD = Console.nextInt();
                Console.nextLine();

            switch (METHOD){
                case 1: System.out.println(Method1(Console));
                break;

                case 2: Method2();
                break;
    
                case 3: Method3(); 
                break;

                case 4: Method4();
                break;

                case 5: Method5();
                break;
                
                default:
                    Console.close();
                    throw new IllegalArgumentException("Method " +  METHOD + " doesnt exist");
            }     

        Console.close();
    }
}