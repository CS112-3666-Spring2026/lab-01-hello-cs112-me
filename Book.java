public class Book {

    private String title;

    public Book() {
        title = "unknown";
    }

    public Book(String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String toString() {
        return "Book title: " + title;
    }

    public boolean equals(Book anotherBook) {
        if (anotherBook == null) {
            return false;
        }
        return this.title.equals(anotherBook.title);
    }

    //Hacker Challenge
    public Book(Book anotherBook) {
        this.title = anotherBook.title;
    }
}