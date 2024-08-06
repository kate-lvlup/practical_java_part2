package jom.com.softserve.s2.task3;

import java.util.Objects;

public class Student extends Person{
    private String studyPlace;
    private int studyYears;

    public Student(String name, String studyPlace, int studyYears) {
        super(name);
        this.studyPlace = studyPlace;
        this.studyYears = studyYears;
    }

    public String getStudyPlace() {
        return studyPlace;
    }

    public int getStudyYears() {
        return studyYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studyYears == student.studyYears && Objects.equals(studyPlace, student.studyPlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studyPlace, studyYears);
    }

    @Override
    public String toString() {
        return "Student{name = " + getName() +
                "studyPlace='" + studyPlace + '\'' +
                ", studyYears=" + studyYears +
                '}';
    }
}
