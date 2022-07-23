public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 89),
                new Student("Bobo", 100),
                new Student("Charles", 66)
        };
        SelectionSort.sort(students);
        for(Student student: students)
            System.out.println(student + " ");
    }
}
