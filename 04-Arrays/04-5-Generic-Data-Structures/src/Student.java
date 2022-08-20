public class Student implements Comparable<Student> {

    private String name;
    private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.name.equals(student.name);
    }

    @Override
    public int compareTo(Student o) {
        // Sorting Rule: Smallest to Largest
        return this.score - o.score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)", name, score);
    }
}
