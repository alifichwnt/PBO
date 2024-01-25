public class Main {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("John Doe", "john.doe@example.com", 'M');
        Author author2 = new Author("Jane Smith", "jane.smith@example.com", 'F');

        // Create an array of authors
        Author[] authors = { author1, author2 };

        // Create a book using the authors array
        Book book = new Book("Sample Book", authors, 29.99);

        // Print book details using toString()
        System.out.println("Book Details:");
        System.out.println(book);

        // Update the price and quantity of the book
        book.setPrice(39.99);
        book.setQty(100);

        // Print updated book details
        System.out.println("\nUpdated Book Details:");
        System.out.println(book);

        // Print author names using getAuthorNames()
        System.out.println("\nAuthor Names: " + book.getAuthorNames());

        // Update the email of the first author
        authors[0].setEmail("john.doe.updated@example.com");

        // Print updated author names
        System.out.println("\nUpdated Author Names: " + book.getAuthorNames());
    }
}
