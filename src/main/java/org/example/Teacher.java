package org.example;

import java.util.Objects;

public class Teacher {
    private String nameOfTeacher;

    public Teacher(String nameOfTeacher){
        this.nameOfTeacher = nameOfTeacher;
    }

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "nameOfTeacher='" + nameOfTeacher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(nameOfTeacher, teacher.nameOfTeacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTeacher);
    }
}

