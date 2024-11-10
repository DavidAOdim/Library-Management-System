

public class Books {

    private String title;
    private String author;
    private boolean isAvailable;
    private String interStandBookNum;


    public Books(String title, String author, String interStandBookNum) {
        this.title = title;
        this.author = author;
        this.interStandBookNum = interStandBookNum;
        this.isAvailable = true;
    }

    //getter
    public String getTitle() {return this.title;}
    public String getAuthor() {return this.author;}
    public String getInterStandBookNum() {return this.interStandBookNum;}
    public boolean isAvailable() {return isAvailable;}

    //methods to update book availability
    public void borrowBook() {this.isAvailable = false;}
    public void returnBook() {this.isAvailable = true;}





}
