import java.util.Arrays;

public class Book {
    String name;
    Author[] authors;
    double price;
    int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + name +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                "]";
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();

        for (Author author : authors) {
            if (authorNames.length() > 0) {
                authorNames.append(", ");
            }
            authorNames.append(author.getName());
        }

        return authorNames.toString();
    }
}
