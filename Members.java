import java.util.ArrayList;
import java.util.List;

public class Members {

    private String name;
    private String memberID;
    private List<Books> borrowedBooks;


    public Members(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
    }

    //getters
    public String getName() {return this.name;}
    public String getMemberID() {return this.memberID;}
    public List<Books> getBorrowedBooks() {return borrowedBooks;}

    //methods to manage borrowed books
    public void borrowedBooks(Books books) {borrowedBooks.add(books);}
    public void returnBooks(Books books) {borrowedBooks.remove(books);}


}
