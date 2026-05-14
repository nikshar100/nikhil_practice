package model;

public class Book {
    private String isbn;
    private String author;
    private String title;
    private BookType bookType;
    private BookStatus bookStatus;
    private Branch branch;

    public Book(String isbn, String author, String title, BookType bookType, BookStatus bookStatus, Branch branch) {
        int dashCount = 0;
        for (int i = 0; i < isbn.length(); i++) {
            if (isbn.charAt(i) == '-') {
                dashCount++;
            }
        }
        if (dashCount != 4 || isbn.isEmpty() || isbn == null) {
            throw new IllegalArgumentException("Invalid ISBN.")
        }
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.bookType = bookType;
        this.bookStatus = bookStatus;
        this.branch = branch;
    }


    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public BookType getBookType() {
        return bookType;
    }

    public Branch getBranch() {
        return branch;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
