import java.util.Scanner;

public class Lab11{

    static void Method1(Scanner Console){
        System.out.println("\nProvide A Point To Flip");
            double X = Console.nextDouble();
            double Y = Console.nextDouble();

        Point point = new Point(X,Y);
            point.flip();

        System.out.println("Flipped Point is: " + point.toString());
    }

    static void Method2(Scanner Console){
        System.out.println("\nHow many rectangles do you want to create");
            final int COUNT = Console.nextInt();

        Rectangle[] rectangles = new Rectangle[COUNT];
        
        System.out.println();
        for (int i = 0; i<COUNT;i++)
            rectangles[i] = Input_Rectangle(Console);

        int INDEX;
        boolean bad_index;
        do {
            System.out.println("\nProvide the index number of the rectangle you want to print");
                INDEX = Console.nextInt();

            bad_index = INDEX >= COUNT;
        }while(bad_index);

        System.out.println();
        System.out.println(rectangles[INDEX].toString());
    }
    /**Returns whether the given coordinates lie inside the bounds of this Rectangle. The edges are included; for example, a rectangle with [x=2,y=5,width=8,height=10] will return true for any point from (2, 5) through (10, 15) inclusive. */
    static void Method3(Scanner Console){System.out.println();

        Rectangle rectangle = Input_Rectangle(Console);

        System.out.println("\nProvide a point to check if it lies inside the rectangle ");
            final double X = Console.nextDouble();
            final double Y = Console.nextDouble();

        System.out.println(rectangle.contains(X,Y));

    }
    public static void main(String[] args){

        Scanner Console = new Scanner(System.in);

        System.out.println("Which Method Do You Want To Run?");
            final int METHOD = Console.nextInt();

        try {
            switch (METHOD){
            case 1: Method1(Console);
            break;

            case 2: Method2(Console);
            break;

            case 3: Method3(Console);
            break;

           

            default: throw new IllegalArgumentException("\nMethod " +  METHOD + " doesnt exist");
        }     
         
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            Console.close();
        }

        
        

    }

    static Rectangle Input_Rectangle(Scanner Console){
        System.out.println("Provide the starting point,width and height of the rectangle ");
            double x = Console.nextDouble();
            double y = Console.nextDouble();
            double width = Console.nextDouble();
            double height = Console.nextDouble();

        return new Rectangle(x,y,width,height);
    }
}






