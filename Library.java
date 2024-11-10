import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Books> books;
    private List<Members> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    //add or remove books from library collection

    public void addBook(Books book) {
        books.add(book);
    }

    public void removeBook(Books book) {
        books.remove(book);
    }

    //register new member
    public void registerMember(Members member) {
        members.add(member);
    }

    //lending books to members if book is available

    public String lendBook(String isbn, String memberID) {
        Books book = findBookByISBN(isbn);
        Members member = findMemberByID(memberID);

        if (book == null) return "Book not found.";
        if (member == null) return "Member not found.";
        if(!book.isAvailable()) return "Book is currently unavailable";

        book.borrowBook();
        member.borrowedBooks(book);
        return "Book borrowed successfully.";
    }

    //return a book that was borrowed by a member
    public String returnBook(String isbn, String memberID) {
        Books book = findBookByISBN(isbn);
        Members member = findMemberByID(memberID);

        if (book == null) return "Book not found.";
        if (member == null) return "Member not found.";
        if (!member.getBorrowedBooks().contains(book)) return "Member did not borrow this book.";

        book.returnBook();
        member.returnBooks(book);
        return "book returned successfully.";
    }

    //display available books
    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Books book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

    //display books borrowed by a member
    public void displayMemberBorrowedBooks(String memberID) {
        Members member = findMemberByID(memberID);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        System.out.println("Books borrowed by " + member.getName() + ":");
        for (Books book : member.getBorrowedBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }

    //helper method to find book by ISBN
    private Books findBookByISBN(String isbn) {
        for (Books book : books) {
            if (book.getInterStandBookNum().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    //helper method to find a member by ID
    private Members findMemberByID(String memberID) {
        for (Members member : members) {
            if (member.getMemberID().equals(memberID)) {
                return member;
            }
        }
        return null;
    }
}
