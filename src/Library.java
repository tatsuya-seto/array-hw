import java.sql.SQLOutput;

public class Library {

    public String owner = "Tatsuya Seto";
    public Book[] allBooks;
    public static void main(String[] args) {
        Library lib = new Library();
    }

    public Library(){

        System.out.println("Welcome to "+ owner + "'s library!!!!!");

        allBooks = new Book[10];

       for (int i = 0; i < allBooks.length; i++){
           int randomRating = (int)(Math.random()*11);
           allBooks[i] = new Book(randomRating);
       }

       for (int i = 0; i<allBooks.length; i++){
           allBooks[i].print();
       }

       averageRating();

    }

    public void averageRating(){
       double sum = 0;
       for (Book b : allBooks){
           sum+= b.getRating();
       }

       System.out.println("Average rating: " + (sum/allBooks.length));
    }
}
