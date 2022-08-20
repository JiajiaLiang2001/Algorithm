public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice"),
                new Student("Bob"),
                new Student("Jack")
        };
        Student student = new Student("Jack");
        int res = LinearSearch.search(students, student);
        System.out.println(res);
    }
}
