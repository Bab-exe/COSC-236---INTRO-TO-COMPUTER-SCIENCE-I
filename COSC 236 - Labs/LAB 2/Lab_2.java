public class Lab_2{
    //part 1 
    public static void pattern(){
        
        for (int i = 0;i<3;i++)
           System.out.println("************");

        for (int i = 0;i<3;i++)
            System.out.println("   ******");
        
        for (int i=0;i<3;i++)
            System.out.println("    ****");
        
        System.out.print("     **");
    }

    //part 2 
    public static void factorial(){
        int factorial=1 ;
        float average=0;

        for (int i=1;i<=30;i++)
            factorial *= i;
    
        average = factorial/30;

        System.out.println("The factorial of 30 numbers are: " + factorial);
        System.out.println("The average of the factorial is: " + average);
    }
    
    //part 3 
    public static void area(){
        final double PI = 3.14;

        for (int i=1;i<=10;i++)
            System.out.println("When radius is " + i + " area is: " + (4 * PI * (i * i)));

    }

    //part 4 
    public static void fibonacci(){

        System.out.print("First 15 numbers of the fibonnacci series are: 0 1 ");

        int first=0,second=1,third=0;
        for (int i=0;i<=13;i++){
            third = first+second;

            System.out.print(third + " ");

            first = second;
            second = third;
        }  
    }

    public static void main(String[] args) {

        //part 1
        pattern(); 
            System.out.println("\n");

        //part 2
        factorial();
            System.out.println("\n");

        //part 3 
        area();
            System.out.println("\n");

        //part 4 
        fibonacci();
            System.out.println("\n");
    }
}