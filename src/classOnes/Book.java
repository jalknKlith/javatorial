package classOnes;

public class Book {
    // ATTRIBUTE
    public int id;
    public String title;
    public String writer;
    public int pages;

    // CONSTRUCTOR
    public Book() {
    }

    //GETTERS
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getWriter() {
        return writer;
    }
    public int getPages() {
        return pages;
    }

    //SETTERS
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    //METHOD WITHOUT RETURN
    public void showBook() {
        System.out.println("The book '" + this.title + "'" + "\n" +
                "was written by '" + this.writer + "'" + "\n" +
                "and it has " + this.pages + " pages");
    }
    //METHOD WITH RETURN
    public String compareBooks(Book book1, Book book2) {
        String longer;
        if (book1.pages > book2.pages) {
            longer = "The book '" + book1.title + "'\n"+
                    "is longer than\n" + "the book '" + book2.title + "'";
        } else {
            longer = "The book '" + book2.title + "'\n"+
                    "is longer than\n" + "the book '" + book1.title + "'";
        }
        return longer;
    }
}