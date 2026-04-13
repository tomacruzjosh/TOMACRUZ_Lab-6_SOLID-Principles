public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Juan Dela Cruz");

        // Creating various resources
        LibraryResource book = new Book("Clean Code by Robert C. Martin");
        LibraryResource journal = new Journal("IEEE Transactions on Software Engineering");
        LibraryResource audioBook = new AudioBook("The Pragmatic Programmer");

        // The student can borrow any resource without modifying the Student class
        System.out.println("--- NEU Library System ---");
        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(audioBook);
    }
}
