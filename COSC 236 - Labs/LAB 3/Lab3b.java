import java.util.Scanner;
public class Lab3b{

    public static String subString(String text, int begin, int end){
        if (begin < 0 || end > text.length() - 1)
            return String.format("String length: %d\nbegin: %d\nend: %d",text.length(),begin,end);

        return "The substring is: " + text.substring(begin, end);
    }

    public static String birthday(String day, String month, String year) {
        return month+ "/" +day+ "/" +year;
    }
    
    public static void lastLetter(String name){

        String first = name.substring(0, name.indexOf(" "));
        String last = name.substring(name.indexOf(" "));
     
        char f = first.charAt(first.length() - 1);
        char l = last.charAt(last.length() - 1);

        System.out.print("The last letter of your first name is: '" + f);
        System.out.println("' and The last letter of your last name is: '" + l + "'");
        
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //question 1 
        System.out.println("Provide a word and two indices for indentifying a substring:");
           String word = input.next();
           int begin = input.nextInt();
           int end = input.nextInt();
                System.out.println(subString(word,begin,end));

        //question 2 
        System.out.println("\nProvide the day of your birthday: ");
            String day = input.next();
       
        System.out.println("Provide the month of your birthday: ");
            String month = input.next();

        System.out.println("Provide the year of your birthday: ");
            String year = input.next();

        System.out.println("Your birthdate is: " + birthday(day,month,year) + '\n');

      
        input.nextLine(); /* note to self: when u use Scanner.next() u gotta add a standalone thing like this for it to not do weird stuff : figuring this out took longer than the whole lab*/

        //question 3 
        System.out.println("Provide your first and last name:");

        String name = input.nextLine();
            lastLetter(name);

        input.close();
    }
}
