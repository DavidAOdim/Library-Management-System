import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LibraryManagementSystem {
    public static void main(String[] args) {
        //can add, lend, and return books. The system should manage books, members, and borrowing records.

        Library library = new Library();

        Books[] books = getBooks();
        for (Books book : books) {
            library.addBook(book);
        }
        Members[] members = getMembers();

        for (Members member : members) {
            library.registerMember(member);
        }

        library.displayAvailableBooks();


        //lend and return books
        System.out.println(library.lendBook("978-0061120084", "MEM005"));
        System.out.println(library.lendBook("978-1503290563", "MEM0013"));
        System.out.println(library.lendBook("978-0743273565", "MEM009"));
        System.out.println(library.lendBook("978-0060850524", "MEM0015"));
        System.out.println(library.lendBook("978-1451673319", "MEM0017"));
        System.out.println(library.lendBook("978-0544003415", "MEM006"));
        System.out.println(library.lendBook("978-0061122415", "MEM003"));
        System.out.println(library.lendBook("978-0316769488", "MEM0012"));
        System.out.println(library.lendBook("978-0553380163", "MEM0014"));

        library.displayAvailableBooks();
        library.displayMemberBorrowedBooks("MEM005");


    }

    private static Members[] getMembers() {
        Members member1 = new Members("Alice Johnson", "MEM001");
        Members member2 = new Members("Bob Smith", "MEM002");
        Members member3 = new Members("Charlie Brown", "MEM003");
        Members member4 = new Members("Diana Evans", "MEM004");
        Members member5 = new Members("Ethan Hunt", "MEM005");
        Members member6 = new Members("Fiona Garcia", "MEM006");
        Members member7 = new Members("George Martin", "MEM007");
        Members member8 = new Members("Hannah Lee", "MEM008");
        Members member9 = new Members("Ian Wright", "MEM009");
        Members member10 = new Members("Julia Roberts", "MEM010");
        Members member11 = new Members("Kevin Tran", "MEM011");
        Members member12 = new Members("Laura Palmer", "MEM012");
        Members member13 = new Members("Michael Scott", "MEM013");
        Members member14 = new Members("Natalie King", "MEM014");
        Members member15 = new Members("Olivia Adams", "MEM015");
        Members member16 = new Members("Peter Parker", "MEM016");
        Members member17 = new Members("Quinn Harper", "MEM017");
        Members member18 = new Members("Rachel Green", "MEM018");
        Members member19 = new Members("Steve Rogers", "MEM019");
        Members member20 = new Members("Tina Chen", "MEM020");

        Members[] members = {member1, member2, member3, member4, member5, member6, member7, member8, member9, member10,
        member11, member12, member13, member14, member15, member16, member17, member18, member19, member20};
        return members;
    }

    private static Books[] getBooks() {
        Books book1 = new Books("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0545069670");
        Books book2 = new Books("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Books book3 = new Books("1984", "George Orwell", "978-0451524935");
        Books book4 = new Books("Pride and Prejudice", "Jane Austen", "978-1503290563");
        Books book5 = new Books("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Books book6 = new Books("Moby-Dick", "Herman Melville", "978-1503280786");
        Books book7 = new Books("War and Peace", "Leo Tolstoy", "978-1420951318");
        Books book8 = new Books("The Catcher in the Rye", "J.D. Salinger", "978-0316769488");
        Books book9 = new Books("The Hobbit", "J.R.R. Tolkien", "978-0547928227");
        Books book10 = new Books("Brave New World", "Aldous Huxley", "978-0060850524");
        Books book11 = new Books("Fahrenheit 451", "Ray Bradbury", "978-1451673319");
        Books book12 = new Books("The Lord of the Rings", "J.R.R. Tolkien", "978-0544003415");
        Books book13 = new Books("The Alchemist", "Paulo Coelho", "978-0061122415");
        Books book14 = new Books("The Catcher in the Rye", "J.D. Salinger", "978-0316769488");
        Books book15 = new Books("Slaughterhouse-Five", "Kurt Vonnegut", "978-0385333849");
        Books book16 = new Books("The Handmaid's Tale", "Margaret Atwood", "978-0385490818");
        Books book17 = new Books("A Brief History of Time", "Stephen Hawking", "978-0553380163");
        Books book18 = new Books("The Road", "Cormac McCarthy", "978-0307387899");
        Books book19 = new Books("The Art of War", "Sun Tzu", "978-1590302255");
        Books book20 = new Books("Thinking, Fast and Slow", "Daniel Kahneman", "978-0374533557");


        return new Books[]{book1, book2, book3, book4, book5, book6, book7, book8, book9, book10,
        book11, book12, book13, book14, book15, book16, book17, book18, book19, book20};
    }
}