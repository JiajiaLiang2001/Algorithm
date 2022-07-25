public class Main {
    public static void main(String[] args) {
        Array<Student> students = new Array<>();
        students.addLast(new Student("Alice", 100));
        students.addLast(new Student("Bob", 98));
        students.addLast(new Student("Jack", 66));
        System.out.println(students);
    }
}
