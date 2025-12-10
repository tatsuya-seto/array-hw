import java.sql.SQLOutput;

public class Book {
    
    private int rating;
    private String title;
    private String author;
    
    public Book(int pRating){
        title = "The Psychology of Money: Timeless Lessons on Wealth, Greed, and Happiness";
        author = "Morgan Housel";
        rating = pRating;
        // TODO: set the instance variable to the parameter

    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }



    public void print(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Rating: " + rating);


    }

    
}