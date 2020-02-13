public class Main {
    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");

        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        for (String book: author.publishedBooks()) {
<<<<<<< HEAD
            System.out.println(book);
=======
            System.out.println(book + " is written by " + author.fullName() + ".");
>>>>>>> d62a0fd0be1fefa4c4ce03ce05bec7ce2599bc82
        }
    }
}
