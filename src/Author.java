/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List books;
    @SuppressWarnings("unchecked")
    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
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
<<<<<<< HEAD
=======

>>>>>>> 21c0da314beb4bbf0de18bab3fd8425347b28c49
    @SuppressWarnings("unchecked")
    public List<String> publishedBooks() {
        return books;
    }
<<<<<<< HEAD
=======

>>>>>>> 21c0da314beb4bbf0de18bab3fd8425347b28c49
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
