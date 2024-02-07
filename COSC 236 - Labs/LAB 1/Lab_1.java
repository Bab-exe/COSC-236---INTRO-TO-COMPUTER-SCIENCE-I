public class Lab_1{
    //Part 1 

    public static void rocket_top(){
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
    public static void rockets(){

    }


    /* part 2
     Write a method named variables that declares two variables named x and y. Assign 73 to X and 289 to Y. Add these variables and store the result of the sum in a variable named result. Now identify the last digit of result using the % operator and store that in a variable called lastDigit. Your program should produce the following output. 
     */

    public static void variables(){
        int X = 73, Y = 289;
            int result = X + Y;

        int lastDigit = result % 10;

        System.out.println("Result of the sum: " + result);
        System.out.println("The last digit of the result is:" + lastDigit);
    }

    

    //part 3

    public static void alice_Bob(){
        double alice = 10000 + (3*100) + (5*50);
        double bob = 15780;
        double interest = (bob - 11700) / 11700;
        double aliceInterest = alice * 0.15;
        alice += aliceInterest;
        System.out.println("Alice will have: " + alice + " after a year");
        System.out.println("The interest rate for Bob is: " + interest + " (or " + (interest * 100) + "%)");
    }
    

    public static void main(String[] args) {

        rockets() //part1
       
        //variables(); //part 2 

        alice_Bob(); //part 3
        
    }
}

