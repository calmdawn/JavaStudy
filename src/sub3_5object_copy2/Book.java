package sub3_5object_copy2;

public class Book{
    String bookName;
    String author;

    public Book(String bookName, String writer) {
        this.bookName = bookName;
        this.author = writer;
    }

    public void showBookInfo(){
        System.out.println(bookName + ", " + author);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
