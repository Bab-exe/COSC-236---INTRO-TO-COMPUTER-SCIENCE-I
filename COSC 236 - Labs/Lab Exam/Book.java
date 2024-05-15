/** Create a Java class called Book with attributes for title, author, and ISBN. Include a
constructor to initialize these attributes with three parameters. Implement a method,
toString(), to print the book details. Demonstrate this functionality in the main method
which resides in the client class by creating a Book object using the constructor, setting
values, and printing the book information */

public class Book {
    private String TITLE,AUTHOR;

    private long ISBN;

    public Book(String title,String author,int isbn){
        this.TITLE = title;
        this.AUTHOR = author;
        this.ISBN = isbn;
    }

    @Override
    public String toString(){
        
        return String.format
        (
        "\nBook Information:\n" +
        " Title: %s\n" +
        " Author: %s\n" +
        " ISBN: %s\n",

        this.TITLE,
        this.AUTHOR,
        this.ISBN
        );
    }
}

