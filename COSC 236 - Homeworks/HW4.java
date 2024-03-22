import java.util.*;
import java.util.random.*;
public class HW4 {
    

    //question 1.1 
    static void diamond(Scanner input){
        System.out.print("Enter the size of the diamond:\n");
        final int size = input.nextInt();       
        //int size = 5; 
        float half_size = Math.round((float) (size/ 2));

        final char space = ' ';

        //top
        for (int i = 1;i<=half_size+1;i++){

            //space
            for (int s = (int)(half_size);s>=i;s--)
                System.out.print(space);

            int left;
            for (left = 1; left<i;left++)
                System.out.print(left);
     
            for (int right = left;right>=1;right--)            
                System.out.print(right);
                    
            System.out.println();
        }   
        
        //bottom
        for (int i = (int)half_size;i>=1;i--){

            //space
            for (int s = (int)(half_size);s>=i;s--)
                System.out.print(space);

            int left;
            for (left = 1; left<i;left++)
                System.out.print(left);
     
            for (int right = left;right>=1;right--)            
                System.out.print(right);
                    
            System.out.println();
        }   


    }

    

    //question 1.2 ;done
    static void triangle(Scanner input){
        System.out.print("\nEnter the size of the triangle: ");
            int size = input.nextInt(); 

            //int size = 5;
            
        for (int i = 1;i<=size;i++){
            for (int a = size;i<=a;a--){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    
    //question 1.3 ;done
    static void Random_Numbers(){
        Random random = new Random();

        int generated_number;

        do {
            //generated_number = random.nextInt(20,101);

            generated_number = random.nextInt(101-20) + 20 ;
            System.out.printf("\nGenerated number: %d",generated_number);
        }
        //while(generated_number != 20);
        while(generated_number % 10 != 0) ;
        
    }
    
    //question 1.4 ; done
    static void Number_Prompt(Scanner input){
        
        int prompt = 0;
        int maximum,minimum;

        System.out.print("\nType A Number (or -1 To Stop): ");
        minimum = input.nextInt();
        maximum = minimum;

        while (prompt != -1){
            System.out.print("Type A Number (or -1 To Stop): ");
            prompt = input.nextInt(); 
            
            if (prompt >= maximum)
                maximum = prompt;
            
            if (minimum >= prompt && prompt != -1)
                minimum = prompt;
        }
           
        System.out.printf("\nMaximum was %d",maximum);
        System.out.printf("\nMinimum was %d",minimum);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        diamond(input); //1
        triangle(input); // 2
        Random_Numbers(); // 3
        Number_Prompt(input); // 4 


        input.close();
    }
}
