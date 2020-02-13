/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private ArrayList<String> books = new ArrayList<String>();

    @SuppressWarnings("unchecked")

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @SuppressWarnings("unchecked")
    @Deprecated
    @SuppressWarnings("unchecked")
    public List<String> getBooks() {
        return books;
    }

    @SuppressWarnings("unchecked")
    public List<String> publishedBooks() {
        return books;
    }

    @SuppressWarnings("unchecked")
    public void addBook(String book) {
        books.add(book);
    }
    @SuppressWarnings("unchecked")
    @Override
    public String fullName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
