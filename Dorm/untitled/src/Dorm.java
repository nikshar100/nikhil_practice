public class Dorm {
    private String dormName;
    Student[] students;
    int count;

    public Dorm(String dormName, int count) {
        this.dormName = dormName;
        this.students = new Student[count];
        this.count = 0;
    }

    public boolean addStudent(Student s) {
        if (count < students.length) {
            this.count += 1;
            s = this.students[count];
        }
        else {
            throw new ArrayIndexOutOfBoundsException();
        }
        return true;
    }


}
