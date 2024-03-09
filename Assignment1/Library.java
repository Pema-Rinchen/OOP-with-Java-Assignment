import java.util.ArrayList;
import java.util.List;

// Author class
class Author {
    private String name;
    private String bio;
    
    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getBio() {
        return bio;
    }
    
    public void setBio(String bio) {
        this.bio = bio;
    }
}

// Book class
class Book {
    private String title;
    private List<Author> authors;
    private int yearPublished;
    
    public Book(String title, List<Author> authors, int yearPublished) {
        this.title = title;
        this.authors = authors;
        this.yearPublished = yearPublished;
    }
    
    // Getters and setters
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public List<Author> getAuthors() {
        return authors;
    }
    
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    
    public int getYearPublished() {
        return yearPublished;
    }
    
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}

// Library class
class Library {
    private List<Book> books;
    
    public Library() {
        this.books = new ArrayList<>();
    }
    
    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }
    
    // Method to remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }
    
    // Method to search for books by title
    public List<Book> searchBooksByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
    
    // Method to search for books by author
    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            for (Author author : book.getAuthors()) {
                if (author.getName().toLowerCase().contains(authorName.toLowerCase())) {
                    foundBooks.add(book);
                    break;
                }
            }
        }
        return foundBooks;
    }
    
    // Method to display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.print("Authors: ");
            for (Author author : book.getAuthors()) {
                System.out.print(author.getName() + ", ");
            }
            System.out.println("\nYear Published: " + book.getYearPublished());
            System.out.println("--------------------------");
        }
    }
}
