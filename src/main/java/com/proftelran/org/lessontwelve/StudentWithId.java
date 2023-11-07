package com.proftelran.org.lessontwelve;

import java.util.Objects;

public class StudentWithId {

    private String name;

    private String surname;

    private int id;

    public StudentWithId(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentWithId that = (StudentWithId) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
