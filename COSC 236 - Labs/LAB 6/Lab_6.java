import java.util.*;

public class Lab_6{

        //1.Write a program that produces an inverted right triangle. The level/depth of the triangle depends on the console input. If the input is 5, the program prints the following-
        public static void Triangle(Scanner input){
            System.out.println("Level Of Inverted Triangle:");
                int level = input.nextInt();
                final char symbol = '*';
                
            for (int i = 1; i<= level;i++){
                for (int j = level;j>=i;j--){
                    System.out.print(symbol);
                }
                System.out.println();
            }
        }



        //todo
        //2.Write a program that reads an input from the console and Prints a pyramid that has the same level as the input. For input 6 it prints the following pattern,
        public static void Pyramid_2(Scanner input){
            System.out.println("Level Of The Number Pyramid: ");
                int level = input.nextInt();

                final char space = ' '; 

                /* 5s  */
            for (int i = 0;i<level; i++){
                //spaces 
                for (int s = level;s>=i;s--)
                    System.out.print(space);

                //numbers
                for (int n = 0;n<i*2+1;n++)
                    System.out.print(i);

                System.out.println();
                
            }

        }
  

        //3.Print the following pattern based on an input from the console. For the input 5, print the following
        public static void Pyramid_3(Scanner input){
            final char symbol = '-';

            String symbols = "";
            System.out.println("Level Of Number pyramid (3):");
                int level = input.nextInt();

                for (int i = 1; i<=level;i++){
                    //symbol 1 and creating symbol 2
                    for (int s = level;s>=i;s--)
                        symbols += symbol;
                    

                    System.out.print(symbols);


                    //number
                    for (int n = 1; n<=i*2-1;n++)
                        System.out.print((2*i-1));
                    
                    


                    //symbol 2 
                    System.out.println(symbols);


                    //delete the symbol for next loop
                    symbols = "";
                    
                }
            

        }
    
        //4.Write a program that reads an integer input from the console and calculates and prints the sum of all the numbers starting from 1 to that number.
        public static void SumTo(Scanner input){
            System.out.println("Provide An Integer Input: ");
            int number = input.nextInt();

            int sum = 0;
            
           /* 1 = 1 
            * 2 + 1 = 3 

            1 + 2 + 3 = 6

            */

            for (int i = 1;i<=number;i++)
                for (int j = i;j>=i;j--){
                    sum += j;
                    System.out.printf("Sum of the first %d numbers are %d\n",i,sum);
                }
        }


        //todo
        //5.Write a program that reads an integer input from the console and checks and prints all prime numbers from 1 to that number using nested for loops.
        public static void Prime(Scanner input) {

            //numbers more 
            System.out.println("Enter An Integer Input ");
                int number = input.nextInt();
            
            System.out.printf("\nPrime Numbers From 1 to %d is :\n2\n",number);


            for (int i = 3;i<=number;i++){
                for (int j = 2;j<i;j++){
                    if (i%j == 0) 
                        break;

                    if (j == i-1) 
                        System.out.println(i);
                }
            }     
        }

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Which Method Do You Want To Run?");
                int method = input.nextInt();

                

            switch (method){
                //question 1 ;done
                case 1:
                    System.out.println();
                    Triangle(input);
                break;

                //question 2 ;done
                case 2:
                    System.out.println();
                    Pyramid_2(input);
                break;


                //question 3 ; done
                case 3:
                    System.out.println();
                    Pyramid_3(input);
                break;

                //question 4 ;done
                case 4:
                    System.out.println();
                    SumTo(input);     
                break;

                //question 5 ;DONE  
                case 5:
                    System.out.println();
                    Prime(input);
                break;

                default:
                    System.out.printf("\n%d is Not An Option",method);
                break;
            };

            input.close();





        }
}