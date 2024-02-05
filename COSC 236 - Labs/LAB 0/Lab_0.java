public class Lab_0 {

   /*
      **My Profile**
      Name:
      Major
      Track:
      Student ID:
      Year:
   */
   public static void Part_1(){
      System.out.println("**My Profile**");
      System.out.println("Name:");
      System.out.println("Major");
      System.out.println("Track:");
      System.out.println("Student ID:");
      System.out.println("Year:");
   }
   
   /*
      Elon Musk just changed the name of "Twitter" to "X"
      The Environmental path of Java is set to "C:\Program Files (x86)\Java\JDK\"
      This program's from the first lab
   */
   public static void Part_2(){
         String java_path = "\"C:\\Program Files (x86)\\Java\\JDK\\\""; //the java path string 
      
      System.out.println("Elon Musk just changed the name of \"Twitter\" to \"X\"");
      System.out.println("The Environmental path of Java is set to " + java_path);
      System.out.println("This program's from the first lab");
   }
   
   /* 
     ***
    *****
   *******
    *****
     ***
 */
   public static void Part_3(){
      System.out.println("  ***");
      System.out.println(" *****"); 
      System.out.println("*******"); 
      System.out.println(" *****");
      System.out.println("  ***");
   }
    
       /*\     4   
     //***\\   2 
    //*****\\  1
    \\*****//* 1 
     \\***//*  2 */
//     \*/*    4*/ 
   public static void Part_4(){      
      System.out.println("    " + "/*\\");
      System.out.println("  " + "//***\\\\");
      System.out.println(" " + "//*****\\\\");
      System.out.println(" " + "\\\\*****//");
      System.out.println("  " + "\\\\***//");
      System.out.println("    " + "\\*/");
   }

   /*
      Mixing the dry ingredients 
      Add eggs 
      Add milk
      Preheat the oven
      Set the timer
      Turn off the Oven
   */
   public static void Part_5(){
      System.out.println("Mixing the dry ingredients");
      System.out.println("Add eggs");
      System.out.println("Add milk");
      System.out.println("Preheat the oven");
      System.out.println("Set the timer");
      System.out.println("Turn off the Oven");
   }
  
   //part 6 is just part_4 x2
   public static void Part_6(){
      Part_4();
      Part_4();
   }
   public static void main(String[] args){

      System.out.println("\n1.");
         Part_1(); //finished

      System.out.println("\n2.");
         Part_2(); //finished

      System.out.println("\n3.");
         Part_3(); //finished

      System.out.println("\n4.");
         Part_4(); //finished

      System.out.println("\n5.");
         Part_5(); //finished 
   
      System.out.println("\n6.");
         Part_6(); //finished
   }
}

