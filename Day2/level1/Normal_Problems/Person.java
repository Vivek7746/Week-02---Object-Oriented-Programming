class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person originalPerson = new Person("Alice", 25);
        Person clonedPerson = new Person(originalPerson);

        System.out.println("Original Person: " + originalPerson.getName() + ", Age: " + originalPerson.getAge());
        System.out.println("Cloned Person: " + clonedPerson.getName() + ", Age: " + clonedPerson.getAge());
    }
}
