public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // High-level module depends on abstraction (LibraryResource), NOT concrete details
    public void borrowResource(LibraryResource resource) {
        System.out.print(name + " is ");
        resource.borrow();
    }
}
